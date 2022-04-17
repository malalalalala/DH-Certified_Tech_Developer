const v = "\x1b[32m%s\x1b[0m";
const o = "*".repeat(80) + "\n";
const oo = "*".repeat(25);

/*  =================================================================

Te proveemos la siguiente plantilla que tiene tres partes:
 - Array de objetos que está colapsado aquí debajo.
 - Desarrollo de las consignas, donde escribirás el código que responda a los enunciados
 - Ejecución de las consignas, donde ejecutarás los métodos correspondientes mostrando por consola sus resultados 
================================================================= */
const nombre = "tu nombre aquí";
const tema = "el tema que te tocó";

const arrayDepartamentos = [
  {
    id: 1,
    propietarios: "Dueño: Luis Perez",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 42700
  },
  {
    id: 2,
    propietarios: "Dueñas: Martinez Hnas",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 29000
  },
  {
    id: 3,
    propietarios: "Dueña: Laura García",
    ambientes: 2,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 3,
    precioAlquiler: 53000
  },
  {
    id: 4,
    propietarios: "Dueña: Julieta Tols",
    ambientes: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 17900
  },
  {
    id: 5,
    propietarios: "Dueño: Pablo Groming",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: false,
    cantidadPersonas: 1,
    precioAlquiler: 24100
  },
  {
    id: 6,
    propietarios: "Dueñas: Martinez Hnas",
    ambientes: 2,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 46700
  },
  {
    id: 7,
    propietarios: "Dueño: Alberto Direck",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 37000
  },
  {
    id: 8,
    propietarios: "Dueña: Maria Gonzalez",
    ambientes: 4,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 5,
    precioAlquiler: 84000
  },
  {
    id: 9,
    propietarios: "Dueña: Martina García",
    ambientes: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 5,
    precioAlquiler: 74000
  },
  {
    id: 10,
    propietarios: "Dueña: Cristina Foldati",
    ambientes: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 3,
    precioAlquiler: 55800
  },
  {
    id: 11,
    propietarios: "Dueño: Ramiro Orwel",
    ambientes: 3,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 68000
  },
  {
    id: 12,
    propietarios: "Dueño: Juan Goldstein",
    ambientes: 3,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 4,
    precioAlquiler: 63000
  },
  {
    id: 13,
    propietarios: "Dueño: Juan Pablo Martinez",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 43200
  },
  {
    id: 14,
    propietarios: "Dueños: Ramirez y asociados",
    ambientes: 2,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 2,
    precioAlquiler: 40000
  },
  {
    id: 15,
    propietarios: "Dueños: Martín Gutierrez y José Torres",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 21500
  },
  {
    id: 16,
    propietarios: "Dueñas: Olga Fernandez y Victoria Paz",
    ambientes: 1,
    disponible: false,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 28000
  },
  {
    id: 17,
    propietarios: "Dueños: Ramirez y asociados",
    ambientes: 1,
    disponible: true,
    aceptaMascotas: true,
    cantidadPersonas: 1,
    precioAlquiler: 23000
  }
]


/*******************************/
/* Desarrollo de las consignas */
/*******************************/

let inmobiliaria = {
// A
  departamentos: arrayDepartamentos,
// B
/*
id: 2, precio $ 75000, está Disponible, 
4 ambientes, máximo 3 personas, acepta mascotas, 
propietarios: dueña: Laura Gutierrez
*/
  listarDepartamentos: function(arrayDptos){
    for(let i=0;i<arrayDptos.length;i++){
      let dpto = arrayDptos[i];
      let disponible = dpto.disponible == true ? "esta disponible" : "esta alquilado";
      let dptoString = "id: " + dpto.id + ", precio $" + dpto.precioAlquiler + " " +
      disponible 
      console.log(dptoString)
    }
  },
// C
  departamentosDisponibles: function(){
    let arrayResultado = []
    for(let i=0; i<this.departamentos.length;i++){
      let dpto = this.departamentos[i]
      if(dpto.disponible == true){
        arrayResultado.push(dpto)
      }
    }
    return arrayResultado
  },
// D
  buscarPorId: function(idDpto){
    for(let i=0; i<this.departamentos.length;i++){
      let dpto = this.departamentos[i]
      if(dpto.id == idDpto){
        return dpto        
      }
    }    
  },
  actualizarPrecio: function(idDpto, monto){
    dpto = this.buscarPorId(idDpto)
    dpto.precioAlquiler = monto
  },

// E
  buscarPorPrecio: function(unPrecio){
    let arrayDptos = []
    let disponibles = this.departamentosDisponibles()
    for(let i=0; i<disponibles.length;i++){
      let dpto = disponibles[i]
      if(dpto.precioAlquiler <= unPrecio){
        arrayDptos.push(dpto)
      }
    }
    return arrayDptos
  },
// F
  precioConImpuesto: function(unPorcentaje){
    let aux = unPorcentaje / 100 + 1  // 10% =  precio * 1,10
    for(let i=0; i<this.departamentos.length;i++){
      this.departamentos[i].precioAlquiler = this.departamentos[i].precioAlquiler * aux
    } 
    return this.departamentos      
  },
// G
  simplificarPropietarios: function(){
    for(let i=0; i<this.departamentos.length;i++){
/*
      "Dueños: ... ."
      "Dueño: ...."
      "Dueña: ..."
      "Dueñas: ..."
*/
      let dpto = this.departamentos[i]
      let indiceDosPuntos = dpto.propietarios.indexOf(":")
      let soloProps = dpto.propietarios.slice(indiceDosPuntos) // ": Juan y Julio"
      dpto.propietarios = "Prop." + soloProps
    } 
    return this.departamentos      
  }


}


/******************************/
/* Ejecución de las consignas */
/******************************/
console.table([{ alumno: nombre, tema: tema }]);

console.log(v, "\n" + oo + "   B. listarDepartamentos");
inmobiliaria.listarDepartamentos(arrayDepartamentos);
console.log(o);

console.log(v, oo + "   C. departamentosDisponibles");
console.log(inmobiliaria.departamentosDisponibles())
inmobiliaria.listarDepartamentos(inmobiliaria.departamentosDisponibles())
console.log(o);

console.log(v, oo + " D. buscarPorId");
// Ejecución aquí
console.log(o);

console.log(v, oo + "  E. buscarPorPrecio");
console.log(inmobiliaria.buscarPorPrecio(18000))
console.log(o);

console.log(v, oo + " F. precioConImpuesto");
// Ejecución aquí
console.log(o);

console.log(v, oo + " G. simplificarPropietarios");
console.log(inmobiliaria.simplificarPropietarios())
console.log(o);