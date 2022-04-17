// Un ciclo —ya sea en programación o la vida cotidiana— es una serie de estados por los que pasa un acontecimiento o fenómeno, que se repiten siempre en el mismo orden. En programación, para hacer que nuestro código se siga ejecutando, mientras una condición se cumpla, utilizamos el for.

// consta de (variable inicicalizadora, condición a evaluar//define cuántas iteraciones, modificador variable/incrementar o decrementar)
for (let i = 0; i < 10; i++) {
  console.log("el valor de i es igual a " + i)
}

// for (let i = 0; i < 10; i--) {
// //   console.log("el valor de i es igual a " + i)
// // }

for (let vuelta = 1; vuelta <= 5; vuelta++) {
  console.log("Dando la vuelta número " + vuelta)
}

function loro(texto) {
  for (let i = 1; i <= 5; i++) {
    console.log(texto)
  }
}

loro("holi")

function loro(texto) {
  for (let i = 0; i < 5; i++) {
    console.log(texto)
  }
}
loro("chau")

function noParesDeContarImparesHasta(numero) {
  let numeroImpar = 0
  for (let i = 0; i <= numero; i++) {
    if (i % 2 !== 0) {
      numeroImpar++
    }
  }
  return numeroImpar
}

console.log(noParesDeContarImparesHasta(4))
