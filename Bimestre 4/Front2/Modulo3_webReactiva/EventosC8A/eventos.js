window.onload = () => {}

// window.addEventListener("load", () => {
//   alert(1)
// })

const homebtn = document.querySelector(".home-btn")

homebtn.addEventListener("click", () => {
  alert("toca el botón")
  homebtn.style.color = "red"
})

homebtn.addEventListener("mouseover", () => {
  homebtn.style.color = "red"
})

homebtn.addEventListener("mouseout", () => {
  homebtn.style.color = "green"
})

const aboutBtn = document.querySelector(".about-btn")

aboutBtn.addEventListener("click", (e) => {
  console.log(e)
  console.log("thos", this)
  e.preventDefault() //no me scrollea hasta about
  alert("saber sobre el about")
})

const divHola = document.querySelectorAll(".holi")

for (const div of divHola) {
  addEventListener("mouseover", () => {
    div.style.backgroundColor = "blue"
  })
}

for (let index = 0; index < divHola.length; index++) {
  divHola[index].addEventListener("mouseout", function () {
    this.style.backgroundColor = "red"
  })
}
