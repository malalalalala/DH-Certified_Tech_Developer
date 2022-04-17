// ¿Por qué es tan popular JSON?En la web, la mayoría de las peticiones y sus respuestas viajan como texto plano, es decir, texto sin codificaciones especiales.JSON, al ser una cadena de texto simple, es unformato ideal para transmitir informaciónentre sitios y aplicaciones web. Especialmente si tenemos en cuenta que JavaScript está presente en todos los navegadores modernos

//no soporta métodos

const amigos = ["lau", "coco", "sus", "tata"]

const amigos2 = JSON.stringify(amigos)

console.log("array", amigos)
console.log("amigos_json", amigos2)

console.log("array tipo", typeof amigos)
console.log("amigos_json tipo", typeof amigos2)

const amigosOriginal = JSON.parse(amigos2)
console.log("amigosOriginal", amigosOriginal)
console.log("amigosOriginal TIPO", typeof amigosOriginal)

let curso = {
  candtidadDeAlumnos: 32,
  docentes: ["Nacho", "Javier"],
  horario: "de 19 a 21 hrs",
}

console.log("curso", curso)
console.log("curso tipo", typeof curso)

let cursoJSON = JSON.stringify(curso)

console.log("curso_json", cursoJSON)
console.log("curso_json tipo", typeof cursoJSON)

let cursostring = JSON.parse(cursoJSON)
console.log("cursostring", cursostring)
console.log("cursostring tipo", typeof cursostring)

// C13S
