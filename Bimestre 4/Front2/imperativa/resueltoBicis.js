const v = "\x1b[32m%s\x1b[0m"; // NO TOCAR
const o = "*".repeat(80) + "\n"; // NO TOCAR
const oo = "*".repeat(25); // NO TOCAR

/*******************************/
/* Desarrollo de las consignas */
/*******************************/
const jsonHelper = require("./jsonHelper");

// A
const carreraBicis = {
  // B
  bicicletas: jsonHelper.leerJson("bicicletas"),
  // C
  bicicletasPorTanda: 4,
  // D
  ciclistasHabilitados: function () {
    return this.bicicletas.filter((bici) => !bici.sancionado);
  },
  // E
  listarBicicletas: function (arrayBicicletas) {
    arrayBicicletas.forEach((bici) => {
      let estado = bici.dopaje ? "sancionado" : "habilitado";
      console.log(
        `Ciclista: ${bici.ciclista}, marca: ${bici.marca}, rodado: ${bici.rodado}, peso: ${bici.peso}kg, largo: ${bici.largo}cm, estado: ${estado}.`
      );
    });
  },
  // F
  buscarPorId: function (id) {
    return this.bicicletas.find((bici) => bici.id === id);
  },
  // G
  filtrarPorpeso: function (peso) {
    return this.ciclistasHabilitados().filter((bici) => bici.peso <= peso);
  },
  // H
  ordenarPorRodado: function () {
    return this.bicicletas.sort((a, b) => a.rodado - b.rodado);
  },
  // I
  largoPromedio: function () {
    let sumatoria = this.bicicletas.reduce(
      (acum, bici) => acum + bici.largo,
      0
    );
    let promedio = sumatoria / this.bicicletas.length;
    return `El largo promedio de bicicletas es de ${promedio}cm`;
  },
  // J
  aumentarPeso: function (cantidad, id) {
    let bicicleta = this.buscarPorId(id);
    if (bicicleta) {
      bicicleta.peso += cantidad;
      jsonHelper.escribirJson("bicicletas", this.bicicletas);
    }
  },
  // K
  generarTanda: function (rodado, peso) {
    let habilitados = this.ciclistasHabilitados();
    let filtrados = habilitados.filter(
      (bici) => bici.peso >= peso && bici.rodado <= rodado
    );
    return filtrados.slice(0, this.bicicletasPorTanda);
  },
  // L
  calcularPodio: function (tanda) {
    let tandaDeMayorAMenor = tanda.sort((a, b) => b.puntaje - a.puntaje);
    let primero = tandaDeMayorAMenor[0];
    let segundo = tandaDeMayorAMenor[1];
    let tercero = tandaDeMayorAMenor[2];

    console.log(
      `El primero es ${primero.ciclista} con un puntaje de ${primero.puntaje}`
    );
    console.log(
      `El segundo puesto es para ${segundo.ciclista} con un puntaje de ${segundo.puntaje}`
    );
    console.log(
      `El tercer puesto es para ${tercero.ciclista} con un puntaje de ${tercero.puntaje}`
    );
  },
};

/******************************/
/* Ejecución de las consignas */
/******************************/

console.log(v, "\n" + oo + " .D. ");
// Ejecución aquí
carreraBicis.listarBicicletas(carreraBicis.ciclistasHabilitados());
console.log(o);

console.log(v, oo + " .E.");
// Ejecución aquí
carreraBicis.listarBicicletas(carreraBicis.bicicletas);
console.log(o);

console.log(v, oo + " .F.");
// Ejecución aquí
console.log(carreraBicis.buscarPorId(5));
console.log(o);

console.log(v, oo + " .G.");
// Ejecución aquí
carreraBicis.listarBicicletas(carreraBicis.filtrarPorpeso(8));
console.log(o);

console.log(v, oo + " .H.");
// Ejecución aquí
carreraBicis.listarBicicletas(carreraBicis.ordenarPorRodado());
console.log(o);

console.log(v, oo + " .I.");
// Ejecución aquí
console.log(carreraBicis.largoPromedio());
console.log(o);

console.log(v, oo + " .J. ");
// Ejecución aquí
console.log(carreraBicis.buscarPorId(4));
carreraBicis.aumentarPeso(1.5, 4);
console.log(carreraBicis.buscarPorId(4));
console.log(o);

console.log(v, oo + " .K. ");
// Ejecución aquí
carreraBicis.listarBicicletas(carreraBicis.generarTanda(25, 8));
console.log(o);

console.log(v, oo + " .L. ");
// Ejecución aquí
carreraBicis.calcularPodio(carreraBicis.generarTanda(25, 8));
console.log(o);
