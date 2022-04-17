// ejemplo length

let mensaje = "gran día para practicar js"
console.log("mensaje después length", mensaje.length)

// ejemplo indexOf, retorna el indice dónde empieza
console.log("mensaje después indexOf día", mensaje.indexOf("día"))
console.log("mensaje después indexOf dia", mensaje.indexOf("dia"))

// ejemplo slice, el primer parámetro es de dónde se empieza a cortar y el segundo hasta adonde
// retorna lo que se cortó
console.log("mensaje con slice", mensaje.slice(0, 24))
console.log("mensaje después de slice", mensaje)

let otroMensaje = "   gran día para practicar js   "
//ejemplo trim
console.log("mensaje con trim", otroMensaje.trim())
console.log("mensaje después de trim", otroMensaje)

//ejemplo split convierte un string en un array
let tercermensaje
console.log(mensaje.split(" "))
console.log("mensaje después de split", mensaje)
// console.log(tercermensaje.split(" ")) error, no se puede ejecutar split sobre una variable undefined

//ejemplo replace
console.log(mensaje.replace("js", "todo"))
console.log("mensaje después replace", mensaje)

let practicarTodo = "Gran día para practicar js!"
//quiero saber cuántos caracteres
console.log(practicarTodo.length)
//quiero saber dónde se encuentra día
console.log(practicarTodo.indexOf("día"))
//quiero quitar día
console.log(practicarTodo.slice(5, 8))
//slice negativo
console.log(practicarTodo.slice(-10))

//ejercicios PG

function dominio(string) {
  return "http://www" + string
}
console.log(dominio("digitalhouse.com.ar"))

function reemplazoFastFast(texto, aReemplazar, reemplazo) {
  return texto.replace(aReemplazar, reemplazo)
}

console.log(reemplazoFastFast("Este texto es mala onda", "mala", "buena"))

function menciona(texto, palabra) {
  if (texto.indexOf(palabra) === -1) {
    return false
  } else {
    return true
  }
}
console.log(
  menciona(
    "Existen muchos lenguajes de programación y JavaScript es uno de ellos",
    "programación"
  )
)

let frase = "Hola!, soy Carli"
console.log(frase.indexOf("Carli"))
let licenciada = console.log(frase.slice(frase.indexOf("Carli")))
let licenciada2 = console.log(frase.slice(11))
