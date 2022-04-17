function Superheroe(nombre, poder) {
  this.nombre = nombre
  this.poder = poder
  this.saludar = function () {
    console.log(`Hello, my name is ${this.nombre}`)
  }
}

const wonderWoman = new Superheroe("wonder woman", "látigo")
const superMan = new Superheroe("super man", "fuerza")

const superheroes = [wonderWoman, superMan]

console.log(superheroes)

superheroes[0].saludar()

let arrayDePeliculas = ["Harry Potter", "Her", "Up", "Lego"]

module.exports = { superheroes, arrayDePeliculas }

// const superHeroes = [
//   {
//     nombre: "Wonder Woman",
//     poder: "látigo",
//     saludar() {
//       return "hola soy" + this.nombre
//     },
//   },
//   {
//     nombre: "Batman",
//     poder: "coche",
//     saludar() {
//       return "hola soy" + this.nombre
//     },
//   },
// ]
