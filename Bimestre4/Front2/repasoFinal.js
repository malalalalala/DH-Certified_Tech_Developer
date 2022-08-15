// ¿Qué muestra en consola este código? *
let nombre = 'Pedro'
const mostrarNombre = (nombre) => {
  console.log('entré')
  console.log('nombre acullá', nombre)
  console.log(nombre !== undefined)
  if (nombre !== undefined) {
    nombre = 'tu nombre es ' + nombre
    console.log('nombre allá', nombre)
  }
  console.log('nombre aquí', nombre)
}
mostrarNombre('Juan')

console.log(nombre)

// ¿Cuál sería la linea faltante en el código para borrar la palabra 'gente?' de lafrase? *¿Por qué el DOM y el documento HTML tienen los mismos elementos?

let frase = 'hola qué tal gente?'
let array = frase.split(' ')
console.log('array split', array)
array.pop()
console.log('array', array)
array.push('gente')
console.log('array', array)
array.splice(3)
frase = array.join(' ')
console.log('frase', frase)

//¿Que lógica ejecuta este bloque gracias al método math.random? *

for (var index = 0; index < 10; index++) {
  var count = 0
  let aleatorio = Math.random()
  console.log('MathRandom', aleatorio)
  let aleatorioPorDiez = aleatorio * 10
  console.log('aleatorioPorDiez', aleatorioPorDiez)
  let floor = Math.floor(aleatorioPorDiez)
  console.log('floor', floor)

  for (var index2 = 0; index2 < Math.floor(Math.random() * 10); index2++) {
    count++
  }

  console.log(count)
}
