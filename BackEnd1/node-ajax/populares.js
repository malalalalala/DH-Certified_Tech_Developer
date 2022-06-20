window.onload=()=>{
    fetch("https://api.giphy.com/v1/gifs/trending?api_key=IZY40IuJ0ZJwoyxl0SzFauIQq7BcxaOh&limit=25&rating=g")
    .then((respuesta)=>respuesta.json())
    .then((data)=>{

        data.forEach(element => {
            
            let gif='<p>'+ element.data.ti+'</p>'

        })
    })
}