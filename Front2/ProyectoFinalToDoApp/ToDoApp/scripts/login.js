window.addEventListener('load', function () {
  /* ---------------------- obtenemos variables globales ---------------------- */
  const form = document.forms[0]
  const email = document.querySelector('#inputEmail')
  const password = document.querySelector('#inputPassword')
  const url = 'https://ctd-todo-api.herokuapp.com/v1'

  /* -------------------------------------------------------------------------- */
  /*            FUNCIÓN 1: Escuchamos el submit y preparamos el envío           */
  /* -------------------------------------------------------------------------- */
  form.addEventListener('submit', function (event) {
    event.preventDefault()
    const infoLogin = {
      email: email.value,
      password: password.value,
    }
    const settings = {
      method: 'POST',
      body: JSON.stringify(infoLogin),
      headers: {
        'Content-Type': 'application/json',
      },
    }
    realizarLogin(settings)
  })

  /* -------------------------------------------------------------------------- */
  /*                     FUNCIÓN 2: Realizar el login [POST]                    */
  /* -------------------------------------------------------------------------- */
  function realizarLogin(settings) {
    console.log('Estamos realizando el login')
    fetch(`${url}/users/login`, settings)
      .then((response) => {
        console.log(response)
        if (!response.ok) {
          alert('Algunos de los datos son incorrectos')
        }
        return response.json()
      })
      .then((data) => {
        console.log('Promesa cumplida:')
        console.log(data)

        if (data.jwt) {
          //guardo en LocalStorage el objeto con el token
          localStorage.setItem('jwt', JSON.stringify(data.jwt))

          //redireccionamos a la página
          //   location.replace('/mis-tareas.html')
        }
      })
      .catch((err) => {
        console.log('Promesa rechazada:')
        console.log(err)
      })
  }
})
