function deleteBy(id)
{
          let row_id = "#tr_" + id;


                if (window.confirm(`Desea eliminar el odontólogo con id ${id}?`)) {
                  const url = '/turnos/'+ id;
                  const settings = {
                    method: 'DELETE',
                  };
                  fetch(url, settings).then((response) => {
                    alert('turno eliminado correctamente');
                    location.reload();
                  });
                    document.querySelector(row_id).remove();
                    console.log('confirm',window.confirm('Desea eliminar este turno?'))
                }

}