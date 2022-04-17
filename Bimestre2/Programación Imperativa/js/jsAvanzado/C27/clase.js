const fs = require("fs")

const equipoStr = fs.readFileSync(__dirname + "/equipo.json", "UTF-8")

console.log(__dirname)

const equipos = JSON.parse(equipoStr)
