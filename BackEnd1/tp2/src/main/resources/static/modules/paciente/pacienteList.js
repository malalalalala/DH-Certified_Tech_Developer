window.addEventListener('load', function () {
    (function(){
      const url = '/pacientes';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
         for(paciente of data){
            var table = document.getElementById("pacienteTableBody");
            var pacienteRow =table.insertRow();
            let tr_id = 'tr_' + paciente.id;
            pacienteRow.id = tr_id;
            let domicilio = `${paciente.domicilio.calle} - ${paciente.domicilio.numero} - ${paciente.domicilio.localidad} - ${paciente.domicilio.provincia}`
            pacienteRow.innerHTML = '<td class=\"td_id\">' + paciente.id + '</td>' +
                    '<td class=\"td_nombre\">' + paciente.nombre + '</td>' +
                    '<td class=\"td_apellido\">' + domicilio.apellido + '</td>' +
                    '<td class=\"td_dni\">' + paciente.dni + '</td>' +
                    '<td class=\"td_fechaIngreso\">' + paciente.fechaIngreso + '</td>' +
                    '<td class=\"td_domicilio\">' + domicilio + '</td>' +
                    '<td class=\"td_edit\"> <div class="flex justify-evenly items-center">  <a href="./pacienteEdit.html?id=' + paciente.id + '?domicilioId='+ paciente.domicilio.id +'"><i class="fa-solid fa-pen-to-square cursor-pointer hover:text-amber-600"></i></a> <i class="fa-solid fa-trash cursor-pointer hover:text-red-700" onclick="onDelete(' + paciente.id + ')"></i> </div>  </td>';
        };

    })
    })

    (function(){
      let pathname = window.location.pathname;
      if (pathname == "/pacienteList.html") {
          document.querySelector(".nav .nav-item a:last").addClass("active");
      }
    })


    })

