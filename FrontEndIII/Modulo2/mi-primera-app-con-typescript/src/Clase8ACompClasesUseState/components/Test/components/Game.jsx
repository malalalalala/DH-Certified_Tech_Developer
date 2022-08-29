import React from 'react'
import styled from 'styled-components'
import Button from './Button'
import Timer from './Timer'

const StyledGame = styled.div`
    display: flex;
    flex-direction: column;
    gap: 10px;

    h3 {
        font-size: 32px;
        text-align: center;
        overflow: hidden;
        white-space: nowrap;
        text-overflow: ellipsis;
    }
`

class Game extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            playing: false,
        }
        // cuando no uso binding se pierde el contexto
        this.tooglePlaying = this.tooglePlaying.bind(this)
    }

    tooglePlaying() {
        console.log(this)
        // no podemos modificar el estado directamente porque react no se da acuenta que debemos renderizar de nuevo el elemento
        this.setState({
            playing: !this.state.playing,
        })
    }

    componentDidMount() {
        console.log('me monté game')
    }

    componentWillUnmount() {
        console.log('me desmonmonté game')
    }

    render() {
        console.log('me renderizo')
        return (
            <StyledGame>
                <h3 title={this.props.game.name}>{this.props.game.name}</h3>
                <img src={this.props.game.image} alt={this.props.game.name} />
                <Button
                    playing={this.state.playing}
                    onClick={this.tooglePlaying}
                >
                    {this.state.playing ? 'Parar' : 'Jugar'}
                </Button>
                {this.state.playing && <Timer />}
            </StyledGame>
        )
    }
}

export default Game
