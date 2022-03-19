// alert("esto es una alerta!")
// //console.log(alert("esto es una alerta!"))
// //confirm("estas serguro de aceptar")
// console.log(confirm("estas serguro de aceptar"))
// //retorna un booleano

console.log("PROMT", prompt("ingreaa tu edad"))

// let randomSimple = Math.random()
// let randomEscalado = Math.random() * (100 - 1) + 1
// console.log("randomSimple", randomSimple)
// console.log("randomEscalado", randomEscalado)
// console.log(parseInt(randomEscalado))

// //parseInt() parses a string and returns the first integer:

// // parseInt("10") + "<br>" +
// // parseInt("10.00") + "<br>" +
// // parseInt("10.33") + "<br>" +
// // parseInt("34 45 66") + "<br>" +
// // parseInt("   60   ") + "<br>" +
// // parseInt("40 years") + "<br>" +
// // parseInt("He was 40")
// // 10
// // 10
// // 10
// // 34
// // 60
// // 40
// // NaN

// let a = parseInt("22")
// //let b = parseInt(prompt("Ingrese edad"))
// let c = parseInt("22" + "150")
// let d = parseInt(22 + 150)
// let e = parseInt(22 + parseInt("150"))
// let f = parseInt(22.55)
// console.log("a", a)
// //console.log(b)
// console.log("c", c)
// console.log("d", d)
// console.log("e", e)
// console.log("f", f)

// let g = parseFloat("22.3544")
// let h = parseFloat(22)
// let i = parseFloat(22.35545)
// console.log("g", g)
// console.log("h", h)
// console.log("i", i)

// let edad = parseInt(prompt("Ingrese su edad"))

// const calculo = (edad) => {
//   while (isNaN(edad)) {
//     edad = parseInt(prompt("Ingrese su edad"))
//   }
//   if (edad > 18) {
//     console.log("Es mayor de edad")
//   } else {
//     console.log("Es menor de edad")
//   }
// }

// calculo(edad)

//for in para objetos
let persona = {
  nombre: "Laura",
  edad: 34,
  profesion: "programadora",
}
//imprime las keys sin los valores
for (const caracteristica in persona) {
  console.log(caracteristica)
}

//imprime el valor de cada una de las propiedades
for (const caracteristica in persona) {
  console.log(persona[caracteristica])
}

//for of arrays

const series = ["Friends", "GOT", "BB"]

for (const serie of series) {
  console.log(serie)
}
