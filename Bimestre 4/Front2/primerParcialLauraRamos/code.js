/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: '',
  edad: 0,
  ciudad: '',
  interesPorJs: '',
};

const listado = [
  {
    imgUrl: 'https://huguidugui.files.wordpress.com/2015/03/html1.png',
    lenguajes: 'HTML y CSS',
    bimestre: '1er bimestre',
  },
  {
    imgUrl: 'https://jherax.files.wordpress.com/2018/08/javascript_logo.png',
    lenguajes: 'Javascript',
    bimestre: '2do bimestre',
  },
  {
    imgUrl:
      'https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png',
    lenguajes: 'React JS',
    bimestre: '3er bimestre',
  },
];

const profileBtn = document.querySelector('#completar-perfil');
const materiasBtn = document.querySelector('#obtener-materias');
const verMasBtn = document.querySelector('#ver-mas');
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener('click', renderizarDatosUsuario);
materiasBtn.addEventListener('click', recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener('click', alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  datosPersona.nombre = prompt('Ingresa tu nombre');
  datosPersona.edad =
    new Date().getFullYear() -
    parseInt(prompt('Ingresa el año en que naciste'));
  datosPersona.ciudad = prompt('Ingresa la ciudad donde vives');
  datosPersona.interesPorJs = confirm('Te interesa JavaScript?');
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  document.getElementById('nombre').innerHTML = datosPersona.nombre;
  document.getElementById('edad').innerHTML = datosPersona.edad;
  document.getElementById('ciudad').innerHTML = datosPersona.ciudad;
  document.getElementById('javascript').innerHTML = datosPersona.interesPorJs
    ? 'Sí'
    : 'No';
}

let clicked = false;

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */

  const cardsContainer = document.getElementById('fila');
  const addClass = (selector, classToAdd) => {
    document
      .querySelectorAll(selector)
      .forEach((element) => element.classList.add(classToAdd));
  };

  if (!clicked) {
    listado.forEach((materia) => {
      const cardMateria = ` <div >
      <img src=${materia.imgUrl} alt='${materia.lenguajes}'>
      <p>${materia.lenguajes}</p>
      <p>${materia.bimestre}</p>
      </div>`;

      cardsContainer.innerHTML += cardMateria;

      addClass('div#fila > div', 'caja');
      addClass('img + p', 'lenguajes');
      addClass('p + p', 'bimestre');
    });
  }

  clicked = true;
}

function alternarColorTema() {
  document.getElementById('sitio').classList.toggle('dark');
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */

function mostrarTextoSobreMi() {
  document.addEventListener('keydown', function (event) {
    if (event.key == 'f' || event.key == 'F') {
      document.getElementById('sobre-mi').classList.remove('oculto');
    }
  });
}
mostrarTextoSobreMi();
