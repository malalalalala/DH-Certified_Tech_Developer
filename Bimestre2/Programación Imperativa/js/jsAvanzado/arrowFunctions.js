const laMitad = (numero) => numero / 2

//const laMitad = (numero) => numero / 2

console.log(laMitad(8))

const tengoQueTrabajar = (dia) => {
  if (dia === "sabado") {
    return "no tenés que trabajar"
  } else {
    return "tenes que trabajar"
  }
}

console.log(tengoQueTrabajar("sabado"))

//arrow son siempre anonimas, funciones expresadas

let horaActual = () => {
  let fecha = new Date()
  return fecha.getHours() + ":" + fecha.getMinutes()
}

console.log(horaActual())

let dameCinco = () => [1, 2, 3, 4, 5]

let multiplicarPorDos = () => 123 * 2

let mostrarNombre = () => "Mi nombre es Hernán"
