let vuelta = 1
while (vuelta <= 5) {
  console.log("Dando la vuelta número " + vuelta)
  vuelta++
} //al final de cada vuelta sumara 1 a vuelta};

// let vuelta = 1while(vuelta <= 5) {console.log('Dando la vuelta número '+ vuelta);  vuelta++};{}El loop infinito sucede cuando nuestra condición es constantemente verdadera, lo que resulta en ejecutar nuestro código eternamente. Esto puede causar varios problemas, el más importante siendo que trabe todo nuestro programa

// El ciclo do while es similar al while, pero se diferencia en que sin importar la condición, la acción se realizará al menos una vezLos ciclos

let vuelta2 = 5
do {
  console.log("Dando la vueltica número " + vuelta2)
  vuelta++
} while (vuelta <= 5) //Se suma 1 a vuelta por lo tanto vuelta = 6}

function encontreUn5(numeros) {
  let posicion = 0
  do {
    if (numeros[posicion] !== 5) {
      console.log("Se encontró un " + numeros[posicion])
      posicion++
    } else {
      return console.log("Se encontró un 5!")
    }
  } while (posicion < numeros.length)
}

encontreUn5([1, 3, 2, 5, 6, 7, 5])

//template `

function tablaDeMultiplicar(numero) {
  let vuelta = 1
  while (vuelta <= 10) {
    console.log(`${numero} * ${vuelta} = ${numero * vuelta}`)
    vuelta++
  }
}

tablaDeMultiplicar(20)

function tablaDeMultiplicar2(numero) {
  let i = 1
  while (i <= 10) {
    console.log(numero + " " + "*" + " " + i + " = " + " " + numero * i)
    i++
  }
}

tablaDeMultiplicar2(20)
