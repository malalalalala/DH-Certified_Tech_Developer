window.onload = () => {

    let nombre
 
    while (!nombre) {
        nombre=prompt("por favor ingrese su nombre").trim()
    }

    let edad

  while (!edad) {
    edad=parseInt(prompt("por favor ingrese su edad"))
    
    }

    alert(`${nombre.toUpperCase()} el año pasado tenías ${Math.round(edad)-1} años y el próximo año cumplirás ${Math.round(edad)+1}`)

}


