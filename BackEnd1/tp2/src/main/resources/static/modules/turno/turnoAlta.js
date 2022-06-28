window.addEventListener('load', function () {

      const url = '/odontologos';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
            let odontologos = document.getElementById("odontologos");
            let options = '<option selected disabled value="">Seleccionar Odontologo:</option>'
             for(odontologo of data){
                options += '<option value="' + odontologo.id + '">'+odontologo.nombre + ' ' + odontologo.apellido+'</option> '
            };
            odontologos.innerHTML = options
    })


          const urlPacientes = '/pacientes';
          const settingsPacientes = {
            method: 'GET'
          }

          fetch(urlPacientes,settingsPacientes)
          .then(response => response.json())
          .then(data => {
                let pacientes = document.getElementById("pacientes");
                let optionsPaciente = '<option selected disabled value="">Seleccionar Paciente:</option>'
                 for(paciente of data){
                    optionsPaciente += '<option value="' + paciente.id + '">'+paciente.nombre + ' ' + paciente.apellido+'</option> '
                };
                pacientes.innerHTML = optionsPaciente
        })

    const formulario = document.querySelector('#add_new_turno');
    formulario.addEventListener('submit', function (event) {
        event.preventDefault()
        const formData = {
            odontologoId: Number(document.querySelector('#odontologos').value),
            pacienteId: Number(document.querySelector('#pacientes').value),
            fecha: document.querySelector('#fecha').value,
        };
        const url = '/turnos';
        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then(response => response.json())
            .then(data => {
                 let successAlert = '<div class="alert alert-success alert-dismissible">' +
                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                     '<strong></strong> Turno agregado </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
                 resetUploadForm();
                odontologoId: document.querySelector('#odontologos').disabled = true
                pacienteId: document.querySelector('#pacientes').disabled = true
                fecha: document.querySelector('#fecha').disabled = true

                  setTimeout(function(){
                      window.location.href = "/modules/turno/turnoList.html";
                  }, 3000)
            })
            .catch(error => {
                    let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                                     '<strong> Error intente nuevamente</strong> </div>'

                      document.querySelector('#response').innerHTML = errorAlert;
                      document.querySelector('#response').style.display = "block";
                     resetUploadForm();})
    });


    function resetUploadForm(){
        document.querySelector('#odontologos').value = "";
        document.querySelector('#pacientes').value = "";
         document.querySelector('#fecha').value = "";
    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/turnoList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
})