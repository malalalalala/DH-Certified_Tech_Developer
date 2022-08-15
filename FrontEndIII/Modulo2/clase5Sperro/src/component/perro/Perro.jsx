import React from 'react'

const Perro = (props) => {
  return (
    <div>
        <h2>Nombre: {props.name}</h2>
        <ul>
          <li>Edad: {props.age}</li>
          <li>Sexo: {props.gender}</li>
          <li>Raza: {props.breed}</li>
          <li>Tamaño: {props.size}</li>
        </ul>
    </div>
  )
}

export default Perro