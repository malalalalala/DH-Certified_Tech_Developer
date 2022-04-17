// import archivos from './lecturaEscritura'

// Introducción
// Ahora que ya tenemos todos los conceptos y práctica sobre métodos de array entonces haremos una integración de ambas Mesas de Trabajo vistas en esta semana
// Para esta Mesa de Cierre vamos a estar modelando una Inmobiliaria que estará representada esta vez por un objeto literal, donde contendrá propiedades y métodos según se especifiquen a continuación

// Preparando estructuras de archivos
// Tomando como base la estructura de archivos, encontraremos los siguientes archivos
// departamentos.json que contiene la información necesaria
// lecturaEscritura.js un módulo con él que nos facilitará leer y escribir en él archivo departamentos.json
// app.js, esta vez será un archivo vacío nuestro trabajo será desarrollar nuestro código en él mismo
// A continuación te planteamos varios desafíos que deberás resolver usando tu ingenio y lo aprendido hasta el momento.
// Es probable que no puedas terminar todos estos ejercicios durante el tiempo que tiene la mesa de trabajo, no te preocupes, lo importante es que los termines

// Consigas
// Como primer paso necesitarás requerir él módulo lecturaEscritura y asignarlo a una variable para poder utilizar sus funcionalidades, además de hacer la lectura del archivo departamentos.json, en detalle:

// Requerir módulo lecturaEscritura y asignarlo a una variable llamada por ejemplo archivos, esta contendrá los métodos del módulo requerido de ahora en más
const archivos = require("./lecturaEscritura")

// Leer él archivo departamentos.json utilizando la variable archivos creada anteriormente con él método adecuado y asignar a una variable llamada arrayDepartamentos
const arrayDepartamentos = archivos.leerJson("departamentos")

// Comprobar los pasos anteriores imprimiendo la variable arrayDepartamentos. ejemplo : console.log(arrayDepartamentos)
console.log(arrayDepartamentos)

// Crear un objeto literal, que podemos llamar inmobiliaria, será nuestra representación de la inmobiliaria (valga la redundancia) con su datos (propiedades) y sus funcionalidades (métodos).

const inmobiliaria = {
  // Agregar una propiedad llamada departamentos que contenga él arrayDepartamentos obtenido en el punto anterior.
  departamentos: arrayDepartamentos,

  // Agregar un método listarDepartamentos que reciba como parámetro un array de departamentos y los imprima por consola.
  // Este método deberá imprimir por cada elemento:
  // El id.
  // El precioAlquiler.
  // disponible (en caso de ser true mostrar “Disponible” caso contrario “Alquilado”)
  // La cantidad de ambientes
  // ej: “id: 2, precio $ 7500, está Disponible, 4 ambientes”

  listarDepartamentos(array) {
    array.forEach((elemento) => {
      let disponible = elemento.disponible ? "Disponible" : "Alquilado"
      console.log(
        `id: ${elemento.id}, precio $ ${elemento.precioAlquiler}, ${disponible}, ${elemento.ambientes} ambientes`
      )
    })
  },

  // Agregar un método buscarPorId que permita buscar un departamento en función de su id.
  // Este método recibirá por parámetro un number que representa él id del departamento a buscar
  // En caso de encontrar un departamento con él id buscado, devolverá el objeto literal que lo representa.
  // En caso contrario devolverá undefinded
  // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.
  buscarPorid(id) {
    return this.departamentos.find((departamento) => departamento.id === id)
  },

  // Agregar un método departamentosNoDisponibles que permite filtrar departamentos cuando su propiedad disponible sea igual a false, esto quiere decir que están alquilados.
  // Este método devolverá un array con todos los departamentos que cumplan la condición mencionada
  // en caso de no encontrar ningún	 que cumpla con la condición, devolverá un array vacío

  //   const result = words.filter(word => word.length > 6);
  departamentosNoDisponibles() {
    return this.departamentos.filter(
      (departamento) => departamento.disponible === false
    )
  },

  // Agregar un método departamentosDisponibles que permite filtrar departamentos cuando su propiedad disponible sea igual a true.
  // Este método devolverá un array con todos los departamentos que cumplan la condición mencionada
  // en caso de no encontrar ningún	 que cumpla con la condición, devolverá un array vacío

  departamentosDisponibles() {
    return this.departamentos.filter(
      (departamento) => departamento.disponible === true
    )
  },

  // Agregar un método filtrarPorAmbientes que permite filtrar departamentos, siempre y cuando su propiedad ambientes sea mayor o igual a una cantidad enviada como argumento.
  // Este método recibirá por parámetro un number que represente la cantidad de  ambientes mínimo.
  // Este método devolverá un array con todos los departamentos que cumplan con la condición mencionada.
  // En caso de no encontrar ningún departamento que cumpla con la condición, devolverá un array vacío.

  filtrarPorAmbientes(cantAmbientes) {
    return this.departamentos.filter(
      (departamento) => departamento.ambientes >= cantAmbientes
    )
  },

  // Agregar un método filtrarPorPrecio que permite filtrar departamentos, siempre y cuando su propiedad precioAlquiler sea menor o igual a él precio enviado como argumento.
  // Este método recibirá por parámetro un number que represente él precioAlquiler máximo.
  // Este método devolverá un array con todos los departamentos que cumplan con la condición mencionada.
  // En caso de no encontrar ningún departamento que cumpla con la condición, devolverá un array vacío.
  // Este método debe usar departamentosDisponibles, para buscar incluir solamente aquellos departamentos que estén disponibles.

  filtrarPorPrecio(precio) {
    const depDisponibles = this.departamentosDisponibles()
    return depDisponibles.filter(
      (elemento) => elemento.precioAlquiler <= precio
    )
  },

  // Agregar un método rebajarPrecioAlquiler que modifique él valor de precioAlquiler de los departamentos No Alquilados.
  // Este método debe usar departamentosDisponibles, para buscar incluir solamente aquellos departamentos que estén disponibles, es decir, que no estén Alquilados.
  // Este método recibirá por parámetro un number que represente él porcentaje que se desea rebajar a los departamentos no alquilados por ejemplo un 3%.
  // Este método devolverá un array con todos los departamentos que sufrieron la modificación del precioAlquiler
  // Este método debe realizar una persistencia de información, para esto utilizaremos él método escribirJson de nuestro objeto requerido en él primero punto.
  // archivos.escribirJson('departamentos',this.departamentos)

  //   const map1 = array1.map(x => x * 2);
  rebajarPrecioAlquiler(porcentaje) {
    const depDisponibles = this.departamentosDisponibles()
    depDisponibles.forEach((departamento) => {
      departamento.precioAlquiler -=
        (departamento.precioAlquiler * porcentaje) / 100
    })
    archivos.escribirJson("departamentos", this.departamentos)
    return depDisponibles
  },

  // Agregar un método calcularRecaudación que calcule él valor que se depositará en caja tomando en cuenta él precioAlquiler de los departamentos Alquilados.
  // Este método devolverá un valor que represente la recaudación total.
  // Este método debe usar departamentosNoDisponibles, para buscar incluir solamente aquellos departamentos que estén no disponibles, es decir, Alquilados.

  calcularRecaudacion() {
    const departamentosNoDisponibles = this.departamentosNoDisponibles()
    return departamentosNoDisponibles.reduce(
      (accum, depto) => accum + depto.precioAlquiler,
      0
    )
  },

  // Agregar un método ordenarPorPrecio que ordene los departamentos de menor a mayor según su precio.
  // El método recibirá como parámetro un array de departamentos.
  // Este método devolverá un array con todos los departamentos ordenados por precio.
  // Recordemos que Javascript tiene un método para hacer justamente lo que necesitamos 😉.
  ordenarPorPrecioAscendente(array) {
    return array.sort(
      (auto1, auto2) => auto1.precioAlquiler - auto2.precioAlquiler
    )
  },

  ordenarPorPrecioDescendente(array) {
    return array.sort(
      (auto1, auto2) => auto2.precioAlquiler - auto1.precioAlquiler
    )
  },
}

inmobiliaria.listarDepartamentos(arrayDepartamentos)

console.log("------------------------buscarporid")
inmobiliaria.listarDepartamentos([inmobiliaria.buscarPorid(1)])

console.log("------------------------departamentosNoDisponibles")
inmobiliaria.listarDepartamentos(inmobiliaria.departamentosNoDisponibles())

console.log("------------------------departamentosDisponibles")
inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles())

console.log("------------------------filtrarPorAmbientes")
inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorAmbientes(2))

console.log("------------------------filtrarPorPrecio")
inmobiliaria.listarDepartamentos(inmobiliaria.filtrarPorPrecio(24100))

console.log("------------------------rebajarPrecioAlquiler")
inmobiliaria.listarDepartamentos(inmobiliaria.rebajarPrecioAlquiler(10))

console.log("------------------------calcularRecaudacion")
console.log(inmobiliaria.calcularRecaudacion())

console.log("------------------------  ordenarPorPrecioAscendente")
inmobiliaria.listarDepartamentos(
  inmobiliaria.ordenarPorPrecioAscendente(arrayDepartamentos)
)

console.log("------------------------ordenarPorPrecioDescendente")
inmobiliaria.listarDepartamentos(
  inmobiliaria.ordenarPorPrecioDescendente(arrayDepartamentos)
)
