window.addEventListener('load', function () {
    (function(){
      const url = '/turnos';
      const settings = {
        method: 'GET'
      }
      const dateOptions = { year: 'numeric', month: 'long', day: 'numeric' }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
         for(turno of data){
            var table = document.getElementById("turnoTableBody");
            var turnoRow =table.insertRow();
            let tr_id = 'tr_' + turno.id;
            turnoRow.id = tr_id;
            let fecha = new Date(turno.fecha)
            fecha.setDate(fecha.getDate() + 1)
            const odontologo = turno.odontologo.nombre + ' ' + turno.odontologo.apellido
            const paciente = turno.paciente.nombre + ' ' + turno.paciente.apellido
            turnoRow.innerHTML = '<td class=\"td_id\">' + turno.id + '</td>' +
                    '<td class=\"td_odontologo\">' + odontologo + '</td>' +
                    '<td class=\"td_paciente\">' + paciente + '</td>' +
                    '<td class=\"td_fecha\">' + fecha.toLocaleDateString("es-ES", dateOptions) + '</td>' +
                    '<td class=\"td_edit\"> <div class="flex justify-evenly items-center">  <a href="./turnoEdit.html?id=' + turno.id + '"><i class="fa-solid fa-pen-to-square cursor-pointer hover:text-amber-600"></i></a> <i class="fa-solid fa-trash cursor-pointer hover:text-red-700" onclick="onDelete(' + turno.id + ')"></i> </div>  </td>';
        };

    })
    })

    (function(){
      let pathname = window.location.pathname;
      if (pathname == "/turnoList.html") {
          document.querySelector(".nav .nav-item a:last").addClass("active");
      }
    })


    })

