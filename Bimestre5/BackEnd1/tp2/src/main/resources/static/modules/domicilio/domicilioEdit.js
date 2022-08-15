window.addEventListener('load', function () {
    const formulario = document.querySelector('#add_new_domicilio');
    const baseUrl = (window.location).href;
    const domicilioId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);

        const url = '/domicilios/?id='+domicilioId;
        const settings = {
            method: 'GET'
        }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
        document.querySelector('#calle').value = data.calle
        document.querySelector('#numero').value = data.numero
        document.querySelector('#localidad').value = data.localidad
        document.querySelector('#provincia').value = data.provincia
       })

    formulario.addEventListener('submit', function (event) {
        event.preventDefault()
        const formData = {
            id: domicilioId,
            calle: document.querySelector('#calle').value,
            numero: document.querySelector('#numero').value,
            localidad: document.querySelector('#localidad').value,
            provincia: document.querySelector('#provincia').value,
        };
        const url = '/domicilios';
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
                     '<strong></strong> Domicilio modificado </div>'

                 document.querySelector('#response').innerHTML = successAlert;
                 document.querySelector('#response').style.display = "block";
                 document.querySelector('#calle').disabled = true
                 document.querySelector('#numero').disabled = true
                 document.querySelector('#localidad').disabled = true
                 document.querySelector('#provincia').disabled = true
                 resetUploadForm();

                 setTimeout(function(){
                     window.location.href = "/modules/domicilio/domicilioList.html";
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
     document.querySelector('#calle').value = ""
     document.querySelector('#numero').value = ""
     document.querySelector('#localidad').value = ""
     document.querySelector('#provincia').value = ""
    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/domicilioList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })();
})