function enviarMensaje(evento) {
  // Obtenemos el elemento que disparo el evento
  const elemento = evento.target
  console.log('Elemento que dispara el evento', elemento)

  // Ahora que tenemos la informacion que necesitamos, realizamos nuestro
  // requests a la API.
  fetch('https://ctd-todo-api.herokuapp.com/v1/users', {
    method: 'POST',
    body: JSON.stringify({
      firstName: 'Laura',
      lastName: 'Ramos',
      email: 'laujhghgdsajsgfdsg@gmail.com',
      password: '123',
    }),
    headers: {
      'Content-type': 'application/json; charset=UTF-8',
    },
  })
    .then((response) => response.json())
    .then((json) => {
      // Aqui obtenemos la respuesta de la API.
      console.log('Respuesta de la API', json)
    })
}

// Seleccionamos los elementos 'button'
const boton = document.querySelector('button')
boton.addEventListener('click', (e) => {
  enviarMensaje(e)
})

// Por cada boton, agregamos el listener para escuchar el evento 'click'.
