// function vaComoParametro() {
//   return "soy un callback"
// }

// //no se debe ejecutar la callback, funcion padre sabe cuándo se va a ejecutar

// funcionPadre(vaComoParametro)

// const funcionPadre=()=>{

// }

const operacionMatematica = (n1, n2, operacion) => operacion(n1, n2)

const sumar = (n1, n2) => n1 + n2
const restar = (n1, n2) => n1 - n2
const multiplicar = (n1, n2) => n1 * n2
const dividir = (n1, n2) => n1 / n2

const calculadora = (n1, n2, operacion) => operacion(n1, n2)

//el callback no se ejecuta al pasarla como parámetro
console.log(calculadora(18, 3, restar))

// El callback anónimo

//En este caso, la función que pasamos como callback no tiene nombre. Es decir, es una función anónima.Como las funciones anónimas no pueden ser llamadas por su nombre, debemos escribirla dentro de la función que se encargará de llamar al callback.

setTimeout(function () {
  console.log("Hola Mundo función anónima!")
}, 1000)

// El callback definidoLa función que pasamos como callback puede ser una función previamente definida. Al momento de pasarla como parámetro de otra función, nos referiremos a la misma por su nombre.

let miCallback = () => console.log("Hola mundo callback definido!")

setTimeout(miCallback, 1000)

// Al escribir una función como parámetro lo hacemos sin los paréntesis para evitar que se ejecute. Será la función que la recibe quien se encargue de ejecutarla.Los callbacks

function nombreCompleto(nombre, apellido) {
  return nombre + " " + apellido
}

function saludar(nombre, apellido, callback) {
  return "¡Hola " + callback(nombre, apellido) + "!"
}
console.log(saludar("Juanito", "Sánchez", nombreCompleto))

function iniciales(nombre, apellido) {
  return nombre[0] + apellido[0]
}

console.log(saludar("Juanito", "Sánchez", iniciales))

const doble = (n) => n * 2
const triple = (n) => n * 3
const aplicarCallBack = (n, callback) => {
  return callback(n)
}

console.log(aplicarCallBack(2, doble))

function agregarHttp(url) {
  return "http://" + url
}

function procesar(array, callback) {
  let newArray = []
  for (let i = 0; i < array.length; i++) {
    const elemento = callback(array[i])
    newArray.push(elemento)
  }
  return newArray
}

const urlCompletas = procesar(["www.google.com", "www.yahoo.com"], agregarHttp)

console.log(urlCompletas)
