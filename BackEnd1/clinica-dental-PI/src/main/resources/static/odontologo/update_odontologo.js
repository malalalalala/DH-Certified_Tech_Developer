window.addEventListener('load', function () {

    const formulario = document.querySelector('#update_odontologo_form');
    const baseUrl = (window.location).href;
    const userId = baseUrl.substring(baseUrl.lastIndexOf('=') + 1);


    const url = '/odontologos'+"/"+userId;
    const settings = {
        method: 'GET'
    }
    console.log('userId',userId)
    console.log('userId',typeof userId )
    console.log('url update',url)
    fetch(url,settings)
        .then(response => response.json())
        .then(data => {

            let odontologo = data;
            document.querySelector('#odontologo_id').value = odontologo.id;
            document.querySelector('#nombre').value = odontologo.nombre;
            document.querySelector('#apellido').value = odontologo.apellido;
            document.querySelector('#matricula').value = odontologo.nroMatricula;

        }).catch(error => {


         alert("Error: " + error);
    })

    formulario.addEventListener('submit', function (event) {
        event.preventDefault()


        const formData = {
            id: userId,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            nroMatricula: document.querySelector('#matricula').value,
        };


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
                  window.location.href = "odontologoList.html";
              }, 1000)
          })
          .catch(error => {

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
    document.querySelector('#matricula').value = "";

}
