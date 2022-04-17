//Arrays

//push, inserta al final
let nombres = ["Laura", "Andrés", "Cristian"]
let edades = [33, 25, 38]

let masnombres = nombres.push("Cielo", "Aleja")
console.log("soy nombres.push", nombres.push("Cielo", "Aleja"))
console.log("soy masnombre", masnombres)
console.log("soy nombre", nombres)
edades.push(4)
edades.push(20)
console.log("edades", edades)

//unshift inserta al principio
console.log(edades.unshift(5))
console.log("edades con unshift", edades)
//pop quita elemento y modifica original
edades.pop()
console.log("edades con pop", edades)
let ultimaedad = console.log("el ultimo", edades.pop())

//shift elimina el elemento del índice cero

console.log(edades.shift())
console.log("edades con shift", edades)

//indexOf recibe cadena de texto y busca el indice donde está ese texto si no está presente devuelve -1

let posicionDel25 = edades.indexOf(2)
console.log(posicionDel25)
edades.push(25, 5, 6, 7)
console.log(edades)

let ultimaPosicionDel25 = edades.lastIndexOf(25)
console.log(ultimaPosicionDel25)

if (posicionDel25 != -1) {
  console.log("lo encontré")
}

//join crea un string unido por lo que le digamos

console.log(edades.join("*"))

let arrayFrase = [
  "No",
  "he",
  "fracasado,",
  "simplemente",
  "me",
  "he",
  "topado",
  "con",
  "diez",
  "mil",
  "soluciones",
  "equivocadas",
]

let fraseNueva = arrayFrase.join(" ")
console.log(fraseNueva)

let estudiantes = [
  {
    nombre: "Alvaro",
    promedio: 9,
    curso: "Android",
  },
  {
    nombre: "Daniel",
    promedio: 6,
    curso: "Full Stack",
  },
  {
    nombre: "Alexis",
    promedio: 3,
    curso: "iOS",
  },
]

let alumnoEgresado = estudiantes.pop()
console.log(alumnoEgresado)

estudiantes.push(
  { nombre: "Juan", promedio: 5, curso: "iOS" },
  { nombre: "Miguel", promedio: 2, curso: "Android" }
)

console.log(estudiantes)

estudiantes.push({ nombre: "Juan", promedio: 5, curso: "iOS" })

estudiantes.push({ nombre: "Miguel", promedio: 2, curso: "Android" })

let alumnoDeBaja = estudiantes.shift()
console.log(alumnoDeBaja)

estudiantes.unshift({
  nombre: "Mariana",
  promedio: 9,
  curso: "Full Stack",
})

estudiantes.unshift({
  nombre: "Francisco",
  promedio: 2,
  curso: "Android",
})

estudiantes.unshift(
  {
    nombre: "Mariana",
    promedio: 9,
    curso: "Full Stack",
  },
  {
    nombre: "Francisco",
    promedio: 2,
    curso: "Android",
  }
)

console.log(estudiantes)

// The slice() method returns a shallow copy of a portion of an array into a new array object selected from start to end (end not included) where start and end represent the index of items in that array. The original array will not be modified.

const animals = ["ant", "bison", "camel", "duck", "elephant"]

console.log(animals.slice(2))
// expected output: Array ["camel", "duck", "elephant"]

console.log(animals.slice(2, 4))
// expected output: Array ["camel", "duck"]

console.log(animals.slice(1, 5))
// expected output: Array ["bison", "camel", "duck", "elephant"]

console.log(animals.slice(-2))
// expected output: Array ["duck", "elephant"]

console.log(animals.slice(2, -1))
// expected output: Array ["camel", "duck"]

console.log(animals.slice())
