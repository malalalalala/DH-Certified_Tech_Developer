/* eslint-disable @typescript-eslint/no-unused-vars */
import React, { Component } from 'react'
import GameWithClass from './GameWithClass'
import GameWithFC from './GameWithFC'

export interface GameI {
    game: { id: string; name: string; hours: number; achievements: number[] }
}

// const game: GameI = {
//     id: 'HIGJSGADGESDGB',
//     name: 'The binding of Isaac:Repentance',
//     hours: 486,
//     achievements: [536, 698],
// }

const game: GameI = {
    game: {
        id: 'HIGJSGADGESDGB',
        name: 'The binding of Isaac:Repentance',
        hours: 486,
        achievements: [536, 698],
    },
}

const list: string[] = ['laura', 'romeo', 'cielo']

export class Clase9 extends Component {
    // constructor(props: any) {
    //     super(props)

    //     this.timesPlayed = this.timesPlayed.bind(this)
    // }

    // timesPlayed(): void {
    //     this.setState({
    //         countPlay: this.state.countPlay + 1,
    //     })
    // }

    render(): JSX.Element {
        return (
            <div>
                Holis UwU
                <p>Otra etiqueta</p>
                {list.map((item, i) => (
                    <div key={`${item}-${i}`}>{item}</div>
                ))}
                <GameWithClass {...game} />
                <GameWithFC {...game} />
                <hr />
                {/* <GameWithClass {...game} onPlay={this.timesPlayed} /> */}
            </div>
        )
    }
}

export default Clase9
