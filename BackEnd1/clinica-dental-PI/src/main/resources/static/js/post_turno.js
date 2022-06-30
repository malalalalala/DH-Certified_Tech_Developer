window.addEventListener('load', function () {


    const formulario = document.querySelector('#add_new_turno');

    const idOdontologoInput = document.querySelector('#id_odontologo');
    const idPacienteInput  = document.querySelector('#id_paciente');




    idOdontologoInput.addEventListener('blur', function (event){
        event.preventDefault()
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
            .then(data => {

                console.log('dataodontoloto',data)
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
                // console.log('datapaciente',data)
                // if (Array.isArray(data)){
                //     document.querySelector('#nombre_paciente').value = "";
                // }
                // else {
                    document.querySelector('#nombre_paciente').value = paciente.nombre +' '+paciente.apellido;
                // }

            }).catch(error => {


            console.log(error)
            document.querySelector('#id_paciente').value = "";
            document.querySelector('#nombre_paciente').value = "";
        })
    });

    formulario.addEventListener('submit', function (event) {
    event.preventDefault();

        const formData = {
            odontologo:{
                id:document.querySelector('#id_odontologo').value,
            },
            paciente:{
                id:document.querySelector('#id_paciente').value,
            }
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
               setTimeout(function(){
                   window.location.href = "../turnoList.html";
               }, 1000)
            })
            .catch(error => {
                    let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                                     '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
                                     '<strong> Error intente nuevamente</strong> </div>'

                      document.querySelector('#response').innerHTML = errorAlert;
                      document.querySelector('#response').style.display = "block";
                     resetUploadForm();})

        console.log("formData",formData)


    });


    function resetUploadForm(){
        document.querySelector('#id_odontologo').value = "";
        document.querySelector('#nombre_odontologo').value = "";
        document.querySelector('#id_paciente').value = "";
        document.querySelector('#nombre_paciente').value = "";

    }

    // (function(){
    //     let pathname = window.location.pathname;
    //     if(pathname === "/"){
    //         document.querySelector(".nav .nav-item a:first").addClass("active");
    //     } else if (pathname == "/turnoList.html") {
    //         document.querySelector(".nav .nav-item a:last").addClass("active");
    //     }
    // })();
});