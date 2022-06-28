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
            var table = document.getElementById("odontologoTableBody");
            var odontologoRow =table.insertRow();
            let tr_id = 'tr_' + odontologo.id;
            odontologoRow.id = tr_id;
            odontologoRow.innerHTML = '<td class=\"td_id\">' + odontologo.id + '</td>' +
                    '<td class=\"td_nombre\">' + odontologo.nombre.toUpperCase() + '</td>' +
                    '<td class=\"td_apellido\">' + odontologo.apellido.toUpperCase() + '</td>' +
                    '<td class=\"td_edit\"> <div class="flex justify-evenly items-center">  <a href="./odontologoEdit.html?id=' + odontologo.id + '"><i class="fa-solid fa-pen-to-square cursor-pointer hover:text-amber-600"></i></a> <i class="fa-solid fa-trash cursor-pointer hover:text-red-700" onclick="onDelete(' + odontologo.id + ')"></i> </div>  </td>';
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

