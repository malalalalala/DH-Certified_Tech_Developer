import React from 'react'
import './Title.css'

interface Iprops {
    children: React.ReactNode
}

const Title: React.FC<Iprops> = (props) => {
    console.log(props)

    return <h1>{props.children}</h1>
}

export default Title
