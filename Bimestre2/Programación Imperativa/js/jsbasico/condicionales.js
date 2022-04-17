let clima='lluvioso'
let dia='lunes'

if(clima==='soleado'&&dia==='domingo'){
    console.log('lindo día para pasear')
}else if (clima==='soleado'&&dia==='lunes'){
    console.log('podría salir igual')
}else{ console.log('mejore me quedo en casi practicando js')}

let edad =19
let acceso = ' '
if (edad <16) {  acceso = 'prohibido'} 
else if (edad >=16&& edad <=18) {  acceso = 'permitido solo acompañado de un mayor'} 
else { acceso= 'permitido'}

console.log(acceso)

let dato=true
if(dato){
    console.log('es true')
}else{ console.log('es false')}

function puedePasar(nombre) {
    if(nombre=== "Cosme Fulanito"){
    return false
}else{ return true}}