function deleteBy(id)
{
           const url = '/pacientes/'+ id;
          const settings = {
              method: 'DELETE'
          }
          fetch(url,settings)
          .then(response => response.json())

          let row_id = "#tr_" + id;
          document.querySelector(row_id).remove();

                if (window.confirm('Desea eliminar este paciente?')) {
                  const url = '/pacientes/'+ id;
                  const settings = {
                    method: 'DELETE',
                  };

                  fetch(url, settings).then((response) => {
                    alert('usuario eliminado correctamente');
                    location.reload();
                  });
                }

}