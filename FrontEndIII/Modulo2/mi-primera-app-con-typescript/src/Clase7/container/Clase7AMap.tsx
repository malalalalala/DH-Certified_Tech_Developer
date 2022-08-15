import React from 'react'
import StatusTripulantes from '../components/StatusTripulantes'

const tripulantes = [
    { nombre: 'Mr. Poindibags', esImpostor: true },
    { nombre: 'Bombom', esImpostor: false },
    { nombre: 'Tito', esImpostor: false },
    { nombre: 'X-Ray', esImpostor: false },
    { nombre: 'Fixfox', esImpostor: false },
]

const Clase7A: React.FC = () => {
    const tripulacion = tripulantes.map((tripulante) => {
        console.log('spread', { ...tripulante })
        console.log('sin spread', tripulante)
        return <StatusTripulantes key={tripulante.nombre} {...tripulante} />
    })
    return <ul>{tripulacion}</ul>
}

export default Clase7A
