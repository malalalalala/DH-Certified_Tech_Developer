const person = {
    name: 'ryan',
    address: {
        city: 'london',
    },
    // location:{
    //     city:'london'
    // }
}

console.log(person.location?.city)

const url = 'https://jsonplaceholder.typicode.com/posts'

const data = fetch(url) //devuelve una promesa

console.log(data)
const ul = document.createElement('ul')

fetch(url)
    .then((response) => {
        console.log(response)
        return response.json()
    })
    .then((data) => {
        console.log('datica', data)
        data.forEach((element) => {
            const li = document.createElement('li')
            li.innerText = element.title
            ul.append(li)
        })
        document.body.append(ul)
    })

//otra forma

const loadData = async () => {
    const response = await fetch(url)
    const data2 = await response.json()
    data2.forEach((element) => {
        const li = document.createElement('li')
        li.innerText = `${element.title} segunda forma`
        ul.append(li)
    })
    document.body.append(ul)

    console.log('data2', data2)
}

loadData()

console.log('linea 2')
