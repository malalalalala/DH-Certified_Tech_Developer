const suma = (a, b) => {
  return isNaN(a) || isNaN(b) ? 0 : a + b
}

console.assert(suma(1, 2) == 3, "ERROR: el resultado esperado de 1+2 es 3")
console.assert(suma(0, 0) == 0, "ERROR: el resultado esperado de 0+0 es 0")

const resta = (a, b) => {
  return isNaN(a) || isNaN(b) ? 0 : a - b
}

const multiplicacion = (a, b) => {
  return isNaN(a) || isNaN(b) ? 0 : a * b
}

const division = (a, b) => {
  if (!b) throw new Error("Invalid dividend " + b)
  return isNaN(a) || isNaN(b) ? 0 : a / b
}

console.log(typeof (8 / 0))
console.log(8 / 0)

module.exports = { suma, resta, multiplicacion, division }
