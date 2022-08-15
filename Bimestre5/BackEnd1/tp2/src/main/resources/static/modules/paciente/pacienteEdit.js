window.addEventListener("load", function () {
  const formulario = document.querySelector("#add_new_paciente");
  const baseUrl = window.location.href;
  const pacienteId = baseUrl.substring(
    baseUrl.indexOf("=") + 1,
    baseUrl.indexOf("=") + 2
  );
  const domicilioId = baseUrl.substring(baseUrl.lastIndexOf("=") + 1);

  const urlPacientes = "/pacientes/?id=" + pacienteId;
  const settingsPacientes = {
    method: "GET",
  };

  fetch(urlPacientes, settingsPacientes)
    .then((response) => response.json())
    .then((data) => {
      document.querySelector("#nombre").value = data.nombre;
      document.querySelector("#apellido").value = data.apellido;
      document.querySelector("#dni").value = data.dni;
      document.querySelector("#fechaIngreso").value =
        data.fechaIngreso.substring(0, 10);
    });

  const urlDomicilios = "/domicilios/?id=" + domicilioId;
  const settingsDomicilios = {
    method: "GET",
  };

  fetch(urlDomicilios, settingsDomicilios)
    .then((response) => response.json())
    .then((data) => {
      document.querySelector("#calle").value = data.calle;
      document.querySelector("#numero").value = data.numero;
      document.querySelector("#localidad").value = data.localidad;
      document.querySelector("#provincia").value = data.provincia;
    });

  formulario.addEventListener("submit", function (event) {
    event.preventDefault();
    const formData = {
      id: Number(pacienteId),
      nombre: document.querySelector("#nombre").value,
      apellido: document.querySelector("#apellido").value,
      dni: document.querySelector("#dni").value,
      fechaIngreso: document.querySelector("#fechaIngreso").value,
      domicilio: {
        id: Number(domicilioId),
        calle: document.querySelector("#calle").value,
        numero: document.querySelector("#numero").value,
        localidad: document.querySelector("#localidad").value,
        provincia: document.querySelector("#provincia").value,
      },
    };
    const domicilioForm = {
      id: Number(domicilioId),
      calle: document.querySelector("#calle").value,
      numero: document.querySelector("#numero").value,
      localidad: document.querySelector("#localidad").value,
      provincia: document.querySelector("#provincia").value,
    };
    const url = "/pacientes";
    const urlDomicilio = "/domicilios";
    const settings = {
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(formData),
    };
    const settingsDomicilio = {
      method: "PUT",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(domicilioForm),
    };

    fetch(url, settings)
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        let successAlert =
          '<div class="alert alert-success alert-dismissible">' +
          '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
          "<strong></strong> Paciente modificado </div>";
        fetch(urlDomicilio, settingsDomicilio)
          .then((response) => response.json())
          .then((data) => {
            document.querySelector("#response").innerHTML = successAlert;
            document.querySelector("#response").style.display = "block";
            document.querySelector("#nombre").disabled = true;
            document.querySelector("#apellido").disabled = true;
            document.querySelector("#dni").disabled = true;
            document.querySelector("#fechaIngreso").disabled = true;
            document.querySelector("#calle").disabled = true;
            document.querySelector("#numero").disabled = true;
            document.querySelector("#localidad").disabled = true;
            document.querySelector("#provincia").disabled = true;
            resetUploadForm();

            setTimeout(function () {
              window.location.href = "/modules/paciente/pacienteList.html";
            }, 3000);
          })
          .catch((error) => {
            let errorAlert =
              '<div class="alert alert-danger alert-dismissible">' +
              '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
              "<strong> Error intente nuevamente</strong> </div>";

            document.querySelector("#response").innerHTML = errorAlert;
            document.querySelector("#response").style.display = "block";
            resetUploadForm();
          });
      });
  });

  function resetUploadForm() {
    document.querySelector("#nombre").value = "";
    document.querySelector("#apellido").value = "";
    document.querySelector("#dni").value = "";
    document.querySelector("#fechaIngreso").value = "";
    document.querySelector("#calle").value = "";
    document.querySelector("#numero").value = "";
    document.querySelector("#localidad").value = "";
    document.querySelector("#provincia").value = "";
  }

  (function () {
    let pathname = window.location.pathname;
    if (pathname === "/") {
      document.querySelector(".nav .nav-item a:first").addClass("active");
    } else if (pathname == "/pacienteList.html") {
      document.querySelector(".nav .nav-item a:last").addClass("active");
    }
  })();
});
