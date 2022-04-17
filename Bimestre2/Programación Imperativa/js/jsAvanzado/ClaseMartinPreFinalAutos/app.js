// Una carrera de autos
// Introducción
// Ahora que ya tenemos todos los conceptos principales aprendidos, es hora de combinarlos para construir una aplicación completa de principio a fin.
// Para esta práctica vamos a estar modelando una carrera de autos, y decimos modelando porque vamos a armar un modelo usando Javascript que pueda representar una carrera real y nos permita simular sus resultados determinando los puestos en los que quedarían los corredores.

// La estructura de los datos
// Para representar a los corredores, tendremos un archivo JSON que contendrá un array de objetos literales. Es muy importante que te familiarices con este tipo de estructuras de datos, porque es de las que más se usan en el mundo de la programación web 😎👌.
// Antes de ponernos a resolver las consignas es muy importante que sepamos con qué datos vamos a contar, veamos uno de los elementos del array.
// {
//     	"piloto": "Monah Lyal",
//     	"patente": "ABC123",
//     	"velocidad": 161,
//     	"aceleracion": 0.31,
//     	"anguloDeGiro": 272,
//     	"cilindrada": 1500,
//     	"peso": 262.7,
//     	"puntaje": 76,
//     	"sancionado": false
// },

// No te preocupes si luego no utilizamos todos los datos aquí contenidos, es habitual que nos llegue más información de lo necesario.
// Tampoco te preocupes si los valores no tienen tanto sentido, en muchos casos, son auto-generados 🤖✨.
// Ahora que sabemos con qué datos vamos a contar, es hora de empezar a programar, vamos con las consignas.
// Consignas
// A continuación te planteamos varios desafíos que deberás resolver usando tu ingenio y lo aprendido hasta el momento.
// Es probable que no puedas terminar todos estos ejercicios durante el tiempo que tiene la mesa de trabajo, no te preocupes, lo importante es que los termines luego a tu ritmo para asegurarte de haber comprendido cómo llevar todo a la práctica.
// En caso de que te queden dudas, no olvides usar el formulario, consultar por Discord y traer las dudas que queden después de eso a la próxima clase.
// Sin más preámbulos, vamos con las consignas.

// const archivos = require("./lecturaEscritura")

// 1. Obtener el listado de posibles participantes
// Tomando como base el siguiente archivo JSON,
// Leer el archivo utilizando el módulo correspondiente de Node
// Parsearlo utilizando las herramientas que te provee Javascript
// Resultado esperado: un array de objetos modificado correctamente para que funcione con las herramientas de JavaScript.

const archivos = require(__dirname + "/lecturaEscritura")
const arrayAutos = archivos.leerJson("autos")

console.table(arrayAutos)

// 2. Crear un objeto literal que represente la carrera
// Este objeto literal, que podemos llamar carrera, será nuestra representación de la carrera (valga la redundancia) con su datos (propiedades) y sus funcionalidades (métodos).
// Agregar una propiedad llamada autos que contenga los autos obtenidos en el punto anterior.

const carrera = {
  autos: arrayAutos,
  // Agregar una propiedad llamada autosPorTanda que contenga el valor 6. Este valor representará la cantidad máxima de autos por tanda.
  autosPorTanda: 6,

  // Agregar un método autosHabilitados, que retorne todos los autos habilitados, es decir, aquellos que no estén sancionados.
  // Este método no recibirá ningún parámetro.
  // Este método devolverá un array con los autos que estén habilitados para correr.
  autosHabilitados() {
    return this.autos.filter((element) => element.sancionado === false)
  },

  // Agregar un método listarAutos que reciba como parámetro un array de autos e imprima por consola la siguiente información:
  // El nombre piloto
  // La placa o patente del auto
  // La velocidad
  // El peso del auto
  // El estado del piloto
  // “sancionado” → si sancionado es true
  // “habilitado” → sí sancionado es false
  // PD: Este método deberá ser utilizado en la ejecución de los demás métodos que retornan un array de vehículos.
  // Resultado esperado al ejecutar el método: un mensaje por consola por cada auto con el siguiente formato:
  // Piloto: ______, patente: ______, velocidad: ______, peso en kg: ______, estado: ______.
  // Ejemplos:
  // Piloto: Leandro Ezequiel, patente: ABC123, velocidad: 160km/h, peso en kg: 267, estado: habilitado.
  // Piloto: Esteban Piazza , patente: EFG567, velocidad: 160km/h, peso en kg: 357, estado: sancionado.
  listarAutos(array) {
    array.forEach((element) => {
      const sancionado = element.sancionado ? "habilitado" : "sancionado"
      console.log(
        `Piloto: ${element.piloto}, patente: ${element.patente}, velocidad: ${element.velocidad}, peso en kg: ${element.peso}, estado: ${sancionado}. `
      )
    })
  },
  // Agregar un método buscarPorPatente que permita buscar el auto en función de su patente.
  // Este método recibirá por parámetro un string que represente la patente a buscar
  // En caso de encontrar un auto con la patente buscada, devolverá el objeto literal que lo representa.
  // En caso contrario devolverá undefined

  buscarPorPatente(patente) {
    return this.autos.find((element) => element.patente === patente)
  },
  // Agregar un método filtrarPorCilindrada que permite filtrar los autos habilitados, siempre y cuando su propiedad cilindrada sea menor o igual a la cilindrada enviada como argumento.
  // Este método recibirá por parámetro un number que represente la cilindrada máxima a buscar.
  // Este método devolverá un array con todos los autos que cumplan con la condición mencionada.
  // En caso de no encontrar ningún auto, devolverá un array vacío.
  // Este método debe usar autosHabilitados para buscar incluir solamente aquellos autos que estén habilitados.
  filtrarPorCilindrada(cilindradaMax) {
    const autosHabilitados = this.autosHabilitados()
    return autosHabilitados.filter(
      (element) => element.cilindrada <= cilindradaMax
    )
  },

  // Agregar un método ordenarPorVelocidad que ordene todos los autos de menor a mayor según su velocidad.
  // Este método devolverá un array con todos los autos ordenados por velocidad.
  // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.

  //evalua -1 1 y 0

  ordenarPorVelocidad() {
    return this.autos.sort((a, b) => a.velocidad - b.velocidad) //10-5=5, si es positivo entonces a>bentonces vaya al final
  },

  ordenarPorNombrePiloto() {
    return this.autos.sort((a, b) => {
      if (a.piloto < b.piloto) return -1
      if (a.piloto > b.piloto) return 1
      return 0
    }) //10-5=5, si es positivo entonces a>bentonces vaya al final
  },

  ordenarPorNombrePilotoDescendente() {
    return this.autos.sort((a, b) => {
      if (a.piloto > b.piloto) return -1
      if (a.piloto < b.piloto) return 1
      return 0
    }) //10-5=5, si es positivo entonces a>bentonces vaya al final
  },
  // Agregar un método habilitarVehiculo que permita habilitar un vehículo en función de su patente y guardar los cambios en el archivo JSON.
  // Este método recibirá por parámetro un string que represente la patente a buscar
  // En caso de encontrar un auto con la patente buscada:
  // Cambiará el valor de la propiedad sancionado a false.
  // Escribirá los cambios en el archivo JSON que contiene los vehículos.
  // Devolverá el auto modificado
  // En caso contrario devolverá undefined

  habilitarVehiculo(patente) {
    const auto = this.buscarPorPatente(patente)
    if (auto) {
      auto.sancionado = false
      archivos.escribirJson("autos", this.autos)
    }
    return auto
  },

  // Agregar un método generarTanda que permita retornar un array de autos, que cumplan con las siguientes condiciones:
  // Su piloto está habilitado.
  // Su cilindrada sea menor o igual al valor enviado como argumento.
  // Su peso sea menor o igual a un valor enviado como argumento.
  // La cantidad devuelta sea como máximo la expresada en la propiedad autosPorTanda.
  // 	Para este método vamos a dejar que vos determines los parámetros que debería recibir.
  // Te recomendamos que pienses qué métodos de los que ya programaste podés reutilizar en este paso 😉.

  generarTanda(cilindrada, peso) {
    const autos = this.filtrarPorCilindrada(cilindrada)
    const autosPorPeso = autos.filter((auto) => auto.peso <= peso)
    autosPorPeso.splice(this.autosPorTanda)
    return autosPorPeso
  },

  // Agregar un método llamado pesoPromedio, que me permita saber cual es el peso promedio de los vehículos que componen la tanda
  // El método deberá reutilizar generarTanda
  // Deberá retornar un mensaje indicando el peso promedio de los autos.

  pesoPromedio(cilindrada, peso) {
    const tanda = this.generarTanda(cilindrada, peso)
    const suma = tanda.reduce((acc, auto) => acc + auto.peso, 0)
    return (suma / tanda.length).toFixed(2)
  },
  // Agregar un método listarPodio, que calcule el podio en función del puntaje de los pilotos y muestre el resultado por consola.
  // El método recibirá como parámetro un array de autos. Los mismos deberán ser generados con generarTanda.
  // El método ordenará por puntaje los autos recibidos.
  // El método imprimirá por consola los tres primeros puestos.
  // Resultado esperado al ejecutar el método: un mensaje por consola por cada auto con el siguiente formato:

  listarPodio(tanda) {
    const podio = tanda.sort((a, b) => b.puntaje - a.puntaje)
    console.log(
      `El ganador es: ${podio[0].piloto}, con un puntaje de ${podio[0].puntaje}.`
    )
    console.log(
      `El segundo puesto es para ${podio[1].piloto}, con un puntaje de ${podio[1].puntaje}.`
    )
    console.log(
      `El tercer puesto es para ${podio[2].piloto}, con un puntaje de ${podio[2].puntaje}.`
    )
  },
  // El ganador es: ______, con un puntaje de ______.
  // El segundo puesto es para ______, con un puntaje de ______.
  // El tercer puesto es para ______, con un puntaje de ______.
  // Ejemplo:
  // El ganador es: Leandro Ezequiel, con un puntaje de: 70.
  // El segundo puesto es para Martin Cejas, con un puntaje de 55.
  // El tercer puesto es para Nicolas Lopez, con un puntaje de 52.

  

  calcularPuntajeTotal() {
    return this.autos.reduce((acc, auto) => acc + auto.puntaje, 0)
  },
}
console.log("*******_____________autosHabilitados()__________******")
console.table(carrera.autosHabilitados())
console.log("*******_____________listarAutos()__________******")
carrera.listarAutos(arrayAutos)
console.log("*******_____________buscarPorPatente()__________******")
console.table(carrera.buscarPorPatente("JQK433"))
console.log("*******_____________filtrarPorCilindrada()__________******")
carrera.listarAutos(carrera.filtrarPorCilindrada(1500))
console.log("*******_____________ordenarPorVelocidad()__________******")
carrera.listarAutos(carrera.ordenarPorVelocidad())
console.log("*******_____________ordenarPorNombrePiloto()__________******")
carrera.listarAutos(carrera.ordenarPorNombrePiloto())
console.log(
  "*******_____________ordenarPorNombrePilotoDescendente()__________******"
)
carrera.listarAutos(carrera.ordenarPorNombrePilotoDescendente())
console.log("*******_____________habilitarVehiculo()__________******")
console.log(carrera.habilitarVehiculo("JHV223"))
console.log("*******_____________calcularPuntajeTotal()__________******")
console.log(carrera.calcularPuntajeTotal())
console.log("*******_____________generarTanda()__________******")
carrera.listarAutos(carrera.generarTanda(3000, 3000))
console.log("*******_____________pesoPromedio()__________******")
console.log(carrera.pesoPromedio(3000, 3000))

console.log("*******_____________listarPodio()__________******")
carrera.listarPodio(carrera.generarTanda(3000, 3000))
