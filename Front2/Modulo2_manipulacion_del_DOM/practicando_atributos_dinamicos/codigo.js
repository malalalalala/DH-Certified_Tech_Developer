//1- Agregar a la tarjeta, el atributo "class" con el valor "card"
const container = document.getElementById("tarjeta")
container.setAttribute("class", "card")
console.log("container", container.getAttribute("class"))

//2- Agregar a la imagen, el atributo "src" con el valor "https://www.youtube.com/img/desktop/yt_1200.png"

const image = document.querySelector("img")
image.setAttribute("src", "https://www.youtube.com/img/desktop/yt_1200.png")

//3- Quitarle al titulo la clase que le está dando un formato feo

const titulo = document.querySelector("h1")
titulo.removeAttribute("class", "tirulo-feo")

//4- Chequear si el link a youtube posee o no el atributo href

const linkYoutube = document.getElementById("link_youtube")
linkYoutube.hasAttribute("href")
console.log("linkYoutube.hasAttribute", linkYoutube.hasAttribute("href"))

//5- Obtener el href del link a wikipedia y mostrarlo por consola

const linkWikipedia = document.getElementById("link_wikipedia")
linkYoutube.hasAttribute("href")
console.log("linkWikipedia.getAttribute", linkWikipedia.getAttribute("href"))
