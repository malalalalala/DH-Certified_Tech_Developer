window.addEventListener('load', function () {
    window.onDelete = (id) => {
      if (window.confirm('Desea eliminar este paciente?')) {
        const url = '/pacientes/?id=' + id;
        const settings = {
          method: 'DELETE',
        };

        fetch(url, settings).then((response) => {
          alert('paciente eliminado correctamente');
          location.reload();
        });
      }
    };
})