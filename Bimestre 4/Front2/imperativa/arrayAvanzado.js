// Map

//recibe como parámetro

const numeros = [2, 4, 6]
const dobleDeLosNumeros = numeros.map((elemento) => elemento * 2)

console.log("MapdobleDeLosNumeros", dobleDeLosNumeros)

//Filter

//recorre el array y devuelve solo los elementos que cumplan la condición

const edades = [10, 40, 50, 8, 59, 21, 7]
const mayores = edades.filter((elemento) => elemento >= 18)
console.log("Filter mayores", mayores)

//Reduce

//recibe un callback, se ejecuta sobre array y recorre uno a uno los elementos del array, tiene como finalidad reducir a la más mínima expresión el array dado. El callback recibe dos parámetros

const resultado = numeros.reduce((acumulador, numero) => acumulador + numero)
console.log("reduce ", resultado)

//forEach() recibe callback, no retorna nada

const notas = [10, 4, 5, 8, 9, 2, 7]

const notasHasta100 = notas.map((nota) => nota * 100)

console.log("MapNotasHasta100", notasHasta100)

const notasAprobadas = notas.filter((nota) => nota >= 7)

console.log("filternotasAprobadas", notasAprobadas)

const sumaNotas = notas.reduce((acum, nota) => acum + nota)

console.log("reducesumaNotas", sumaNotas)

notas.forEach((valor, indice) => {
  console.log(indice)
  console.log(valor)
})

let horariosPartida = [12, 14, 18, 21]

let horariosAtrasados = horariosPartida.map((hora) => hora - 1)

let estudiantes = [
  { nombre: "John", promedio: 8.5, aprobado: true },
  { nombre: "Jane", promedio: 7, aprobado: true },
  { nombre: "June", promedio: 3, aprobado: false },
]

let aprobados = estudiantes.filter((estudiante) => estudiante.aprobado)

let desaprobados = estudiantes.filter((estudiante) => !estudiante.aprobado)

let vueltas = [5, 8, 12, 3, 22]

let totalVueltas = vueltas.reduce((acum, vuelta) => acum + vuelta)

let listaDeSuperMercado = [
  "Bife de chorizo",
  "Coca Cola",
  "Bananas",
  "Lechuga",
  "Chimichurri",
  "Lata de tomates",
  "Arvejas",
  "Cereales",
  "Pechuga de pollo",
  "Leche",
]

listaDeSuperMercado.forEach((elemento) => console.log(elemento))
