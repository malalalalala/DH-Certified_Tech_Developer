import React, { useState } from 'react'
import Swal from 'sweetalert2'

// Clase 11: práctica integradora
// En esta clase abordamos una gran cantidad de temas. Desde hoy, seremos capaces
// de hacer aplicaciones React más interesantes y con más herramientas, gracias al
// control de eventos y formularios. Ahora, es tiempo de practicar. ¿Estás listo?

// Consigna

// Creá un componente controlado llamado Rejuvenecedor, con 2 campos: nombre y
// edad. En el nombre, validá que es un string con al menos un caracter. La edad debe
// ser un número entero positivo. Al dar submit, hacé que nos quite 10 años de edad
// mostrándonos nuestro nombre y nuestra nueva y feliz edad con SweetAlert.
// Cualquier duda la repasaremos en la clase en vivo.

// ¡Hasta la próxima!

const Rejuvenecedor = () => {
    const [name, setName] = useState('')
    const [age, setAge] = useState(0)

    const handleChangeName = (e) => {
        setName(e.target.value)
        console.log(name)
    }

    const handleChangeAge = (e) => {
        setAge(e.target.value)
        console.log(age)
    }

    const handleSubmit = (e) => {
        e.preventDefault(e)
        if (!name || age < 0) {
            Swal.fire('Favor revise los datos')
        } else {
            const newAge = age - 10
            Swal.fire('Hola ' + name + ' tu nueva y feliz edad es ' + newAge)
        }
    }

    return (
        <>
            <form onSubmit={handleSubmit}>
                {/* <form> */}
                <label htmlFor='name'>Ingrese su nombre:</label>
                <input
                    type='text'
                    name='name'
                    onChange={handleChangeName}
                    value={name}
                />
                <label htmlFor='age'>Ingrese su edad:</label>
                <input
                    type='number'
                    name='age'
                    onChange={handleChangeAge}
                    value={age}
                />
                <button type='submit'>Enviar</button>
            </form>
        </>
    )
}

export default Rejuvenecedor
