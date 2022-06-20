const jsonHelper = require("./jsonHelper")

const v = "\x1b[32m%s\x1b[0m" // NO TOCAR
const o = "*".repeat(80) + "\n" // NO TOCAR
const oo = "*".repeat(25) // NO TOCAR

const archivo = require(__dirname + "/jsonHelper")
/*******************************/
/* Desarrollo de las consignas */
/*******************************/

const arrayBicicletas = archivo.leerJson("bicicletas")
// // A
// Crear un objeto literal que represente la aplicación.
// El objeto será la representación de nuestra carrera

const carrera = {
  // // B
  // Agregar una propiedad llamada bicicletas en la que asignarás las bicicletas obtenidas a partir del método leer del objeto requerido como módulo
  bicicletas: arrayBicicletas,
  // // C
  // Agregar una propiedad llamada bicicletasPorTanda que contenga el valor 4. Este valor representará la cantidad máxima de bicicletas por tanda.
  bicicletasPorTanda: 4,
  // // D
  // Agregar un método listarBicicletas que reciba como parámetro un array de ciclistas e imprima por consola la siguiente información:
  listarBicicletas(arrayBicicletas) {
    arrayBicicletas.forEach((element) => {
      const habilitado = element.dopaje ? "inhabilitado" : "habilitado"
      console.log(
        `Ciclista: ${element.ciclista}, marca: ${element.marca},  rodado: ${element.rodado}, peso: ${element.peso} kg, largo: ${element.largo} cm, estado: ${habilitado}.`
      )
    })
  },
  // // E
  // Agregar un método ciclistasHabilitados que devuelva una lista donde los ciclistas tengan un dopaje negativo.
  // Este método no recibirá ningún parámetro.
  // Este método devolverá un array con los ciclistas que estén habilitados para correr.

  ciclistasHabilitados() {
    return this.bicicletas.filter((bici) => !bici.dopaje)
  },
  // // F
  // Agregar un método buscarPorId que permita buscar un ciclista en función de su id.
  // Este método recibirá por parámetro un number que represente el id a buscar
  // En caso de encontrar un ciclista con el id buscado, devolverá el objeto literal que lo representa.
  // En caso contrario devolverá undefined
  buscarPorId(id) {
    return this.bicicletas.find((bici) => bici.id === id)
  },

  // // G
  // Agregar un método filtrarPorPeso que permita filtrar los ciclistas habilitados, siempre y cuando su peso sea menor o igual al enviado como argumento.
  // Este método recibirá por parámetro un number que represente el peso a buscar.
  // Este método devolverá un array con todos los ciclistas que cumplan con la condición mencionada.
  // En caso de no encontrar ningún ciclista, devolverá un array vacío.
  // Este método debe usar ciclistasHabilitados para buscar incluir solamente aquellos autos que estén habilitados.
  filtrarPorPeso(pesoBici) {
    const ciclistasHabilitados = this.ciclistasHabilitados()
    return ciclistasHabilitados.filter((bici) => bici.peso <= pesoBici)
  },

  // // H
  // Agregar un método ordenarPorRodado que ordene todas las bicicletas de menor a mayor según su rodado.
  // Este método devolverá un array con todos las bicicletas ordenadas por rodado.
  // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.
  ordenarPorRodado() {
    return this.bicicletas.sort((a, b) => a.rodado - b.rodado)
  },

  // // I
  // Agregar un método largoPromedio que permita saber el largo promedio de todas las bicicletas.
  // Este método no recibirá ningún parámetro.
  // Este método devolverá un mensaje indicando la información solicitada.
  largoPromedio() {
    const sumaLargo = this.bicicletas.reduce(
      (acum, bici) => acum + bici.largo,
      0
    )
    const promedio = (sumaLargo / this.bicicletas.length).toFixed(2)
    return `el promedio de todas las bicis es ${promedio}`
  },

  // // J
  // Agregar un método aumentarPeso, el cual deberá aumentar el peso de una bicicleta y guardar los cambios en la base de datos.
  // El método recibirá por parámetro un número indicando la cantidad a aumentar (en kg) y un id, y debe reutilizar el método buscarPorId.
  // en caso de encontrar una bicicleta con dicho id deberá:
  // Aumentar su peso (sumar la cantidad indicada a la existente)
  // Guardar los datos en el archivo JSON.

  aumentarPeso(pesoAumentar, idBici) {
    const bici = this.buscarPorId(idBici)
    if (bici) {
      bici.peso += pesoAumentar
      archivo.escribirJson("bicicletas", this.bicicletas)
      return bici
    }
    return "bici no encontrada"
  },
  // // K
  // Agregar un método generarTanda que retorna un array de ciclistas, que cumplan con las siguientes condiciones:
  // El ciclista esté habilitado
  // El rodado sea menor o igual al valor enviado como argumento
  // El peso sea mayor o igual al valor enviado como argumento
  // La cantidad devuelta sea como máximo la expresada en la propiedad bicicletasPorTanda.
  // Para este método vamos a dejar que vos determines los parámetros que debería recibir.
  // Te recomendamos que pienses qué métodos de los que ya programaste podés reutilizar en este paso 😉.
  generarTanda(rodado, peso) {
    const ciclistasHabilitados = this.ciclistasHabilitados()
    const filtradosXPeso = ciclistasHabilitados.filter(
      (bici) => bici.peso >= peso && bici.rodado <= rodado
    )
    return filtradosXPeso.slice(0, this.bicicletasPorTanda)
  },

  // // L
  // Agregar un método que permita calcularPodio, el mismo deberá calcular al ganador y los siguientes dos puestos en función de su puntaje.
  // El método recibirá como parámetro un array de ciclistas. Los mismos deberán ser generados con generarTanda.
  // El método ordenará por puntaje los ciclistas recibidos.
  // El método imprimirá por consola los tres primeros puestos.
  calcularPodio(arrayCiclistas) {
    const podio = arrayCiclistas
      .sort((a, b) => b.puntaje - a.puntaje)
      .slice(0, 3)
    podio.forEach((ciclista, indice) =>
      console.log(`${ciclista.ciclista} quedó en el lugar ${indice + 1}`)
    )
  },
}

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table(carrera.bicicletas)
console.log(v, "\n" + oo + " .D. ")
carrera.listarBicicletas(arrayBicicletas)
console.log(o)

console.log(v, oo + " .E.")
carrera.listarBicicletas(carrera.ciclistasHabilitados())
console.log(o)

console.log(v, oo + " .F.")
carrera.listarBicicletas([carrera.buscarPorId(1)])
console.log(o)

console.log(v, oo + " .G.")
carrera.listarBicicletas(carrera.filtrarPorPeso(8))
console.log(o)

console.log(v, oo + " .H.")
carrera.listarBicicletas(carrera.ordenarPorRodado())
console.log(o)

console.log(v, oo + " .I.")
console.log(carrera.largoPromedio())
console.log(o)

console.log(v, oo + " .J. ")
console.log(carrera.aumentarPeso(1, 11))
console.log(o)

console.log(v, oo + " .K. ")
carrera.listarBicicletas(carrera.generarTanda(28, 7))
console.log(o)

console.log(v, oo + " .L. ")
carrera.calcularPodio(carrera.generarTanda(28, 7))
console.log(o)
