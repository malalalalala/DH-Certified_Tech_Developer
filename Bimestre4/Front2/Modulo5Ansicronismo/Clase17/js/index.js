const btn = document.querySelector('#random');
const imgDog = document.querySelector('main img')

const apiUrl = 'https://dog.ceo/api/breeds/image/random';


function peticion(url) {
    
        fetch(url).then( respuesta => {
            console.log(respuesta);
            return respuesta.json()
        })
        .then( datos => {
            console.log(datos);
            // modficamos la UI agregando la imagen que nos llegó en la peticion
            imgDog.setAttribute('src', datos.message);
        })
        .catch( error => {
            //Aca recibimos algo que viene rechazado(Ejemplo: "Problema X")
            console.log(error);
        });
    

};

//escuchamos el click del boton para disparar la peticion
btn.addEventListener('click', function() {
    peticion(apiUrl);
})