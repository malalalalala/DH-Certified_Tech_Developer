window.onload = () => {
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

// documentation https://docs.thecatapi.com/api-reference/votes/votes-post
