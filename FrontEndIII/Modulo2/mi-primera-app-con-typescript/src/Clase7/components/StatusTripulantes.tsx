import React from 'react'

interface IProps {
    nombre: string
    esImpostor: boolean
}

const StatusTripulantes: React.FC<IProps> = ({ nombre, esImpostor }) => {
    return (
        <li>
            {nombre}
            {esImpostor ? ' es impostor' : ' no es impostor'}
        </li>
    )
}

export default StatusTripulantes
