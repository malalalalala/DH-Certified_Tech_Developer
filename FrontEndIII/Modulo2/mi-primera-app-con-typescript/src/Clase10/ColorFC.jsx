import React, { useState, useEffect } from 'react'
import styled from 'styled-components'

const FlexSection = styled.div`
    display: flex;
    gap: 20px;
`

const ColorFC = (props) => {
    const [selected, setSelected] = useState(false)
    const [prevColor, setPrevColor] = useState()

    const activate = () => {
        setSelected(true)
    }

    // useEffect(() => {
    //     console.log('after every render')
    //     console.log('aqui')
    //     login
    //     setinterval

    //     return () => {
    //         logout
    //         clear interval
    //         console.log(
    //             'se llama funcipon de saneamiento, antes de ejecutar el useEffect ejecuta la función de retorno'
    //         )
    //     }
    // })

    // useEffect(() => {
    //     console.log('aqui')
    //     console.log('mount,after first render')

    //     return () => {
    //         console.log('la función de retorno ocupa el lugar del unmount')
    //     }
    // }, [])

    useEffect(() => {
        console.log('use effect')

        return () => {
            setPrevColor(props.children)
            console.log('saneamiento', props.children)
        }
    }, [props.children])

    console.log('render', prevColor)
    console.log('render', props)

    return (
        <FlexSection>
            <div>
                {/* {prevColor} -&gt; {props.children} */}
                {props.children}
            </div>
            <button onClick={activate}>Seleccionar</button>
            {selected ? <div>SELECCIONADO!</div> : undefined}
        </FlexSection>
    )
}

export default ColorFC
