window.addEventListener('load', function () {


    const formulario = document.querySelector('#add_new_paciente');


    formulario.addEventListener('submit', function (event) {
    event.preventDefault();

        const formData = {
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            dni:document.querySelector('#identificacion').value,
            domicilio:{
                calle:document.querySelector('#calle').value,
                numero:document.querySelector('#number').value,
                localidad:document.querySelector('#localidad').value,
                provincia:document.querySelector('#provincia').value
            }
        };

        const url = '/pacientes';
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
                     '<strong></strong> Paciente agregado </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
                 resetUploadForm();
               setTimeout(function(){
                   window.location.href = "../pacienteList.html";
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
        document.querySelector('#nombre').value = "";
        document.querySelector('#apellido').value = "";
        document.querySelector('#identificacion').value = "";
        document.querySelector('#calle').value = "";
        document.querySelector('#number').value = "";
        document.querySelector('#localidad').value = "";
        document.querySelector('#provincia').value = "";

    }

    // (function(){
    //     let pathname = window.location.pathname;
    //     if(pathname === "/"){
    //         document.querySelector(".nav .nav-item a:first").addClass("active");
    //     } else if (pathname == "/pacienteList.html") {
    //         document.querySelector(".nav .nav-item a:last").addClass("active");
    //     }
    // })();
});