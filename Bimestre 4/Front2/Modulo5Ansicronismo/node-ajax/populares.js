window.onload=()=>{
    fetch('https://api.giphy.com/v1/gifs/trending?api_key=IZY40IuJ0ZJwoyxl0SzFauIQq7BcxaOh&limit=25&rating=g')
    .then((respuesta)=>{return respuesta.json()})
    .then((data)=>{console.log(data.data)
        data.data.forEach(gif => {
            console.log(gif)
        let gifContent='<p>' + gif.title+ '</p>'
        console.log('gifContent',gifContent);
        gifContent+='<img src=' +gif.images.original.url+ '>'
        document.querySelector('ul').innerHTML+='<li>' +gifContent+ '</li>'
    })
    }).catch((e)=>{alert('error intente más tarde'+e)})
}