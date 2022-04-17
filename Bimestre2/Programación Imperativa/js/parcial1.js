// const edad = 0
// let anioActual = 2021
// let anioNacimiento = 1993

// edad = anioActual - anioNacimiento

// console.log("edad", edad)

console.log("10" - 7)

console.log(10 / 0)

// function Prueba() {
//   var diez = 10
//   let holi = 1
// }

// console.log(diez)
// console.log(holi)

let comparacion = "10" < 11 && !("12" === 12)

console.log("resultado de la comparación", "10" < 11 && !("12" === 12))
console.log(comparacion)

function aprueba(num) {
  if (num < 4) {
    return "recursa la materia"
  } else if (num < 7) {
    return "va a recuperatorio"
  } else {
    return "aprueba"
  }
}

console.log(aprueba(6))

let edad = 18

if (edad) {
  console.log("es mayor a 21, puede pasar")
} else {
  console.log("no tiene edad suficiente para ingresar")
}

let palabraSecreta = function (palabra) {
  const palabraAcceso = "GanamosElParcial"
  if (palabraAcceso === palabra) {
    return "Contraseña correcta, pase por favor"
  } else {
    return "Contraseña incorrecta, verifique y vuelva a intentar mas tarde"
  }
}

console.log(palabraSecreta("GanamosElParcial"))

// Preguntas
// Detectar patrones es...
// descartar lo irrelevante para la resolución del problema
// separar algoritmos abstractos
// descomponer un problema en sus subcomponentes
// detectar características comunes en varias entidades
// "Descartar lo irrelevante para la resolución del problema" es:
// Crear algoritmos
// Abstraer
// Detectar patrones
// Descomposición
// ¿Que mostrará por consola el siguiente código?
// Imagen sin título
// 28
// Undefined
// Error: Assignment to constant variable.
// edad is not defined
// Las variables en Javascript son...
// Espacios en memoria predefinidos que no podemos modificar
// Espacios de memoria en la computadora donde podemos almacenar distintos tipos de datos.
// Colecciones de datos que se utilizan para acciones especificas
// Partes de código reutilizables que realizan una acción determinada
// ¿Qué significa NaN?
// Es un error matemático resultado de dividir por 0
// Not another Null
// Es un tipo de dato numérico que significa Not a Number
// Null as Nothing
// Los booleanos son tipos de datos compuestos por dos valores, ¿cuales dos?
// false y defined
// null y true
// null y undefined
// true y false
// Dado el siguiente código, ¿que se imprimirá en la consola?
// Imagen sin título
// 107
// 3
// Error
// 710
// ¿Qué imprimirá el siguiente código?
// Imagen sin título
// Infinity
// Error
// NaN
// 10
// Es posible consultar el valor de una variable declarada dentro de mi función, llamando a la variable por fuera de mi función
// Verdadero, las variables declaradas dentro de mi función son accesibles globalmente
// Falso, las variables declaradas dentro de funciones tienen un acceso local, es decir solo pueden usarse dentro de ese bloque de código donde fueron declaradas
// ¿Cómo llamamos / ejecutamos una función con el nombre "miFuncion"?
// miFuncion()
// call function miFuncion()
// call miFuncion()
// bang miFunction()
// Elija la correcta forma de preguntar si algo es "mayor o igual que"
// "=<"
// "=>"
// ">="
// "<="
// ¿Cuál es el resultado de esta comparación?
// Imagen sin título
// true
// false
// Dada la siguiente función, ¿qué mensaje se imprimirá por la consola?
// Imagen sin título
// "recursa la materia"
// "aprueba"
// "va a recuperatorio"
// num is not a parameter
// ¿Cuál es el resultado de la siguiente sentencia de código?
// Imagen sin título
// "no tiene la edad suficiente para ingresar"
// "es mayor a 21, puede pasar"
// Error: edad is not declared
// undefined
// Muéstrame el código
// Crear una función llamada palabraSecreta, la misma recibe un parámetro, y deberá verificar que coincida con una palabra secreta definida en la función. En caso de que coincida deberá retornar "Contraseña correcta, pase por favor", caso contrario "Contraseña incorrecta, verifique y vuelva a intentar mas tarde".
// let palabraSecreta = function (palabra) {
//   const palabraAcceso = "GanamosElParcial"
//   if (palabraAcceso === palabra) {
//     return "Contraseña correcta, pase por favor"
//   } else {
//     return "Contraseña incorrecta, verifique y vuelva a intentar mas tarde"
//   }
// }

// console.log(palabraSecreta("GanamosElParcial"))
