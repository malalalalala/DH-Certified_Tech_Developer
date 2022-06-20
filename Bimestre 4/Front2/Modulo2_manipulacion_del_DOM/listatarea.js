const tarea = document.getElementById("tarea1")
const btnTarea = document.getElementById("btn-tarea")
const btnActivar = document.getElementById("btn-activar")
const btn = document.getElementById("btn")

btnTarea.addEventListener("click", () => {
  tarea.classList.add("completada") //add agrega una clase al elemento
})
btnActivar.addEventListener("click", () => {
  tarea.classList.remove("completada") //add agrega una clase al elemento
})

btn.addEventListener("click", () => {
  document.body.classList.toggle("nueva") //add agrega una clase al elemento
})
