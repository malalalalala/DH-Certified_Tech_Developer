const a = [0, 1, 2, 3, 4, 5]

///el primer argumento es desde

//el segundo es hasta la posición sin incluirla, es decir hasta al anterior

//trae una rebanada

console.log(a.slice(3, a.length - 1))

console.log(a.slice(-1))

//SPLICE
//recibe inicio, cantidad (opcional) e items
//cantidad indica cuántos elementos desde donde estoy
//parada
//si se
//método que moficica el array original
console.log(a.splice(3))

const numeros = [3, 4, 5, 6, 7]
console.log("splice", numeros.splice(0, 0, 2))
console.log(numeros)

let criptos = [
  { nombre: "Bitcoin", simbolo: "BTC" },
  { nombre: "Ethereum", simbolo: "ETH" },
  { nombre: "Cardano", simbolo: "ADA" },
]
function esBitcoin(c) {
  return c.nombre === "Bitcoin"
} // {nombre: 'Bitcoin', simbolo: 'BTC'}

// console.log(criptos.find(esBitcoin("Bitcoin")))

function buscarPorMoneda(array, unaMoneda) {
  array.find((moneda) => c.nombre === unaMoneda)
}

let alumnos = ["vidal", "borelli", "montes", "cejas", "brugna", "gonzalez"]

const ordenar = (unarray) => unarray.sort()

console.log(ordenar(alumnos))

const buscar = (unArray, unNombre) => {
  return unArray.find((nombre) => nombre === unNombre)
}

console.log("está", buscar(alumnos, "vidal"))
console.log("no está", buscar(alumnos, "laura"))

const eliminar = (unArray, unNombre) => {
  const indice = unArray.indexOf(unNombre)
  if (indice >= 0) {
    unArray.splice(indice, 1)
    return unArray
  } else {
    return "no se encontró elemento"
  }
}

console.log("eliminar", eliminar(alumnos, "laura"))

const primeraMitad = (unArray) => {
  return unArray.slice(0, unArray.length / 2)
}
