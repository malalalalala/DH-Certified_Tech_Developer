import React from 'react'
import ClassComponent from '../components/ClassComponent'
import FunctionComponent from '../components/FunctionComponent'

// let index = 0
// const getIndex = (): Number => ++index
// interface IProps {
//     key: number
// }

const Clase6 = (): React.ReactElement<{ key: React.Key }> => {
    const invitados = [
        { name: 'Laura', invitado: true, tarea: 'papas fritas' },
        { name: 'Victoria', invitado: false, tarea: 'pizza' },
        { name: 'Ramos', invitado: true, tarea: 'bebidas' },
        { name: 'Agudelo', invitado: true, tarea: 'desechables' },
    ]

    return (
        <>
            <h3>Invitados:</h3>
            {invitados.map(({ name, invitado }) => (
                <ClassComponent key={name} name={name} invitado={invitado} />
            ))}

            <h3>Tareas:</h3>
            {invitados.map(({ name, tarea }) => (
                <FunctionComponent key={name} name={name} tarea={tarea} />
            ))}
        </>
    )
}

export default Clase6
