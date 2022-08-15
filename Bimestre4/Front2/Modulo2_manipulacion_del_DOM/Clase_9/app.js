let contador = 0;
let cronometro;
let tiempo = 1000;

const valor = document.getElementById('valor');
const btnIniciar = document.getElementById('iniciar');
const btnPausa = document.getElementById('pausa');
const btnStop = document.getElementById('stop');
const btnAcelerar = document.getElementById('acelerar');
const times = document.getElementById('times');

const play = (valor) => {
  cronometro = setInterval(() => {
    contador++;
    console.log(contador);
    renderizar();
  }, valor);
};

const renderizar = () => {
  valor.innerText = contador;
};

const pausar = () => {
  console.log('pausé');
  clearInterval(cronometro);
};

const reiniciar = () => {
  clearInterval(cronometro);
  times.innerHTML += `<small>Tiempo:${contador}</small>`;
  contador = 0;
  renderizar();
};

const acelerar = () => {
  play(tiempo / 2);
  console.log(tiempo * 2);
  console.log();
};

// listeners

btnIniciar.addEventListener('click', () => {
  console.log('click');
  play(tiempo);
});

btnStop.addEventListener('click', reiniciar);
btnPausa.addEventListener('click', pausar);
btnAcelerar.addEventListener('click', acelerar);
