const fs = require("fs")

const jsonHelper = {
  leer(nombreArchivo) {
    const equipoStr = fs.readFileSync(__dirname + "/" + nombreArchivo, "utf-8")
    const equipos = JSON.parse(equipoStr)
    return equipos
  },
}

module.exports = jsonHelper
