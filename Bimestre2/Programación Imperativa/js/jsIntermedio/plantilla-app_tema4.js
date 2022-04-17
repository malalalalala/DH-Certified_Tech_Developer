const v = "\x1b[32m%s\x1b[0m"
const o = "*".repeat(80) + "\n"
const oo = "*".repeat(25)
// Te proveemos la siguiente plantilla que tiene tres partes:
// - Array de objetos que está colapsado aquí debajo.
// - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
// - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados
const nombre = "Laura Ramos"
const tema = "TEMA 4"

const arrayProfesionales = [
  {
    id: 0,
    estaHabilitado: false,
    nombre: "Huber Wilkins",
    email: "huberwilkins#speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 3,
  },
  {
    id: 1,
    estaHabilitado: true,
    nombre: "Goldie Haley",
    email: "goldiehaley#speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 3,
  },
  {
    id: 2,
    estaHabilitado: false,
    nombre: "Pena Landry",
    email: "penalandry@speedbolt.com",
    especialidad: "Dermatologia",
    cantidadConsultas: 9,
  },
  {
    id: 3,
    estaHabilitado: false,
    nombre: "Leanne Burch",
    email: "leanneburch#speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 13,
  },
  {
    id: 4,
    estaHabilitado: false,
    nombre: "Haynes Fuentes",
    email: "haynesfuentes@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 75,
  },
  {
    id: 5,
    estaHabilitado: true,
    nombre: "Tamika Fuentes",
    email: "tamikanewman@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 32,
  },
  {
    id: 6,
    estaHabilitado: true,
    nombre: "Russo Baldwin",
    email: "russobaldwin@speedbolt.com",
    especialidad: "Dermatologia",
    cantidadConsultas: 67,
  },
  {
    id: 7,
    estaHabilitado: true,
    nombre: "Dodson Shaffer",
    email: "dodsonshaffer#speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 2,
  },
  {
    id: 8,
    estaHabilitado: true,
    nombre: "Guerra Bright",
    email: "guerrabright#speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 6,
  },
  {
    id: 9,
    estaHabilitado: true,
    nombre: "Dina Navarro",
    email: "dinanavarro@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 8,
  },
  {
    id: 10,
    estaHabilitado: false,
    nombre: "Stafford Watts",
    email: "staffordwatts@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 0,
  },
  {
    id: 11,
    estaHabilitado: false,
    nombre: "Joni Avery",
    email: "joniavery@speedbolt.com",
    especialidad: "Neumonologia",
    cantidadConsultas: 6,
  },
  {
    id: 12,
    estaHabilitado: true,
    nombre: "Mayra Tran",
    email: "mayratran@speedbolt.com",
    especialidad: "Oftamologia",
    cantidadConsultas: 2,
  },
  {
    id: 13,
    estaHabilitado: false,
    nombre: "Ward Dale",
    email: "warddale@speedbolt.com",
    especialidad: "Cardiologia",
    cantidadConsultas: 23,
  },
]

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

const appProfesionales = {
  // A.
  profesionales: arrayProfesionales,
  // B
  listarProfesionales(array) {
    for (let i = 0; i < array.length; i++) {
      const profesional = array[i]
      const estadoProfesional = profesional.estaHabilitado ? "ok" : "inactivo"
      console.log(
        `* id ${profesional.id}, ${estadoProfesional}, ${profesional.especialidad}, ${profesional.nombre}, consultas: ${profesional.cantidadConsultas}, email: ${profesional.email} `
      )
    }
  },
  // C

  filtrarHabilitadosPorEspecialidad(especialidad) {
    const profesionalesHabilitados = []
    for (let i = 0; i < this.profesionales.length; i++) {
      const profesional = this.profesionales[i]
      if (
        profesional.estaHabilitado &&
        profesional.especialidad === especialidad
      ) {
        profesionalesHabilitados.push(profesional)
      }
    }
    return profesionalesHabilitados
  },
  // D
  buscarPorID(id) {
    for (let i = 0; i < this.profesionales.length; i++) {
      const profesional = this.profesionales[i]
      if (id === profesional.id) {
        return profesional
      }
    }
  },

  // E
  realizarConsulta(id) {
    const profesional = this.buscarPorID(id)
    profesional.cantidadConsultas++
    return profesional
  },
  // F
  corregirEmails() {
    for (let i = 0; i < this.profesionales.length; i++) {
      const profesional = this.profesionales[i]
      profesional.email = profesional.email.replace("#", "@")
    }
    return this.profesionales
  },
}

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }])

console.log(v, "\n" + oo + "   B. listarProfesional")
appProfesionales.listarProfesionales(arrayProfesionales)
console.log(o)

console.log(v, oo + "   C. filtrarHabilitadosPorEspecialidad('Cardiologia')")
console.log(appProfesionales.filtrarHabilitadosPorEspecialidad("Cardiologia"))
//quise imprimirlo de las dos maneras
console.log(
  "**************   otra manera de imprimirlo más bonito  **************"
)
appProfesionales.listarProfesionales(
  appProfesionales.filtrarHabilitadosPorEspecialidad("Cardiologia")
)
console.log(o)

console.log(v, oo + " D. buscarPorId(1)")
console.log(appProfesionales.buscarPorID(1))
console.log(o)

console.log(v, oo + "  E. realizarConsulta()")
console.log(appProfesionales.realizarConsulta(1))
console.log(o)

console.log(v, oo + " F. corregirEmails")
console.log(appProfesionales.corregirEmails())
//quise imprimirlo de las dos maneras
console.log(
  "**************   otra manera de imprimirlo más bonito  **************"
)
appProfesionales.listarProfesionales(appProfesionales.corregirEmails())
console.log(o)

let prueba = "hola Mundo"
let temp = prueba.split("")
console.log("temp", temp)
prueba[0].toUpperCase()
console.log("prueba[0].toUpperCase()", prueba[0].toUpperCase())
temp[0] = temp[0].toUpperCase()
prueba = temp.join("")
console.log("pruebisima", prueba)
