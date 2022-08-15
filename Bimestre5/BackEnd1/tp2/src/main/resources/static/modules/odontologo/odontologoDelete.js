window.addEventListener('load', function () {
    window.onDelete = (id) => {
      if (window.confirm('Desea eliminar este odontologo?')) {
        const url = '/odontologos/?id=' + id;
        const settings = {
          method: 'DELETE',
        };

        fetch(url, settings).then((response) => {
          alert('usuario eliminado correctamente');
          location.reload();
        });
      }
    };
})