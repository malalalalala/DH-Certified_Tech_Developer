//archivo de entrada FS

const fs = require("fs")
// console.log("fs modulo", fs)

let datos = fs.readFileSync(__dirname + "/moduloPrueba.txt", "utf-8") //permite leer un archivo, primer parametro qué archivo vamos a leer
//se pone porque __dirname es siempre el directorio en el que reside el script que se está ejecutando actualmente
//el segundo parametro es la codificacion del archivo
console.log("fs datos", datos)

fs.writeFileSync(__dirname + "/moduloPrueba.txt", "hola mundo")
///archivo, texto. Borra lo que tengo en el archivo

/////////

const moment = require("moment")
// const modules = require("./superheroesModulos")
// console.log("moment modulo", moment)

console.log(moment().format("MMMM dd YY"))
console.log(moment().format("MMM dd YY"))

// console.log(superheroes[0])
// superheroes[0].saludar()

const misModulos = require("./superheroesModulos")

misModulos.superheroes[0].saludar()
console.log(misModulos.arrayDePeliculas)

//////////////////////////////////////////////////

let superh = JSON.stringify(misModulos.superheroes)
let otro = JSON.stringify(misModulos.arrayDePeliculas)
fs.writeFileSync(__dirname + "/moduloPrueba.txt", superh)
fs.appendFileSync(__dirname + "/moduloPrueba.txt", otro)

fs.writeFileSync("otroModuloPrueba.txt", "Hola mundo")

//así me crea el archivo directamente

let pelicula = { titulo: "Titanic", minutos: 560 }
let peliculaJson = JSON.stringify(pelicula)
console.log(peliculaJson)
// fs.writeFileSync("titanic.json", peliculaJson)

// fs.writeFileSync("estrenos-2020.txt", "Titanic 2")
