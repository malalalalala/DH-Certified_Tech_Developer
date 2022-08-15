let darkTheme = confirm("¿Desea aplicar el modo nocturno?")

if (darkTheme) {
  applyDarkTheme()
}

function applyDarkTheme() {
  let body = document.querySelector("body")
  let title = document.querySelector("h1")
  let items = document.getElementsByClassName("item")
  body.classList.add("body-dark")
  title.classList.add("title-dark")
  for (item of items) {
    item.classList.add("item-dark")
    item.classList.add("item-child-dark")
  }
}
