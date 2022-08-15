import React from 'react'
import Encabezado from '../components/Encabezado'
import PieDePagina from '../components/PieDePagina'
import Lista from '../components/Lista'

const elementos = ['Hakuna', 'Matata']

const Clase7ACSS: React.FC = () => {
    return (
        <>
            <Encabezado />
            <PieDePagina />
            <Lista elementos={elementos} />
        </>
    )
}

export default Clase7ACSS
