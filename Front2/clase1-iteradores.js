const array = [1, 2, 3, 4, 5, 6]

const sumarArray = (array) => {
  let acumulador = array[0]
  for (let index = 1; index < array.length; index++) {
    acumulador += array[index]
    //console.log("el resultado es ", acumulador)
  }
}

sumarArray(array)

// let arrayGrupo2 = [1, 2, 4, 8]
// let total = array[0]
// for (let i = 1; i < arrayGrupo2.length; i++) {
//   total += arrayGrupo2[i]
//   console.log(total)
//   const ul = document.createElement("li")
//   ul.innerHTML = total
//   document.getElementById("title").appendChild(ul)
// }
