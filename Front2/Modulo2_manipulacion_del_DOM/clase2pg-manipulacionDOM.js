const titulo = document.querySelector("h1")
console.log(titulo)

const navBar = document.querySelector(".nav-bar")
console.log(navBar)

//un array de nodos
const losParrafos = document.querySelectorAll("p")
console.log(losParrafos)

for (const parrafo of losParrafos) {
  console.log(parrafo)
}

const strong = document.querySelector(".parrafo-especial strong")

if (strong) {
  console.log(strong)
}

// titulo.innerHTML = titulo.innerHTML + " Soy un nuevo título"
const parrafoEspecial = document.querySelector(".parrafo-especial")
if (parrafoEspecial) {
  parrafoEspecial.innerHTML = "un texto en <i>cursiva</i>"
  parrafoEspecial.innerText = "un texto en <i>cursiva</i>"
}
if (titulo) {
  titulo.innerHTML += " Soy un nuevo título"
}

// const template = `<h1>Hola Mundo!</h1>`
// const body2 = document.getElementById("body")
// console.log(body2)
// body2.innerHTML = template
// body2.innerText(template)

const escribirHTML = (titulo, texto) => {
  const body = document.getElementById("body")
  if (body) {
    const miTemplate = `<h1>${titulo}</h1>
        <p>${texto}</p>`
    body.innerHTML += miTemplate
  }
}

escribirHTML("Laura", "la mejor")
escribirHTML("Holi", "world")

let personaje = {
  nombre: "Michael",
  apellido: "Scott",
  nacimiento: {
    fecha: "15/04/1965",
    ciudad: "Scranton",
    estado: "Pensilvania",
  },
  imagenUrl:
    "https://upload.wikimedia.org/wikipedia/en/thumb/d/dc/MichaelScott.png/220px-MichaelScott.png",
  trabajo: {
    rol: "manager regional",
    compania: "Dunder Mifflin",
  },
}

const platillaDundler = `
<div style ='border:1px solid black;width:500px>'
<img src=${personaje.imagenUrl} width:'100%' alt=''>
<h3>Nombre</h3>
<h6>${personaje.nombre}</h6>
<a href="index.html">home</a>
`
const newBody = document.querySelector(".dunder")
console.log(newBody)
newBody.innerHTML = platillaDundler

const titulo2 = document.querySelector("h3")
console.log(titulo2.innerHTML)

const confirmation = confirm("querés cambiar el color del titulo?")

if (confirmation) {
  titulo2.style.color = "red"
  titulo2.style.fontSize = "50px"
  newBody.style.backgroundColor = "grey"
}
