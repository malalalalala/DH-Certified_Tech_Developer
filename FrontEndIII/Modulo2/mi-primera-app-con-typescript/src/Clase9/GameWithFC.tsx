import React, { useState } from 'react'
import { GameI } from './Clase9'

const GameWithFC = (props: GameI): JSX.Element => {
    console.log(props)
    const [playing, setPlaying] = useState(false)
    const [countPlay, setCountPlay] = useState(0)

    const timesPlayed = (): void => {
        setCountPlay((countPlay) => ++countPlay)
    }

    const handlePlaying = (): void => {
        console.log(2 + 2)

        const newState = !playing
        setPlaying(!playing)

        if (newState) {
            timesPlayed()
        }
    }

    return (
        <div>
            <hr />
            Funcionales
            <h1>{props.game.name}</h1>
            <span>Horas jugadas {props.game.hours}</span>
            <div>
                Logros:{' '}
                {props.game.achievements.map((achiv) => (
                    <span key={achiv}>{achiv}/</span>
                ))}
            </div>
            <button onClick={handlePlaying}>
                {playing ? 'Detener' : 'Jugar'}
            </button>
            <div>Veces jugadas: {countPlay}</div>
        </div>
    )
}

export default GameWithFC
