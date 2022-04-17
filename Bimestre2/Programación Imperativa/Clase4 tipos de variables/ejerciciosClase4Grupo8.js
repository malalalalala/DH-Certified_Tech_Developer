//ir al trabajo
let diaHabil = true
let horaDeIngreso = 9
let duracionViaje = 1
let tipoDeTransporte = 'bus'
let diaLluvioso = false
let boletoTransporte = false
let costoViaje = 2400


console.log('día Hábil', diaHabil)
console.log('hora de ingreso', horaDeIngreso)
console.log('duracion Viaje', duracionViaje)
console.log('dia Lluvioso', diaLluvioso)
console.log('boleto Transporte', boletoTransporte)
console.log('costoViaje', costoViaje)

//preparar desayuno

let cantidadIngredientes = 5
let tieneFruta = false
let tieneAzucar = false
let ingredientes = ['café', 'queso', 'pan', 'huevo', 'yogurt']

console.log('cantidad Ingredientes', cantidadIngredientes)
console.log('tiene Fruta', tieneFruta)
console.log('tiene Azucar', tieneAzucar)
console.log('ingredientes', ingredientes)

//invertir contenido cajones

let cajonRemeras = 'pantalones'
let cajonPantalones = 'remeras'
let cajonVacio = null

function invertir() {
    cajonVacio = cajonPantalones
    cajonPantalones = cajonRemeras
    cajonRemeras = cajonVacio
    cajonVacio = null
    // return `cajon vacio contiene ${cajonVacio} cajon pantalones contiene ${cajonPantalones} cajon remeras contiene ${cajonRemeras} `
    return 'cajon vacío contiene ' + cajonVacio + ' cajon pantalones contiene ' + cajonPantalones + ' cajon remeras contiene ' + cajonRemeras
}

console.log(invertir())