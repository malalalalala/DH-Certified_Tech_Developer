let curso = {
  candtidadDeAlumnos: 32,
  docentes: ["Nacho", "Javier"],
  horario: "de 19 a 21 hrs",
  notificaciones: function () {
    return "El horario de la cursada es " + this.horario
  },
}
//hace referencia al objeto al cual estamos instanciando q estña invocando la func
console.log(curso)
console.log(curso.candtidadDeAlumnos)
console.log(curso.notificaciones())

let curso2 = {
  candtidadDeAlumnos: 32,
  docentes: ["Nacho", "Javier"],
  horario: "de 19 a 21 hrs",
  notificaciones: function () {
    return "El horario de la cursada es " + curso2.horario // mala prsctica
  },
}
console.log(curso2.notificaciones())

//Función constructora, nunca pueden ser usadas como arrow function

function Curso(candtidadDeAlumnos, docentes, horario) {
  this.candtidadDeAlumnos = candtidadDeAlumnos
  this.docentes = docentes
  this.horario = horario
}

let cursoProgramacion = new Curso(25, ["Lura", "Laura"], "de 8 a 5")
console.log(cursoProgramacion)
let cursoMarketing = new Curso(30, ["lll", "llllllllo"], "de 8 a 5")
console.log(cursoMarketing)

let miPais = {
  nombre: "Argentina",
  poblacion: 4009200,
  capital: "Buenos Aires",
  decirNacionalidad: function () {
    return "Yo nací en " + this.nombre
  },
}

console.log(miPais.decirNacionalidad())

let tenista = {
  nombre: "Roger",
  edad: 38,
  activo: true,
  saludar: function () {
    return "¡Hola! Me llamo Roger"
  },
}

console.log(tenista.saludar())

let tenista2 = {
  nombre: "Roger",
  apellido: "Federer",
  saludar: function () {
    return "¡Hola! Me llamo " + this.nombre
  },
}
console.log(tenista2.saludar())

function Auto(marca, modelo) {
  this.marca = marca
  this.modelo = modelo
}

let miAuto = new Auto("Ford", "Falcon")
let miOtroAuto = new Auto("Chevrolet", "Corvette")

console.log(miAuto)
console.log(miOtroAuto)

let perro = {
  nombre: "gua",
  edad: 25,
  vacunado: false,
}

let deportista = {
  energia: 100,
  experiencia: 10,
  nombre: "Aimar",
  entrenarHoras: function (cantidadHoras) {
    ;(this.energia -= cantidadHoras * 5),
      (this.experiencia += cantidadHoras * 2)
  },
}

console.log("==Antes de comenzar entrenamiento==")
console.log("Deportista energia: " + deportista.energia)
console.log("Deportista experiencia: " + deportista.experiencia)
console.log("==ENTRENANDO==")
deportista.entrenarHoras(5)
console.log("==FIN ENTRENAMIENTO==")
console.log("Deportista energia: " + deportista.energia)
console.log("Deportista experiencia: " + deportista.experiencia)
