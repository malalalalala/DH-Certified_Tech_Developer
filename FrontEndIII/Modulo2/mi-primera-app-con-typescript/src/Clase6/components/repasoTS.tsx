/* eslint-disable @typescript-eslint/no-unused-vars */
import React from 'react'

const repasoTS: React.FC = () => {
    let arregloNum: number[]
    arregloNum = [2, 5, 3, 85]
    arregloNum = []

    enum Sexo {
        Macho = 'Macho',
        Hembra = 'Hembra',
    }

    type Color = 'Negro' | 'Blanco' | 'Beige' | 'Multicolo'

    interface Gato {
        nombre: string
        edad: number
        vacunado: boolean
        hijos: number[]
        sexo: Sexo
        color: Color
    }

    interface GatoConDatosExtra<T> {
        nombre: string
        edad: number
        extra: T
        colmillos?: boolean
    }

    const objetoGato: Gato = {
        nombre: 'Romeo',
        edad: 2,
        vacunado: false,
        hijos: [1, 2],
        sexo: Sexo.Macho,
        color: 'Beige',
    }

    const gatito: GatoConDatosExtra<string> = {
        nombre: 'Romeo',
        edad: 2,
        extra: 'es muy lindo',
    }

    const gatito2: GatoConDatosExtra<string> = {
        nombre: 'Romeo',
        edad: 2,
        extra: 'es muy lindo',
        colmillos: true,
    }

    // permite setear elementosn que puedan ser hijo de una etiqueta de html
    let otraVariable: React.ReactNode
    otraVariable = <div>Hola</div>
    otraVariable = (
        <h1>
            <h5></h5>
        </h1>
    )

    return <div>: React.FC</div>
}

export default repasoTS
