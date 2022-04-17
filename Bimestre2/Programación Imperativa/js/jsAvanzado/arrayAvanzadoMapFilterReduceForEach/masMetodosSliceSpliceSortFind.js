// .slice()
//Este método devuelve (extrae) una copia de una parte del array dentro de un  array (subarray). Determina el índice inicial y el final (opcional). El final no está incluido para el nuevo array.
// •Si el inicio es un valor negativo, extrae los últimos elementos del array desplazándose desde el final del mismo. Si es omitido, por defecto es 0. Si es mayor a array.length, devolverá array vacío.
// •Si el final es negativo, realiza un desplazamiento al final. Por ejemplo, array.slice(3, -1) extrae desde el cuarto elemento hasta el penúltimo. Si es mayor a array.length o si es omitido, extrae hasta el final del array,Más métodos de arrays

// array.slice(inicio, fin);

let numeros = [3, 4, 5, 6, 7]
let subArray = numeros.slice(0, 3)
console.log(subArray) // [3,4,5]

// .splice()
// Este método nos sirve para remover y/o agregar elementos de un array. Recibe tres parámetros:
// • inicio: el índice del primer elemento (de donde comenzará el cambio).
// • cant (opcional): un entero que indica la cantidad de elementos a eliminar. Si se
// omite o si es mayor que (array.length - inicio), se eliminarán todos los elementos
// desde el inicio.
// • items (opcional): indica los elementos que se agregarán en el array, desde
// inicio. Si se omite splice, solo elimina.

// array.splice(inicio, cant, item1, item2, ...)

// let numeros = [3, 4, 5, 6, 7]
numeros.splice(0, 0, 2)
console.log(numeros) // [2,3,4,5,6,7]
numeros.splice(1, 2)
console.log(numeros) // [2,5,6,7]

// .sort()
// Este método nos sirve para ordenar los elementos de un array.
// Recibe un callback como parámetro (opcional) que especifica el modo de ordenamiento. Si es omitido, el array es ordenado con el valor de string (Unicode). Convierte a string a cada elemento.
// La función recibe dos parámetros, que son los elementos a comparar, el primero vs. el segundo elemento.

//  .sort()
// Este método nos sirve para ordenar los elementos de un array.
// Recibe un callback como parámetro (opcional) que especifica el modo de ordenamiento. Si es omitido, el array es ordenado con el valor de string (Unicode). Convierte a string a cada elemento.
// La función recibe dos parámetros, que son los elementos a comparar, el primero vs. el segundo elemento.

// array.sort(); //ordenamiento con la posición de valor Unicode array.sort(callback); // la función como parámetro

// .find()
// Este método devuelve el valor del primer elemento de un array que cumple con una función especificada (callback).
// Recibe un callback que se ejecuta sobre cada índice del array hasta que encuentre uno que devuelve un valor verdadero, y toma tres parámetros:
// • elemento: se utiliza un alias para representar el valor del elemento actual que está procesando el array.
// • index (opcional): posición del elemento actual que se está procesando en el array.
// • array: que está siendo recorrido.

// {}
//  array.find(callback(e, array))
