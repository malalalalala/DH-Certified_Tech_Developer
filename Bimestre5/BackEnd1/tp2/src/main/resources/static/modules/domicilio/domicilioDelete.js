window.addEventListener('load', function () {
    window.onDelete = (id) => {
      if (window.confirm('Desea eliminar este domicilio?')) {
        const url = '/domicilios/?id=' + id;
        const settings = {
          method: 'DELETE',
        };

        fetch(url, settings).then((response) => {
          alert('domicilio eliminado correctamente');
          location.reload();
        });
      }
    };
})