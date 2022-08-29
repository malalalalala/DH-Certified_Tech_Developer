/* eslint-disable */
import React from 'react'
import { GameI } from '../Class6'
import Game from './Game'
import './List.css'

// recibe a través de las props los elementos que queremos imprimir
export const ListWithProps = (props) => {
    return (
        <ul>
            {props.elements.map((element) => (
                <Game key={element.id} game={element} />
            ))}
        </ul>
    )
}

// la lista no se ocupa de renderizar cada uno de los elementos
export const ListWithChildren = (props) => {
    return <ul>{props.children}</ul>
}
