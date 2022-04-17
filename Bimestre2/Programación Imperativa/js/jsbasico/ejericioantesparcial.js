let edad = 17 //(el número es a modo de ejemplo, podes cambiarlo o crear otras para tener varias pruebas)

validarIngreso()

function validarIngreso() {
  if (edad < 0) {
    console.log("Error, edad inválida. Por favor ingrese un número válido.")
  } else if (edad < 18) {
    console.log("No puede pasar al bar.")
  } else if (edad < 21) {
    console.log("Puede pasar al bar, pero no puede tomar alcohol.")
  } else {
    if (edad === 21) {
      console.log("Felidades, llegaste a la mayoria de edad.")
    }
    console.log("Puede pasar al bar y tomar alcohol.")
  }

  edadImpar()
}

function edadImpar() {
  return console.log(edad % 2 != 0 ? "Sabías que tu edad es impar" : "")
}

/////----Ejercicio 2---/////

console.log("Ejercicio 2 ----->")

function totalAPagar(vehiculo, litrosConsumidos) {
  let precioLitro
  let total

  switch (vehiculo) {
    case "coche":
      precioLitro = 86
      break
    case "moto":
      precioLitro = 70
      break
    case "autobus":
      precioLitro = 55
      break
  }

  if (litrosConsumidos > 0 && litrosConsumidos <= 25) {
    total = precioLitro * litrosConsumidos + 50
  } else if (litrosConsumidos > 25) {
    total = precioLitro * litrosConsumidos + 25
  }
  return console.log(`Total a pagar = $ ${total}`)
}
totalAPagar("autobus", 20)

/////----Ejercicio 3---/////
console.log("Ejercicio 3 ----->")

let totalAPagarSandiwch = 0
let valorTotalAdicion = 0

function armaSandwich(
  sandwichBase,
  tipoPan,
  queso,
  tomate,
  lechuga,
  cebolla,
  mayonesa,
  mostaza
) {
  let total = 0
  switch (sandwichBase) {
    case "pollo":
      total = 150
      break
    case "carne":
      total = 200
      break
    case "veggie":
      total = 100
      break
  }
  switch (tipoPan) {
    case "blanco":
      total += 50
      break
    case "negro":
      total += 60
      break
    case "s/gluten":
      total += 75
      break
  }
  return (total +=
    queso * 20 +
    tomate * 15 +
    lechuga * 10 +
    cebolla * 15 +
    mayonesa * 5 +
    mostaza * 5)
}

console.log(armaSandwich("pollo", "negro", true, true, false, true, true, true))

let adivinarNumero = function (numero) {
  const rndInt = Math.floor(Math.random() * 10) + 1
  console.log(rndInt)
  numero === rndInt
    ? console.log("acertaste")
    : console.log(
        "inténtalo de nuevo, ingresaste el numero",
        numero,
        "pero estábamos esperando",
        rndInt
      )
}
adivinarNumero(2)

let abrirParacaidas = function (velocidad, altura) {
  if (velocidad <= 1000 && altura >= 2000 && altura < 3000) {
    console.log("el paracaidas se abrió")
  } else {
    console.log("paracaídas marca acme, tas muertito")
  }
}

abrirParacaidas(1500, 2000)

let traductor = function (palabra) {
  switch (palabra) {
    case "casa":
      console.log("house")
      break
    case "perro":
      console.log("dog")
      break
    case "pelota":
      console.log("ball")
      break
    case "árbol":
      console.log("tree")
      break
    case "genio":
      console.log("genius")
      break
    default:
      console.log("la palabra ingresada es incorrecta")
  }
}

traductor("árbol")

let valorarPelis = function (valoracion) {
  console.log("valorá la peli en Muy Mala, Mala, Mediocre, Buena o Muy buena.")
  switch (valoracion) {
    case "Muy Mala":
      console.log("buuu pseguro viste una de Marvel o Rápido y furioso")
      break
    case "Mala":
      console.log("es mala")
      break
    case "Mediocre":
      console.log("Mediocre")
      break
    case "Buena":
      console.log("Buena")
      break
    case "Muy buena":
      console.log("Muy buena")
      break
    default:
      console.log("la palabra ingresada es incorrecta")
  }
}

valorarPelis("Buena")
