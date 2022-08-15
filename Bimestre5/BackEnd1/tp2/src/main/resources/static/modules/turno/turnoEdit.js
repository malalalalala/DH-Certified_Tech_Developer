window.addEventListener('load', function () {

    const formulario = document.querySelector('#add_new_turno');
    const baseUrl = (window.location).href;
    const turnoId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);
    let odontologoSeleccionado = 0
    let pacienteSeleccionado = 0

        const urlTurno = '/turnos/?id='+turnoId;
        const settingsTurno = {
            method: 'GET'
        }

      fetch(urlTurno,settingsTurno)
      .then(response => response.json())
      .then(data => {
      console.log(data)
      odontologoSeleccionado = data.odontologo.id
      pacienteSeleccionado = data.paciente.id
        document.querySelector('#odontologos').value = data.odontologo.id
        document.querySelector('#pacientes').value = data.paciente.id
        document.querySelector('#fecha').value = data.fecha.substring(0,10);
       })

      const url = '/odontologos';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
            let odontologos = document.getElementById("odontologos");
            let options = '<option disabled value="">Seleccionar Odontologo:</option>'
             for(odontologo of data){
//                options += '<option value="' + odontologo.id + '">'+odontologo.nombre + ' ' + odontologo.apellido+'</option> '
                options += `<option value="${odontologo.id}" ${odontologo.id == odontologoSeleccionado ? 'selected' : ''}>${odontologo.nombre} ${odontologo.apellido}</option>`;
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
                let optionsPaciente = '<option disabled value="">Seleccionar Paciente:</option>'
                 for(paciente of data){
//                    optionsPaciente += '<option value="' + paciente.id + '">'+paciente.nombre + ' ' + paciente.apellido+'</option> '
                    optionsPaciente += `<option value="${paciente.id}" ${paciente.id == pacienteSeleccionado ? 'selected' : ''}>${paciente.nombre} ${paciente.apellido}</option>`;
                };
                pacientes.innerHTML = optionsPaciente
        })


    formulario.addEventListener('submit', function (event) {
        event.preventDefault()
        const formData = {
            id: Number(turnoId),
            odontologoId: Number(document.querySelector('#odontologos').value),
            pacienteId: Number(document.querySelector('#pacientes').value),
            fecha: document.querySelector('#fecha').value,
        };
        console.log(formData)
        const url = '/turnos';
        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then(response => response.json())
            .then(data => {
                console.log(data)
                 let successAlert = '<div class="alert alert-success alert-dismissible">' +
                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                     '<strong></strong> Turno modificado </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
            odontologoId: document.querySelector('#odontologos').disabled = true
            pacienteId: document.querySelector('#pacientes').disabled = true
            fecha: document.querySelector('#fecha').disabled = true
                 resetUploadForm();

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
     document.querySelector('#odontologos').value = ""
     document.querySelector('#pacientes').value = ""
     document.querySelector('#fecha').value = ""
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