import React from 'react'

interface IProps {
    name: string
    tarea: string
}

const FunctionComponent: React.FC<IProps> = ({ name, tarea }) => {
    return (
        <li>
            {name} traerá {tarea}
        </li>
    )
}

export default FunctionComponent
