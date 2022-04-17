let semaforo = "verde";

switch (semaforo) {
  case "verde":
    console.log("puedo cruzar");
    break;
  case "amarillo":
    console.log("tené precaución");
    break;
  case "rojo":
    console.log("no cruzar");
    break;
  default:
    console.log("no funciona el semáforo");
    break;
}

let fruta = "wefwef";
switch (fruta) {
  case "manzana":
    console.log("Qué rica la manzana");
    break;
  case "naranja":
    console.log("¡Naranja, me encanta!");
    break;
  default:
    console.log("¿Qué fruta es?");
}

function finDeSemana(dia) {
  if (dia == "viernes") {
    console.log("buen finde");
  } else if (dia == "lunes") {
    console.log("buena semana");
  } else {
    console.log("buen dia");
  }
}

finDeSemana("holi");

let dia = "jueves";
function finDeSemana2(dia) {
  switch (dia) {
    case "viernes":
      console.log("buen finde");
      break;
    case "lunes":
      console.log("buena semana");
      break;
    default:
      console.log("buen dia");
  }
}

finDeSemana2();

// agrupamiento

// // switch (expresión) {case valorA:case valorB:// código a ejecutar si la expresión es igual a ValorA o
// Bbreak
// case valorC://código a ejecutar si valorC es verdaderobreak}{}Los condicionales

function tengoClases(dia) {
  switch (dia) {
    case "lunes":
    case "miércoles":
    case "viernes":
      console.log("tenés clases");
      break;
    default:
      console.log("no tenés clases");
  }
}

tengoClases("miércoles");
console.log(tengoClases("viernes"));
