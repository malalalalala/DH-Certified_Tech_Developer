window.addEventListener('load', function () {
    (function(){

        const url = '/turnos';
        const settings = {
            method: 'GET'
        }

        fetch(url,settings)
            .then(response => response.json())
            .then(data => {
                console.log('data turno',data)

                for(turno of data){
                    var table = document.getElementById("turnoTable");
                    var turnoRow =table.insertRow();
                    let tr_id = 'tr_' + turno.id;
                    turnoRow.id = tr_id;

                    let deleteButton = '<button' +
                        ' id=' + '\"' + 'btn_delete_' + turno.id + '\"' +
                        ' type="button" onclick="deleteBy('+turno.id+')" class="btn btn-danger btn_delete">' +
                        '🗑' +
                        '</button>';


                    let updateButton = '<a' +
                        ' id=' + '\"' + 'btn_id_' + turno.id + '\"' +
                        ' href="./turnoUpdate.html?id=' + turno.id + '" + class="btn btn-info btn_id">' +
                        `${turno.id} ✏ `+
                        '</a>';

                    turnoRow.innerHTML = '<td>' + updateButton + '</td>' +
                        '<td class=\"td_id_Odontologo\">' + turno.odontologo.id+ '</td>' +
                        '<td class=\"td_nombre_Odontologo\">' + turno.odontologo.nombre.toUpperCase()+ ' ' + turno.odontologo.apellido.toUpperCase() + '</td>' +
                        '<td class=\"td_id_Paciente\">' + turno.paciente.id+ '</td>' +
                        '<td class=\"td_nombre_Paciente\">' +  turno.paciente.nombre.toUpperCase() + ' ' + turno.paciente.apellido.toUpperCase() + '</td>' +
                        '<td class=\"td_fecha_cita\">' + dateFormat(turno.fecha, 'dd-MM-yyyy') + '</td>' +
                        '<td>' + deleteButton + '</td>';


                };

            })
    })

    (function(){
        let pathname = window.location.pathname;
        if (pathname == "/turnoList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    })

    //a simple date formatting function
    function dateFormat(inputDate, format) {
        //parse the input date
        const date = new Date(inputDate);

        //extract the parts of the date
        const day = date.getDate();
        const month = date.getMonth() + 1;
        const year = date.getFullYear();

        //replace the month
        format = format.replace("MM", month.toString().padStart(2,"0"));

        //replace the year
        if (format.indexOf("yyyy") > -1) {
            format = format.replace("yyyy", year.toString());
        } else if (format.indexOf("yy") > -1) {
            format = format.replace("yy", year.toString().substr(2,2));
        }

        //replace the day
        format = format.replace("dd", day.toString().padStart(2,"0"));

        return format;
    }


})