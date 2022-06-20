// var botonVerMas = document.createElement("button") // Guardamos en botonVerMas un botón
// var botonTexto = document.createTextNode("Ver más") // Guardamos en botonTexto "Ver más"
// botonVerMas.appendchild(botonTexto) // Agregamos botonTexto dentro de botonVerMas
// document.body.appendChild(botonVerMas) //  Agregamos botonVerMas dentro del body

let elemento = document.querySelector("#portada")
elemento.getAttribute("src")
console.log("src get", elemento.getAttribute("src"))
console.log("src has", elemento.hasAttribute("src"))
console.log("src remove", elemento.removeAttribute("src"))
console.log("src set", elemento.setAttribute("src", "imagen_portada.png"))
