const v = "\x1b[32m%s\x1b[0m" // NO TOCAR
const o = "*".repeat(80) + "\n" // NO TOCAR
const oo = "*".repeat(25) // NO TOCAR
// Te proveemos la siguiente plantilla que tiene dos partes:
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Laura Victoria Ramos Agudelo"
const tema = "Tema 2"

const archivo = require(__dirname + "/jsonHelper")
/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const arrayPeliculas = archivo.leerJson("peliculas")
// A
const gestionDePeliculas = {
  // B
  peliculas: arrayPeliculas,
  // C
  listarPeliculas(arrayPelis) {
    arrayPelis.forEach((peli) => {
      console.log(
        `${peli.titulo}, de ${peli.director}. Duración: ${peli.duracion} minutos, ${peli.genero}, (${peli.calificacionIMDB}/ 10 en IMDB)`
      )
    })
  },
  // D
  buscarPorId(id) {
    return this.peliculas.find((peli) => peli.id === id)
  },
  // E
  peliculasPorGenero(genero) {
    return this.peliculas.filter((peli) => peli.genero === genero)
  },
  // F
  filtrarPorCalificacion(calificacionMin, calificacionMax) {
    return this.peliculas.filter(
      (peli) =>
        peli.calificacionIMDB >= calificacionMin &&
        peli.calificacionIMDB <= calificacionMax
    )
  },
  // G
  ordenarPorDuracion() {
    return this.peliculas.sort((a, b) => b.duracion - a.duracion)
  },
  // H
  duracionPromedio() {
    const sumaDuracion = this.peliculas.reduce(
      (acum, peli) => acum + peli.duracion,
      0
    )
    const promedio = sumaDuracion / this.peliculas.length
    return `El promedio de duración de las películas es de ${promedio} minutos`
  },
  // I
  modificarGeneroPorId(id, genero) {
    pelicula = this.buscarPorId(id)
    if (pelicula) {
      pelicula.genero = genero
      archivo.escribirJson("peliculas", this.peliculas)
      return pelicula
    }
  },
}

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]) // NO MODIFICAR NADA DE ESTA LINEA
console.table(gestionDePeliculas.peliculas)
console.log(v, "\n" + oo + " .C. Listar")
gestionDePeliculas.listarPeliculas(arrayPeliculas)
console.log(o)

console.log(v, oo + " .D. Buscar")
console.table(gestionDePeliculas.buscarPorId(1))
console.log(o)

console.log(v, oo + " .E. Filtrar 1")
gestionDePeliculas.listarPeliculas(
  gestionDePeliculas.peliculasPorGenero("Horror")
)
console.log(o)

console.log(v, oo + " .F. Filtrar 2")
gestionDePeliculas.listarPeliculas(
  gestionDePeliculas.filtrarPorCalificacion(5, 8)
)
console.log(o)

console.log(v, oo + " .G. Ordenar")
gestionDePeliculas.listarPeliculas(
  gestionDePeliculas.ordenarPorDuracion(arrayPeliculas)
)
console.log(o)

console.log(v, oo + " .H. Duracion")
console.log(gestionDePeliculas.duracionPromedio())
console.log(o)

console.log(v, oo + " .I. Modificar Propiedad")

console.table(gestionDePeliculas.modificarGeneroPorId(1, "Suspenso"))
console.table(gestionDePeliculas.buscarPorId(1))
console.log(o)
