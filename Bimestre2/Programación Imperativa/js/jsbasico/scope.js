let mensaje = 'Hola'

function saludar() {
    let mensaje = 'Chau'
    return mensaje
}
console.log('mensaje', mensaje)
console.log('saludar', saludar())

function saludar2(nombre = 'Visitante', apellido = 'anónimo') {
    return 'Hola ' + nombre + ' ' + apellido
}
console.log('saludar2 hola grupo', saludar2())
