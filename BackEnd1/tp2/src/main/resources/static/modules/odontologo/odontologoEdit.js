window.addEventListener('load', function () {
//    const idForm = document.querySelector('#search_by_id');
    const formulario = document.querySelector('#add_new_odontologo');
    const baseUrl = (window.location).href;
    const userId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);
//    document.querySelector('#id').value = user_id
//    formulario.style.display = 'none';

//    idForm.addEventListener('submit', function (event) {
//        event.preventDefault()
//    formulario.style.display = 'none';
//        const userId = document.querySelector('#id').value
        const url = '/odontologos/?id='+userId;
        const settings = {
            method: 'GET'
        }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
//        formulario.style.display="block";
        document.querySelector('#nombre').value = data.nombre
        document.querySelector('#apellido').value = data.apellido
        document.querySelector('#matricula').value = data.numeroDeMatricula
       })
//    })

    formulario.addEventListener('submit', function (event) {
        event.preventDefault()
        const formData = {
            id: userId,
//            id: document.querySelector('#id').value,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            numeroDeMatricula: document.querySelector('#matricula').value,
        };
        const url = '/odontologos';
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
                     '<strong></strong> Odontologo modificado </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
                 document.querySelector('#nombre').disabled = true
                 document.querySelector('#apellido').disabled = true
                 document.querySelector('#matricula').disabled = true
                 resetUploadForm();

                 setTimeout(function(){
                     window.location.href = "/modules/odontologo/odontologoList.html";
                 }, 3000)
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
    });


    function resetUploadForm(){
        document.querySelector('#nombre').value = "";
        document.querySelector('#apellido').value = "";
         document.querySelector('#matricula').value = "";

    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/odontologoList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
})