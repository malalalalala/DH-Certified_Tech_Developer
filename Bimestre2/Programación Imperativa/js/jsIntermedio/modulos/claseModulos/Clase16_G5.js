let fs = require("fs")
// console.log(fs);

const jsonHelper = {
  leerJson: function (nombreArchivo) {
    const leer = fs.readFileSync(nombreArchivo, "utf-8")
    return JSON.parse(leer)
  },
  escribirJson: function (nombreArchivo, datos) {
    let dato = JSON.stringify(datos)
    return fs.writeFileSync(nombreArchivo, dato)
  },
}

module.exports = jsonHelper
