import { add } from './add.js'

console.log('sumis', add(10, 20))

console.log('hola mundo')

const hello = () => 'holi mundo'
const result = hello()

console.log(result)

const hello2 = () => {
    const holi = () => 'holi mundo'
    return holi
}

console.log(hello2()())

const defaultParameter = (x, y = 0) => x + y

console.log(defaultParameter(10))

//DESTRUCTTURING
const user = {
    name: 'joe',
    age: 30,
    lastName: 'Ramos',
}

// const printInfo=(user)=>{
//     // return '<h1>Hola ' +user.name +'</h1>'
//     return '<h1>Hola ' +user['name'] +'</h1>'
// }

// const printInfo=({name})=>{
//     // return '<h1>Hola ' +user.name +'</h1>'
//     return '<h1>Hola ' + name +'</h1>'
// }

const printInfo = (user) => {
    const { name, age } = user
    console.log(name, user)
    return '<h1>Hola ' + name + '</h1>'
}

console.log(printInfo(user))

document.body.innerHTML = printInfo(user)

const inputKeys = ['1', '2', '3', '4', '5']
// le doy click pero no se actualiza el dom, debo usar useState para que se entere de que hubo actualizacion
// Destructuring
const inputNames = ['name', 'age', 'email']
const name = inputNames[0]
const [name2, age, email] = inputNames
const [name3, , email3] = inputNames
console.log(name)
console.log('form', name2, age, email)
console.log('form2', name3, email3)
const unObjeto = {
  nameObjeto: 'nombre',
  lastnameObjeto: 'apellido',
  ageObjeto: 'edad',
}
const nombre = unObjeto.name
console.log(nombre)
const { ageObjeto } = unObjeto
// para renombrar
// const edadcita = unObjeto.ageObjeto es lo mismo
const { ageObjeto: edadcita } = unObjeto
console.log('edad objetpo', ageObjeto)
console.log('edad objetpo renombrada', edadcita)


//FUNCIONES ANÓNIMAS

const button = document.createElement('button')
button.innerHTML = 'click me'

button.addEventListener('click', () => alert('hizo click'))
document.body.append(button)

//RETURN
const showText = () => 'Hola mundo'
const showNumber = () => 22
const showBoolean = () => true
const showArray = () => [1, 2, 3]
const showObjext = () => ({ name: 'ryan' })

//evita que haga esto

const showObjext2 = () => {
    return { name: 'ryan' }
}

console.log(showText())
console.log(showNumber())
console.log(showBoolean())
console.log(showArray())
console.log(showObjext())
console.log(showObjext2())

const address = {
    street: '123',
    city: 'Medallo',
}

const userInfo = {
    ...user,
    ...address,
}

console.log(userInfo)
