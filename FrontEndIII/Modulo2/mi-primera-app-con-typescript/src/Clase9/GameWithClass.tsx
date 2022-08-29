import React, { Component } from 'react'
import { GameI } from './Clase9'

// The React.js error "Property does not exist on type 'Readonly<{}>'" occurs when we try to access the props or state of a class component which we haven't typed. To solve the error, use the generic on the React.Component class to type the props or state objects of the class.
// To solve the error, use the generic of the React.Component class as React.Component<PropsObject, StateObject>.
// export interface TimesPlayedI {
//     onPlay: () => void
// }

// interface PropsI {
//     timesPlayed:TimesPlayedI,
//     game:GameI
// }

// type Props = GameI | TimesPlayedI

// interface ICustomComponentProps {
//     game: GameI
//     onPlay: TimesPlayedI
// }

export class GameWithClass extends Component<
    GameI,
    { playing: boolean; countPlay: number }
    // { playing: boolean }
> {
    constructor(props: GameI) {
        super(props)
        this.state = {
            playing: false,
            countPlay: 0,
        }

        this.handlePlaying = this.handlePlaying.bind(this)
        this.timesPlayed = this.timesPlayed.bind(this)
    }

    handlePlaying(): void {
        console.log(2 + 2)
        console.log('handlePalying', this)
        console.log('antes set state', this.state.playing)

        const newState = !this.state.playing

        this.setState({
            playing: !this.state.playing,
        })

        console.log('después set state', this.state.playing)

        if (newState) {
            this.timesPlayed()
        }
    }

    timesPlayed(): void {
        this.setState({
            countPlay: this.state.countPlay + 1,
        })
    }

    render(): JSX.Element {
        console.log(this.props)
        console.log(this.state)
        console.log('render', this)

        return (
            <div>
                <h1>{this.props.game.name}</h1>
                <span>Horas jugadas {this.props.game.hours}</span>
                <div>
                    Logros:{' '}
                    {this.props.game.achievements.map((achiv) => (
                        <span key={achiv}>{achiv}/</span>
                    ))}
                </div>
                <button onClick={this.handlePlaying}>
                    {this.state.playing ? 'Detener' : 'Jugar'}
                </button>
                <div>Veces jugadas: {this.state.countPlay}</div>
            </div>
        )
    }
}

export default GameWithClass
