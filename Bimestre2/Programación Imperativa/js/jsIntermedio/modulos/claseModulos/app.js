const circle = require("./circle")

console.log("area", circle.area(4))

const misModulos = require("./../superheroesModulos")

//crear un método o un atributo fuera del objeto

misModulos.superheroes.listar = function () {
  console.log("holi")
}

console.log(misModulos.superheroes)
