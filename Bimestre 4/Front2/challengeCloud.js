window.onload = () => {

    let nombre
 
    while (!nombre) {
        nombre=prompt("por favor ingrese su nombre").trim()
    }

    let edad

  while (!edad) {
    edad=prompt("por favor ingrese su edad")
    }

    edadNumerica=parseInt(edad)

    console.log(isNaN(edadNumerica));
    
    while(isNaN(edadNumerica)){
        edad=prompt("formato de edad incorrecto,por favor ingrese su edad en años")
        console.log('isNan?',isNaN(edadNumerica));
        console.log('typeof',typeof(edadNumerica));
    }
   




}
