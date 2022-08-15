import React from 'react'
import { GameI } from '../../Api/api'
import './List.css'

interface Iprops {
    elements: GameI[]
}

const List: React.FC<Iprops> = (props) => {
    return (
        <ul>
            {props.elements.map((element) => {
                return (
                    <li key={element.id} id={element.id}>
                        {element.name}
                    </li>
                )
            })}
        </ul>
    )
}

export default List
