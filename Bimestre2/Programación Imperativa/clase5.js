//VALORES
let a = 5;
let b = a; // similar a let b = 5

console.log(a); 
console.log(b);
a = 3
console.log(a); 
console.log(b);

let nombre = "Martin";
let nombre2 = nombre;

nombre = "Cosme"; // modifico el valor de la variable nombre
console.log(nombre2); //nombre2 sigue con el valor que se asigno en la linea 12
/*
Para memoria a y b son variables diferentes que contienen valores diferentes
con los objetos (objetos literales, arrays, funciones), pasa de forma diferente, no ocupa un espacio fijo en memoria como lo son con los tipos de datos primitivos, es decir , no se almacenan de la misma forma que los tipos de datos primitivos.

*Concepto HEAP, memoria dinamica, es el area de memoria destinada para almacenar objetos, es un espacio mas grande pero mas lento
otro concepto importante es la *REFERENCIA, que es la posicion en memoria que se utilizar para acceder a un objeto en js, 
entonces lo que sucede es que no estamos asignando el valor de un objeto a una variable, si no que estamos asignando la referencia del mismo
*/

//REFERENCIA
const persona = {
    nombre : 'Martín',
    pasatiempos : ['Programar', 'Enseñar a pensar', 'Tomar mates'],
    edad : 25 
}

const persona2 = persona;
//imprimimos y observamos que es la misma persona, 
console.log(persona);
console.log(persona2);

//pero ahora lo que queremos es editar la persona2, por que " Martín hay uno solo"
persona2.nombre = "Cosme";

//imprimimos vemos que la propiedad nombre de las dos persona se modificaron, por que aputan al mismo espacio de memoria, 
//si en cualquiera de los dos se modificará algo se verá reflejado en el otro.
console.log(persona);
console.log(persona2);