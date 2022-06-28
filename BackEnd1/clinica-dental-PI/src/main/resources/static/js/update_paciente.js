window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_paciente_form');
    const baseUrl = (window.location).href;
    const pacienteId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);


    const url = '/pacientes'+"/"+pacienteId;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
        .then(response => response.json())
        .then(data => {

            let paciente = data;

            document.querySelector('#paciente_id').value = paciente.id;
            document.querySelector('#nombre').value = paciente.nombre;
            document.querySelector('#apellido').value = paciente.apellido;
            document.querySelector('#identificacion').value= paciente.dni;
            document.querySelector('#calle').value = paciente.domicilio.calle;
            document.querySelector('#number').value = paciente.domicilio.numero;
            document.querySelector('#localidad').value = paciente.domicilio.localidad;
            document.querySelector('#provincia').value = paciente.domicilio.provincia;

        }).catch(error => {

         alert("Error: " + error);
    })



    formulario.addEventListener('submit', function (event) {
        event.preventDefault()

        let fechaModificacion=new Date()

        const formData = {
            id: pacienteId,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            dni:document.querySelector('#identificacion').value,
            fechaIngreso:fechaModificacion,
            domicilio: {
                calle:document.querySelector('#calle').value,
                numero:document.querySelector('#number').value,
                localidad:document.querySelector('#localidad').value,
                provincia:document.querySelector('#provincia').value
            }
        };



        const url = '/pacientes';
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

              let successAlert = '<div class="alert alert-success alert-dismissible">' +
                  '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                  '<strong></strong> Información actualizada </div>'

              document.querySelector('#response').innerHTML = successAlert;
              document.querySelector('#response').style.display = "block";
              document.querySelector('#nombre').disabled = true
              document.querySelector('#apellido').disabled = true
              document.querySelector('#identificacion').disabled= true
              document.querySelector('#calle').disabled= true
              document.querySelector('#number').disabled= true
              document.querySelector('#localidad').disabled= true
              document.querySelector('#provincia').disabled= true
              resetUploadForm();

              setTimeout(function(){
                  window.location.href = "../views/pacienteList.html";
              }, 1000)
          })
          .catch(error => {
              //Si hay algun error se muestra un mensaje diciendo que el paciente
              //no se pudo guardar y se intente nuevamente
              let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                  '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                  '<strong> Error intente nuevamente</strong> </div>'

              document.querySelector('#response').innerHTML = errorAlert;
              document.querySelector('#response').style.display = "block";

              resetUploadForm();})

    })
 })

function resetUploadForm(){
    document.querySelector('#nombre').value = "";
    document.querySelector('#apellido').value = "";
    document.querySelector('#identificacion').value = "";
    document.querySelector('#calle').value = "";
    document.querySelector('#number').value = "";
    document.querySelector('#localidad').value = "";
    document.querySelector('#provincia').value = "";

}
