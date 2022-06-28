window.addEventListener('load', function () {


    console.log('entré ac{a')

    //Buscamos y obtenemos el formulario donde estan
    //los datos que el usuario pudo haber modificado del odontolohgo
    const formulario = document.querySelector('#update_odontologo_form');
    const baseUrl = (window.location).href;
    const userId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);

    console.log("user id",userId)

    const url = '/odontologos'+"/"+userId;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
        .then(response => response.json())
        .then(data => {
            console.log('data',data)
            let odontologo = data;
            document.querySelector('#odontologo_id').value = odontologo.id;
            document.querySelector('#nombre').value = odontologo.nombre;
            document.querySelector('#apellido').value = odontologo.apellido;
            document.querySelector('#matricula').value = odontologo.nroMatricula;
            // //el formulario por default esta oculto y al editar se habilita
            // document.querySelector('#div_odontologo_updating').style.display = "block";
        }).catch(error => {

        console.log('llegue aca')
        console.log('error',error)
        // alert("Error: " + error);
    })

    formulario.addEventListener('submit', function (event) {
        event.preventDefault()



        //creamos un JSON que tendrá los datos del odontologo
        //a diferencia de un odontologo nuevo en este caso enviamos el id
        //para poder identificarlo y modificarlo para no cargarlo como nuevo
        const formData = {
            id: userId,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            nroMatricula: document.querySelector('#matricula').value,
        };

        console.log('form data')

        //invocamos utilizando la función fetch la API odontologos con el método PUT que modificará
        //al odontologo que enviaremos en formato JSON
        const url = '/odontologos';
        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }
          fetch(url,settings)
          .then(response => response.json())
          .then(data => {
              console.log(data)
              let successAlert = '<div class="alert alert-success alert-dismissible">' +
                  '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                  '<strong></strong> Información actualizada </div>'

              document.querySelector('#response').innerHTML = successAlert;
              document.querySelector('#response').style.display = "block";
              document.querySelector('#nombre').disabled = true
              document.querySelector('#apellido').disabled = true
              document.querySelector('#matricula').disabled = true
              resetUploadForm();

              setTimeout(function(){
                  window.location.href = "/odontologoList.html";
              }, 1000)
          })
          .catch(error => {
              //Si hay algun error se muestra un mensaje diciendo que el odontologo
              //no se pudo guardar y se intente nuevamente
              let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                  '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                  '<strong> Error intente nuevamente</strong> </div>'

              document.querySelector('#response').innerHTML = errorAlert;
              document.querySelector('#response').style.display = "block";
              //se dejan todos los campos vacíos por si se quiere ingresar otro odontologo
              resetUploadForm();})

    })
 })

function resetUploadForm(){
    document.querySelector('#nombre').value = "";
    document.querySelector('#apellido').value = "";
    document.querySelector('#matricula').value = "";

}
