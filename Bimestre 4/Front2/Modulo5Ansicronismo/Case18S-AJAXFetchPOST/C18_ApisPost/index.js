function enviarMensaje(evento) {
  // Obtenemos el elemento que disparo el evento
  const elemento = evento.target;
  console.log("Elemento que dispara el evento", elemento);

  // Cada elemento tiene la propiedad "dataset", la cual contiene
  // la informacion que le pasamos utilizando el atributo "data-"
  const dataset = elemento.dataset;
  console.log("Dataset del elemento", dataset);

  // Podemos acceder a cada valor de la misma manera que accedemos a la propiedad
  // de un objeto.
  const titulo = dataset.titulo;

  // Como el valor devuelto es un string, lo convertimos en un number.
  const idUsuario = Number(dataset.idUsuario);

  // Ahora que tenemos la informacion que necesitamos, realizamos nuestro
  // requests a la API.
  fetch("https://jsonplaceholder.typicode.com/posts", 
  {
    method: "POST",
    body: JSON.stringify({
            title: titulo,
            userId: idUsuario,
            }),
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  })
    .then((response) => response.json())
    .then((json) => {
      // Aqui obtenemos la respuesta de la API.
      console.log("Respuesta de la API", json);

      // Utilizamos la informacion para mostrar el mensaje en pantalla
      const contenedorMensaje = document.querySelector("#mensaje-posteado");

      contenedorMensaje.textContent = json.title;
    });
}

// Seleccionamos los elementos 'button'
const botones = document.querySelectorAll("button");

// Por cada boton, agregamos el listener para escuchar el evento 'click'.
botones.forEach((boton) => boton.addEventListener("click", enviarMensaje));
