let fs = require("fs")

let jsonHelper = {
    leer: function(nombreArchivo){
        let textoJson = fs.readFileSync(__dirname + "/" + nombreArchivo, "utf-8")
        let unArray = JSON.parse(textoJson)
        return unArray
    },
    escribir: function(nombreArchivo, unArray){
        let miArchivo = __dirname + '/' + nombreArchivo
        let arrayStr = JSON.stringify(unArray)
        fs.writeFileSync(miArchivo, arrayStr)        
    }
}

module.exports = jsonHelper


