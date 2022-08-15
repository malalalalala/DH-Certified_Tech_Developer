import React from 'react'
import Title from './Title'
import List from './List'
import { GameI } from '../../Api/api'

interface Iprops {
    title: string
    elements: GameI[]
}

const TitledList: React.FunctionComponent<Iprops> = (props) => {
    return (
        <>
            <Title>{props.title}</Title>
            <List elements={props.elements} />
            <hr />
        </>
    )
}

export default TitledList
