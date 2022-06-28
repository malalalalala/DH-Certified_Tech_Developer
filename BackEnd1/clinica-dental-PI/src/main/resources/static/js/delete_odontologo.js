function deleteBy(id)
{
          const url = '/odontologos/'+ id;
          const settings = {
              method: 'DELETE'
          }
          fetch(url,settings)
          .then(response => response.json())

          let row_id = "#tr_" + id;
          document.querySelector(row_id).remove();

                if (window.confirm('Desea eliminar este odontologo?')) {
                  const url = '/odontologos/'+ id;
                  const settings = {
                    method: 'DELETE',
                  };

                  fetch(url, settings).then((response) => {
                    alert('usuario eliminado correctamente');
                    location.reload();
                  });
                }

}