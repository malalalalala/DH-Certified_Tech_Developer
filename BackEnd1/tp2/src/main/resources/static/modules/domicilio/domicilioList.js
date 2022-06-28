window.addEventListener('load', function () {
    (function(){
      const url = '/domicilios';
      const settings = {
        method: 'GET'
      }

      fetch(url,settings)
      .then(response => response.json())
      .then(data => {
         for(domicilio of data){
            var table = document.getElementById("domicilioTableBody");
            var domicilioRow =table.insertRow();
            let tr_id = 'tr_' + domicilio.id;
            domicilioRow.id = tr_id;
            domicilioRow.innerHTML = '<td class=\"td_id\">' + domicilio.id + '</td>' +
                    '<td class=\"td_calle\">' + domicilio.calle + '</td>' +
                    '<td class=\"td_numero\">' + domicilio.numero + '</td>' +
                    '<td class=\"td_localidad\">' + domicilio.localidad + '</td>' +
                    '<td class=\"td_provincia\">' + domicilio.provincia + '</td>' +
                    '<td class=\"td_edit\"> <div class="flex justify-evenly items-center">  <a href="./domicilioEdit.html?id=' + domicilio.id + '"><i class="fa-solid fa-pen-to-square cursor-pointer hover:text-amber-600"></i></a> <i class="fa-solid fa-trash cursor-pointer hover:text-red-700" onclick="onDelete(' + domicilio.id + ')"></i> </div>  </td>';
        };

    })
    })

    (function(){
      let pathname = window.location.pathname;
      if (pathname == "/domicilioList.html") {
          document.querySelector(".nav .nav-item a:last").addClass("active");
      }
    })


    })

