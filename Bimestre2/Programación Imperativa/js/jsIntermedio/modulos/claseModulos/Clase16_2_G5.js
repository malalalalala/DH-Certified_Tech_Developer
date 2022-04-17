let funciones = require("./Clase16_G5")
let holi =
  "/Users/laura.ramos/Desktop/Cursos/DH-CertifiedTechDeveloper/Programación Imperativa/js/jsIntermedio/modulos/claseModulos/AUTOS.json"

let concesionaria = {
  autos: funciones.leerJson(holi),
  agregarAuto(marca, modelo, anio, precio, patente) {
    let nuevoAuto = {
      marca,
      modelo,
      anio,
      precio,
      patente,
      vendido: false,
    }
    this.autos.push(nuevoAuto)
    funciones.escribirJson(holi, this.autos) // modifico el JSON original
    return "Vehículo agregado correctamente"
  },
  venderAuto: function (patente) {
    for (let i = 0; i < this.autos.length; i++) {
      const seleccionado = this.autos[i]
      if (patente == seleccionado.patente) {
        seleccionado.vendido = true
        funciones.escribirJson(holi, this.autos) // modifico el JSON original
        return (
          "El vehículo: " +
          seleccionado.marca +
          " " +
          seleccionado.modelo +
          " ha sido vendido"
        )
      }
    }
  },
  totalDeVentas() {
    let totalVendido = 0
    for (let i = 0; i < this.autos.length; i++) {
      const auto = this.autos[i]
      auto.vendido ? (totalVendido += auto.precio) : 0
    }
    return totalVendido
  },

  //   Eliminar elementos según su índice
  // Ahora procedemos a eliminar elementos usando como referencia su índice, o lo que es lo mismo, su posición dentro del array. Para ello nos valemos de un método llamado splice.
  // Esta función sirve tanto para añadir un elemento en determinada posición, como para borrarlo. Pero como este post trata de la eliminar, voy a centrarme solo en eso.
  // Este método usado para borrar devuelve un array con los elementos que hemos eliminado
  // El método si estamos intentando eliminar requiere solo de dos parámetros:
  // El primero indica donde se comenzará a cambiar el array (con 0 como origen). Si supera la longitud del array, el punto inicial será la longitud del array. Si es negativo, empezará esa cantidad de elementos contando desde el final.
  // El número de elementos a eliminar del array. Si le damos un valor más alto que los elementos restantes (arr.length - start) simplemente borra todos los que falten. Si podemos un 0 o un número negativo no borra nada.
  eliminarAuto(patente) {
    for (let i = 0; i < this.autos.length; i++) {
      const auto = this.autos[i]
      if (patente == auto.patente) {
        this.autos.splice(i, 1)
        funciones.escribirJson(holi, this.autos) // modifico el JSON original
        return "se elimino" + auto.patente
      }
    }
  },
}

//console.log(concesionaria.agregarAuto("Ford", "1", "2", "3", "4"))
// console.log(funciones.leerJson(holi))
// console.log(concesionaria.venderAuto("WAU329"))
// console.log(funciones.leerJson(holi))
// console.log(concesionaria.totalDeVentas())
console.log(concesionaria.eliminarAuto("4")) //elimina ok
console.log(funciones.leerJson(holi))
