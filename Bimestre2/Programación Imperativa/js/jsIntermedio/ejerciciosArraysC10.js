let numbers = [22, 33, 54, 66, 72] //undefined
console.log(numbers[numbers.length])

let grupoDeAmigos = [
  ["Harry", "Ron", "Hermione"],
  ["Spiderman", "Hulk", "Ironman"],
  ["Penélope Glamour", "Pierre Nodoyuna", "Patán"],
]
console.log(grupoDeAmigos[1][0]) //spiderman

let str = "un string cualquiera"
let grupoDeAmigos2 = [
  [45, 89, 0],
  ["Digital", "House", true],
  ["string", "123", "false", 54, true, str],
]
console.log(grupoDeAmigos2[2][grupoDeAmigos2[2].length - 1]) //'un string cualquiera'

// Crear la estructura adecuada para guardar las siguientes películas:
// "star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"
// Importante: verificá que todo funciona correctamente accediendo a alguna de
// las películas una vez creada la estructura correspondiente.

let peliculas = [
  "star wars",
  "totoro",
  "rocky",
  "pulp fiction",
  "la vida es bella",
]

console.log(peliculas[0])

// 2. Más tarde, de producción dieron el aviso de que las películas deberían estar
// todas en mayúsculas. Para esto solicitan que crees una función que reciba por
// parámetro un array y convierta el contenido de cada elemento a mayúsculas.
// Pista: revisá qué hace el método de strings .toUpperCase().

let listaPeliculas = [
  "star wars",
  "totoro",
  "rocky",
  "pulp fiction",
  "la vida es bella",
]

function aMayusculas(array) {
  array[0] = array[0].toUpperCase()
  array[1] = array[1].toUpperCase()
  array[2] = array[2].toUpperCase()
  array[3] = array[3].toUpperCase()
  array[4] = array[4].toUpperCase()
  return array
}

function convertirAMayus(array) {
  let newArray = []
  for (let i = 0; i < array.length; i++) {
    const pelicula = array[i].toUpperCase()
    newArray.push(pelicula)
  }
  return newArray
}

console.log("convertirAMayus", convertirAMayus(peliculas))

// Mientras trabajabas en el feature anterior, se dio el aviso de que también hay
// que crear otra estructura similar a la primera, pero con las siguientes películas
// animadas:
// "toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"
// Por lo tanto, te piden crear una función que reciba dos arrays como
// parámetros, para poder agregar los elementos contenidos en el segundo array
// dentro del primero, y así retornar un solo array con todas las películas como
// sus elementos.
// Importante: las películas animadas también deberían convertirse a
// mayúsculas.

let pelisAnimadas = [
  "toy story",
  "finding Nemo",
  "kung-fu panda",
  "wally",
  "fortnite",
]

function concatenaArrays(array1, array2) {
  return convertirAMayus(array1).concat(convertirAMayus(array2))
}

console.log(concatenaArrays(peliculas, pelisAnimadas))

function joinArrays(array1, array2) {
  for (let i = 0; i < array2.length; i++) {
    const pelicula = array2[i]
    array1.push(pelicula)
  }
  return convertirAMayus(array1)
}

console.log("joinArrays", joinArrays(peliculas, pelisAnimadas))

function pasajeDeElementos(arr1, arr2) {
  for (let i = arr2.length - 1; i >= 0; i--) {
    arr1.push(arr2.pop().toUpperCase())
  }
  return arr1
}
pasajeDeElementos(
  ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"],
  ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]
)

// Durante el proceso, uno de los desarrolladores advierte que el último elemento
// del array de películas animadas es un videojuego. Ahora tenés que editar el
// código y modificarlo de manera que puedas eliminar ese último elemento
// antes de migrar el contenido al array que contenga todas las películas.
// PD: por precaución, guardá el elemento que vas a eliminar en una variable.

function joinArraysEliminandoUltimo(array1, array2) {
  console.log("array1 y 2", array1, array2)
  for (let i = 0; i < array2.length; i++) {
    const pelicula = array2[i]
    array1.push(pelicula)
  }

  const variableEliminada = array1.pop()
  console.log("variableEliminada", variableEliminada)

  return convertirAMayus(array1)
}

console.log(
  "joinArraysEliminandoUltimo",
  joinArraysEliminandoUltimo(
    ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"],
    ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]
  )
)

const lista = joinArrays(
  ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"],
  ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]
)

const eliminado = lista.pop()

console.log("eliminado", eliminado, "nuevo array", lista)

// Finalmente, te envían dos arrays con calificaciones que hacen distintos usuarios
// del mundo sobre las películas con el siguiente formato:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4]
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5]
// Te piden crear una función que compare las calificaciones e indique si son
// iguales o diferentes. Te confirman que están en el orden adecuado y que solo
// traen valores numéricos del 1 al 10.
// PD: los elementos de los scores tanto de Asia como de Europa corresponden
// en orden al del array resultante de combinar películas con películas animadas.
// Es decir, el primer elemento del array de películas general corresponde al
// primer elemento de asiaScores y al primer elemento de euroScores, y así
// sucesivamente.

const comparacionScores = function (array1, array2) {
  for (let i = 0; i < array2.length; i++) {
    const mensaje =
      array1[i] === array2[i]
        ? `La posicion ${i + 1} es igual`
        : `La posicion ${i + 1} es diferente`
    console.log(mensaje)
  }
}

comparacionScores(asiaScores, euroScores)

// 1. Creá la función imprimirInverso que tome un array como argumento y que
// imprima en la consola cada elemento en orden inverso (no tenés que invertir el
// array).

const imprimirInverso = function (array) {
  //   let invertido = []
  for (let i = array.length - 1; i >= 0; i--) {
    console.log("imprimirInverso", array[i])
    // invertido.push(array[i])
  }

  //   console.log(invertido)
}
const arraicito2 = [
  "star wars",
  "totoro",
  "rocky",
  "pulp fiction",
  "la vida es bella",
]

imprimirInverso(arraicito2)

//   Creá la función inversor que tome un arreglo como argumento y devuelva uno
//   nuevo invertido.

const inversor = function (array) {
  return array.reverse()
}
const arraicito = [
  "star wars",
  "totoro",
  "rocky",
  "pulp fiction",
  "la vida es bella",
]

console.log("invertidos", inversor(arraicito), "arraicito", arraicito)

function sumaArray(array) {
  let suma = 0
  for (let i = 0; i < array.length; i++) {
    suma += array[i]
  }
  return suma
}

let sumarArray = [1, 2, 3]
console.log(sumaArray(sumarArray))

function join(array) {
  let string = ""
  for (let i = 0; i < array.length; i++) {
    string += array[i]
  }
  return string
}

console.log(join(["h", "o", "l", "a"]))

function join2(array) {
  let aux = ""
  for (let i = 0; i < array.length; ++i) {
    aux += array[i]
  }
  return aux
}

console.log(join2(["h", "o", "l", "a"]))

// Crear una función puntajePromedio la cual recibe un participante por parámetro
// y deberá calcular —y retornar— el puntaje promedio del mismo.

// 3. Crear una función puntajeNayor la cual recibe un participante por parámetro y
// deberá buscar —y retornar— el mayor puntaje que tenga el participante.

// 4. Luego, nuestro tech leader nos solicita que —creadas estas dos funciones—
// generemos una nueva funcionalidad llamada competencia la cual recibirá a los 3
// participantes por parámetros y ejecutará las dos funciones creadas
// previamente para calcular los promedios y puntajes mayores de cada uno.
// Además, esta deberá anunciar (mostrar por la consola) al ganador de cada
// modalidad de puntaje.

let partA = [3, 8, 4, 9, 5],
  partB = [8, 7, 8, 6, 8],
  partC = [7, 5, 10, 8, 3]

function puntajePromedio(part) {
  let pa = 0
  for (let i = 0; i < 5; i++) {
    pa = pa + part[i]
  }
  pa = pa / part.length
  return pa
}

function puntajeMayor(part) {
  let mpa = part[0]

  for (let i = 0; i < part.length; i++) {
    if (part[i] > mpa) {
      mpa = part[i]
    }
  }
  return mpa
}

function competencia(p1, p2, p3) {
  let participantes = [p1, p2, p3]
  let mp = [],
    mpp = []
  for (let i = 0; i < participantes.length; i++) {
    mp[i] = puntajePromedio(participantes[i])
    mpp[i] = puntajeMayor(participantes[i])
  }

  let mpa = mp[0]
  ;(mppa = [0]), (partmp = 0), (partmpp = 0)

  for (let i = 0; i < participantes.length; i++) {
    if (mp[i] > mpa) {
      mpa = mp[i]
      partmp = i
    }
    if (mpp[i] > mppa) {
      mppa = mpp[i]
      partmpp = i
    }
  }

  return (
    "mejor promedio: " +
    mpa +
    " del participante nÃºmero " +
    (partmp + 1) +
    " y mejor alto puntaje " +
    mppa +
    " del participante numero: " +
    (1 + partmpp)
  )
}

console.log(competencia(partA, partB, partC))

const alicia = [23, 69, 32]
const bob = [12, 67, 43]

function encontrarGanador(a, b) {
  let puntosAlicia = 0
  let puntosBob = 0
  for (let i = 0; i < a.length; i++) {
    if (a[i] > b[i]) {
      puntosAlicia++
    } else if (a[i] < b[i]) {
      puntosBob++
    }
  }
  let mensaje = "EL ganador es: "
  if (puntosAlicia > puntosBob) {
    return mensaje + "Alicia"
  } else if (puntosAlicia < puntosBob) {
    return mensaje + "Bob"
  } else {
    return "Es empate"
  }
}

console.log(encontrarGanador(alicia, bob))

//Extra Bonus
//DH

// digitalHouse()
// Crea la función digitalHouse() la cual recibirá 2 números como parámetros. La función
// deberá imprimir por pantalla los números del 1 al 100, pero teniendo en cuenta los
// siguientes criterios:
// ● Si el número a imprimir es múltiplo del primer parámetro que se ingresó,
// deberá mostrar el string “Digital” en lugar del número.
// ● Si el número a imprimir es múltiplo del segundo parámetro ingresado, deberá
// mostrar el string “House” en su lugar.
// ● Si el número a imprimir es múltiplo de ambos parámetros, deberá mostrar el
// string “Digital House” en lugar del número.

function digitalHouse(n1, n2) {
  for (let i = 1; i <= 100; i++) {
    if (i % n1 == 0 && i % n2 == 0) {
      console.log("Digital House")
    } else if (i % n1 == 0) {
      console.log("Digital")
    } else if (i % n2 == 0) {
      console.log("House")
    } else {
      console.log(i)
    }
  }
}
