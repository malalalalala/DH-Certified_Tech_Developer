function deleteBy(id)
{

          let row_id = "#tr_" + id;


                if (window.confirm('Desea eliminar este paciente?')) {
                  const url = '/pacientes/'+ id;
                  const settings = {
                    method: 'DELETE',
                  };

                  fetch(url, settings).then(response => {
                      if (response.ok) {
                          alert(`paciente con id ${id} eliminado correctamente`);
                          location.reload();
                          document.querySelector(row_id).remove();
                      } else if(response.status === 404) {
                          alert("Error: el paciente tiene un turno asignado, elimine primero el turno");
                      } else {
                          return Promise.reject('some other error: ' + response.status)
                      }

                  });

                }

}

