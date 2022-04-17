const v = "\x1b[32m%s\x1b[0m"
const o = "*".repeat(80) + "\n"
const oo = "*".repeat(25)

/*  =================================================================

Te proveemos la siguiente plantilla que tiene tres partes:
 - Array de objetos que está colapsado aquí debajo.
 - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
 - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados 
================================================================= */
const nombre = "tu nombre aquí"
const tema = "el tema que te tocó"

const arrayDepartamentos = [
  {
    id: 1,
    propietarios: "Dueño: Luis Perez",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 42700,
  },
  {
    id: 2,
    propietarios: "Dueñas: Martinez Hnas",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 29000,
  },
  {
    id: 3,
    propietarios: "Dueña: Laura García",
    ambientes: 2,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 3,
    precioAlquiler: 53000,
  },
  {
    id: 4,
    propietarios: "Dueña: Julieta Tols",
    ambientes: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 17900,
  },
  {
    id: 5,
    propietarios: "Dueño: Pablo Groming",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 1,
    precioAlquiler: 24100,
  },
  {
    id: 6,
    propietarios: "Dueñas: Martinez Hnas",
    ambientes: 2,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 46700,
  },
  {
    id: 7,
    propietarios: "Dueño: Alberto Direck",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 37000,
  },
  {
    id: 8,
    propietarios: "Dueña: Maria Gonzalez",
    ambientes: 4,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 5,
    precioAlquiler: 84000,
  },
  {
    id: 9,
    propietarios: "Dueña: Martina García",
    ambientes: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 5,
    precioAlquiler: 74000,
  },
  {
    id: 10,
    propietarios: "Dueña: Cristina Foldati",
    ambientes: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 55800,
  },
  {
    id: 11,
    propietarios: "Dueño: Ramiro Orwel",
    ambientes: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 68000,
  },
  {
    id: 12,
    propietarios: "Dueño: Juan Goldstein",
    ambientes: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 63000,
  },
  {
    id: 13,
    propietarios: "Dueño: Juan Pablo Martinez",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 43200,
  },
  {
    id: 14,
    propietarios: "Dueños: Ramirez y asociados",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 40000,
  },
  {
    id: 15,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 21500,
  },
  {
    id: 16,
    propietarios: "Dueñas: Olga Fernandez y Victoria Paz",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 28000,
  },
  {
    id: 17,
    propietarios: "Dueños: Ramirez y asociados",
    ambientes: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 23000,
  },
]

/*******************************/
/* Desarrollo de las consignas */
/*******************************/

let inmobiliaria = {
  departamentos: arrayDepartamentos,
  // A

  // id: 1,
  // propietarios: "Dueño: Luis Perez",
  // ambientes: 2,
  // disponible: true,
  // aceptaMascotas: true,
  // cantidadPersonas: 2,
  // precioAlquiler: 42700,
  // B

  listarDepartamentos(arrayDptos) {
    for (let i = 0; i < arrayDptos.length; i++) {
      const depto = arrayDptos[i]
      const disponible = depto.disponible
        ? "está disponible"
        : "no está disponible"
      const mascotas = depto.disponible
        ? "acepta mascotas"
        : "no acepta mascotas"
      console.log(
        `id: ${depto.id}, precio $${depto.precioAlquiler}, ${disponible}, ${depto.ambientes} ambientes, máximo ${depto.cantidadPersonas} personas, ${mascotas}, propietarios: dueña: ${depto.propietarios}`
      )
    }
  },

  // C

  departamentosDisponibles() {
    const listaDeptosDiponibles = []
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i]
      depto.disponible ? listaDeptosDiponibles.push(depto) : null
    }
    return listaDeptosDiponibles
  },

  // D

  buscarPorid(id) {
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i]
      if (id === depto.id) {
        return depto
      }
    }
  },

  // E

  buscarPorPrecio(precio) {
    const arrayDeptosPrecio = []
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i]
      depto.precioAlquiler <= precio ? arrayDeptosPrecio.push(depto) : null
    }
    return arrayDeptosPrecio
  },

  // F

  precioConImpuesto(unPorcentaje) {
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i]
      depto.precioAlquiler = depto.precioAlquiler * (unPorcentaje / 100 + 1)
    }
    return this.departamentos
  },

  // G

  simplificarPropietarios() {
    for (let i = 0; i < this.departamentos.length; i++) {
      const depto = this.departamentos[i]
      const indiceDosPuntos = depto.propietarios.indexOf(":")
      const soloProps = depto.propietarios.slice(indiceDosPuntos)
      depto.propietarios = "Prop." + soloProps
    }
    return this.departamentos
  },

  alquilarDepartamento(id) {
    const depto = this.buscarPorid(id)
    depto.disponible = false
    // return `departamento con id: ${id} está alquilado ${depto}`
    return depto
  },

  // NOMBRES TIENE LONGITUD 3 =LENGTH
  // INDICES DE NOMBRE 0 1 2
  // console.log("este es mi posición 0", nombres[0])

  filtrarPetFriendly() {
    let deptoAceptanMascotas = []
    for (let i = 0; i < this.departamentos.length; i++) {
      if (this.departamentos[i].aceptaMascotas == true) {
        deptoAceptanMascotas.push(this.departamentos[i])
      }
    }
    return deptoAceptanMascotas
    //
  },

  cambiarPropietario(id) {
    const depto = this.buscarPorid(id)
    depto.propietarios = "La dueña es Laura"
    // return `departamento con id: ${id} está alquilado ${depto}`
    return depto
  },

  rebajasPorNoAlquiler() {
    const depto = this.departamentosDisponibles()
    for (let i = 0; i < depto.length; i++) {
      depto[i].precioAlquiler = depto[i].precioAlquiler * 0.9
    }
    return depto
  },

  buscarPorPropietarios(nombre) {
    const arrayDeptosPropietarios = []
    for (let i = 0; i < this.departamentos.length; i++) {
      const dpto = this.departamentos[i]
      if (dpto.propietarios.includes(nombre)) {
        arrayDeptosPropietarios.push(dpto)
      }
    }
    return arrayDeptosPropietarios
  },
}

// const index = dpto.propietarios.indexOf(nombre)
// const inicioDuenos = dpto.propietarios.slice(index)
// dpto.propietarios = inicioDuenos + nombre

/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }])

console.log(v, "\n" + oo + "   B. listarDepartamentos")

console.log(inmobiliaria.departamentos)
inmobiliaria.listarDepartamentos(arrayDepartamentos)
console.log(o)

console.log(v, oo + "   C. departamentosDisponibles")
console.log(inmobiliaria.departamentosDisponibles())
console.log(o)

console.log(v, oo + " D. buscarPorId")
console.log(inmobiliaria.buscarPorid(15))
console.log(o)

console.log(v, oo + "  E. buscarPorPrecio")
console.log(inmobiliaria.buscarPorPrecio(50000))
console.log(o)

console.log(v, oo + " F. precioConImpuesto")
console.log(inmobiliaria.precioConImpuesto(10))
console.log(o)

console.log(v, oo + " G. simplificarPropietarios")
inmobiliaria.listarDepartamentos(inmobiliaria.simplificarPropietarios())
console.log(o)

console.log(v, oo + " H. alquilarDepartamento")
console.log(inmobiliaria.alquilarDepartamento(1))
console.log(o)

console.log(v, oo + " I. CambiarPropietario")
console.log(inmobiliaria.buscarPorid(1))
console.log(inmobiliaria.cambiarPropietario(1))
console.log(o)

console.log(v, oo + " J. filtrarPetFriendly")
console.log(inmobiliaria.filtrarPetFriendly())
console.log(o)

console.log(v, oo + " K. rebajasPorNoAlquiler")
inmobiliaria.listarDepartamentos(inmobiliaria.departamentos)
console.log("REBAJADOOOOOOOOOOOOS")
inmobiliaria.listarDepartamentos(inmobiliaria.rebajasPorNoAlquiler())
console.log(o)

console.log(v, oo + " H. buscarPorPropietarios")
inmobiliaria.listarDepartamentos(inmobiliaria.departamentos)
console.log("DESPUÉS DEL FILTROOOO")
inmobiliaria.listarDepartamentos(inmobiliaria.buscarPorPropietarios("Laura"))
console.log(o)
