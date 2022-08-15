window.onload=()=>{
    fetch("https://api.giphy.com/v1/gifs/trending?api_key=IZY40IuJ0ZJwoyxl0SzFauIQq7BcxaOh&limit=25&rating=g")
    .then((respuesta)=>respuesta.json())
    .then((data)=>{

        // console.log(data);

        data.data.forEach(gif => {

            // console.log(gif);
            
            let gifContent='<p>'+ gif.title+'</p>'

            //  console.log('gifContent',gifContent);

            gifContent+='<img src=' +gif.images.original.url+ '>'

            // console.log('gifContent2',gifContent);

            document.querySelector('ul').innerHTML+='<li>' +gifContent+ '</li>'

        })
    }).catch((e)=>{alert('error intente más tarde'+e)})
    

    let data = {
        image_id: 'asf2',
        sub_id: 'my-user-1234',
        value: 1,
      }
    
      let settings = {
        method: 'POST',
        headers: {
          'content-type': 'application/json',
          'x-api-key': 'fc815d3e-4315-48c5-a98c-4cb741292e56',
        },
        body: JSON.stringify(data),
      }
      fetch('https://api.thecatapi.com/v1/votes', settings)
        .then((response) => response.json)
        .then((info) => console.log(info))
        .catch((e) => console.log('error' + e))

}