window.addEventListener('load', function () {
    (function(){

        const url = '/odontologos';
        const settings = {
            method: 'GET'
        }

        fetch(url,settings)
            .then(response => response.json())
            .then(data => {

                for(odontologo of data){
                       var table = document.getElementById("odontologoTable");
                    var odontologoRow =table.insertRow();
                    let tr_id = 'tr_' + odontologo.id;
                    odontologoRow.id = tr_id;


                    let deleteButton = '<button' +
                        ' id=' + '\"' + 'btn_delete_' + odontologo.id + '\"' +
                        ' type="button" onclick="deleteBy('+odontologo.id+')" class="btn btn-danger btn_delete">' +
                        '🗑' +
                        '</button>';


                    let updateButton = '<a' +
                        ' id=' + '\"' + 'btn_id_' + odontologo.id + '\"' +
                        ' href="./odontologoUpdate.html?id=' + odontologo.id + '" + class="btn btn-info btn_id">' +
                        `${odontologo.id} ✏ ` +
                        '</a>';


                    odontologoRow.innerHTML = '<td>' + updateButton + '</td>' +
                        '<td class=\"td_nombre\">' + odontologo.nombre.toUpperCase() + '</td>' +
                        '<td class=\"td_apellido\">' + odontologo.apellido.toUpperCase() + '</td>' +
                        '<td class=\"td_matricula\">' + odontologo.nroMatricula + '</td>' +
                        '<td>' + deleteButton + '</td>';

                };

            })
    })

    (function(){
        let pathname = window.location.pathname;
        if (pathname == "/odontologoList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })


})