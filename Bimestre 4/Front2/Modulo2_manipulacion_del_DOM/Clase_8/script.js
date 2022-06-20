let i = 0
let btn = document.getElementById("btn")
btn.addEventListener("click", () => {
  document.querySelector("p").innerHTML = ++i
  console.log(i)
})

let n = 0
let crono = document.getElementById("number")
let cont = setInterval(() => {
  crono.innerHTML = n++
}, 1000) //la funcion se va a reproducir cada 1 segundo

let btnCont = document.getElementById("btn-cont")
btnCont.addEventListener("click", () => {
  clearInterval(cont)
})
