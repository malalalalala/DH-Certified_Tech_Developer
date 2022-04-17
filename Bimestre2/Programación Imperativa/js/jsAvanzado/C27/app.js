const helper = require("./helper")

const equipo = helper.leer("equipo.json")

console.log(equipo)

//forEach no retona nada, solo para recorrer

//map, nueva versión de nuestro array, la diferencia qu

//find y filter realizan búsquedas, finde devuelve el primer elemento que encuentre, filter
//devuelve un array con todos los elementos que cumplen, si ninguno cumple devuelve un array
//vacío

//para obtener un único valor calculado a partir de cierto criterio, lo guardamos en un acumulador
//usamos REDUCE, el valor inicial del reduce, recibe una función de callback, el primer valor
//va a ser el primer elemento del array

const a = [1, 2, 3]

//el acumulador sería 1, y se lo escapa. El problema es que


// [0, 1, 2, 3, 4].reduce(function(previousValue, currentValue, currentIndex, array) {
//     return previousValue + currentValue
//   })

// arr.reduce(callback(acumulador, valorActual[, índice[, array]])[, valorInicial])