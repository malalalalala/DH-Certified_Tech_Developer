window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_turno_form');
    const baseUrl = (window.location).href;
    const turnoId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);


    const url = '/turnos'+"/"+turnoId;
    const settings = {
        method: 'GET'
    }
    fetch(url,settings)
        .then(response => response.json())
        .then(data => {

            let turno = data;

            document.querySelector('#turno_id').value = turno.id;
            document.querySelector('#id_odontologo').value=turno.odontologo.id
            document.querySelector('#nombre_odontologo').value = turno.odontologo.nombre+' '+turno.odontologo.apellido
            document.querySelector('#id_paciente').value=turno.paciente.id
            document.querySelector('#nombre_paciente').value = turno.paciente.nombre+' '+turno.paciente.apellido;

        }).catch(error => {

         alert("Error: " + error);
    })


    const idOdontologoInput = document.querySelector('#id_odontologo');
    const idPacienteInput  = document.querySelector('#id_paciente');

    console.log('idOdontologoInput',idOdontologoInput)
    console.log('idPacienteInput',idPacienteInput)

    idOdontologoInput.addEventListener('blur', function (event){
        event.preventDefault()
        console.log('hice blur')
        let idOdontologo = document.querySelector('#id_odontologo').value;
        console.log('idodontologo',idOdontologo)
        console.log('tipo',typeof idOdontologo )
        const url = '/odontologos'+"/"+idOdontologo;
        const settings = {
            method: 'GET'
        }
        console.log('url blur',url)
        fetch(url,settings)
            .then(response => {
                if (response.ok) {
                    return response.json()
                } else if(response.status === 404) {
                    alert("Error: el odontólogo no existe");
                    return Promise.reject('error 404')
                } else {
                    return Promise.reject('some other error: ' + response.status)
                }
            })
            .then(data => {                console.log('dataodontoloto',data)
                let odontologo = data;
                document.querySelector('#nombre_odontologo').value = odontologo.nombre +' '+odontologo.apellido
                // idOdontologo = idOdontologo? odontologo.nombre+' '+odontologo.apellido:" ";
            }).catch(error => {

            document.querySelector('#id_odontologo').value = "";
            document.querySelector('#nombre_odontologo').value = "";
        })
    });

    idPacienteInput.addEventListener('blur', function (event){
        let idPaciente = document.querySelector('#id_paciente').value;

        const url = '/pacientes'+"/"+idPaciente;
        const settings = {
            method: 'GET'
        }
        console.log('idPaciente',idPaciente)
        console.log('tipo',typeof idPaciente )
        console.log('url paciente',url)
        fetch(url,settings)
            .then(response => {
                if (response.ok) {
                    return response.json()
                } else if(response.status === 404) {
                    alert("Error: el odontólogo no existe");
                    return Promise.reject('error 404')
                } else {
                    return Promise.reject('some other error: ' + response.status)
                }
            })
            .then(data => {

                let paciente = data;
                console.log('datapaciente',data)
                if (Array.isArray(data)){
                    document.querySelector('#nombre_paciente').value = "";
                }
                else {
                    document.querySelector('#nombre_paciente').value = paciente.nombre +' '+paciente.apellido;
                }

            }).catch(error => {
     
            console.log(error)
            document.querySelector('#id_paciente').value = "";
            document.querySelector('#nombre_paciente').value = "";
        })
    });


    formulario.addEventListener('submit', function (event) {
        event.preventDefault()

        let fechaModificacion=new Date()

        const formData = {
            id: turnoId,
            odontologo: {
                id:document.querySelector('#id_odontologo').value,
                },
            paciente: {
                id:document.querySelector('#id_paciente').value,
                       }
        };



        const url = '/turnos';
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
              document.querySelector('#turno_id').disabled = true
              document.querySelector('#id_odontologo').disabled = true
              document.querySelector('#id_paciente').disabled= true
              document.querySelector('#nombre_odontologo').disabled= true
              document.querySelector('#nombre_paciente').disabled= true

              resetUploadForm();

              setTimeout(function(){
                  window.location.href = "../views/turnoList.html";
              }, 1000)
          })
          .catch(error => {
              //Si hay algun error se muestra un mensaje diciendo que el turno
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
    document.querySelector('#turno_id').value = "";
    document.querySelector('#id_odontologo').value = "";
    document.querySelector('#nombre_odontologo').value = "";
    document.querySelector('#id_paciente').value = "";
    document.querySelector('#nombre_paciente').value = "";

}
