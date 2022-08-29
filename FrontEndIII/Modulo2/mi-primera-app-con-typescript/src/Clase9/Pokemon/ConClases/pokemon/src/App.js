import React, { Component } from 'react'
import './App.css'
import Pokedex from './components/Pokedex'
import pokedex from './components/pokedex.json'

// Front End III

// Práctica integradora Pokedex Updatex
// ¡Hola de nuevo! Esperamos que la clase de hoy te sirva para resolver el siguiente
// ejercicio. ¡Suerte!

// Consigna
// En este ejercicio se nos complicó la cosa... Vamos a arreglar el código. El objetivo es
// lograr que al seleccionar un Pokémon de la pokedex, te devuelva la imagen, nombre y
// sus tipos.

// Ayudas y consejos
// ● El proyecto cuenta con un JSON con datos de pokémones.
// ● La pokedex recibe un arreglo de pokémones y una función... no perdamos el this
// de la función.
// ● Debe respetarse el nombre de la variable pokemon para que funcione todo bien
// cuando hagan los states.

// Bonus Extra
// En caso de haber terminado, te invitamos a realizar dos tareas adicionales. ¿Te animás?

// 1

// 1. Cuando trabajamos con estilos, lo mejor es respetar un orden... Este proyecto
// utiliza un archivo CSS, style inline y un archivo js con estilos. Elegí uno y
// mantenelo.
// 2. Podemos revisar que el JSON tiene más datos, te invitamos a utilizarlo
// modificando el código.

// Pasos para correr el proyecto
// 1. npm install
// 2. npm start

// Por último, te dejamos la resolución del ejercicio de la clase anterior para que puedas
// revisarlo y compararlo con la tuya. ¡Contanos cómo te fue!
// Chequeá el link.

// AREA DE TRABAJO -----------------------------------

export default class App extends Component {
    constructor() {
        super()
        this.state = {
            pokemon: [pokedex[0].name, pokedex[0].id, pokedex[0].type],
            pokemons: pokedex,
        }
        this.update = this.update.bind(this)
    }

    // AREA DE TRABAJO -------------------------------------------

    update(item) {
        this.setState({ pokemon: item.pokemon })
        console.log(item)
    }

    getPokemon = () => {
        if (this.state.pokemon[1]?.toString()?.length === 1)
            return `00${this.state.pokemon[1]}`
        if (this.state.pokemon[1]?.toString()?.length === 2)
            return `0${this.state.pokemon[1]}`
        if (this.state.pokemon[1]?.toString()?.length === 3)
            return `${this.state.pokemon[1]}`
    }

    getTypes = () => {
        let phrase
        if (this.state.pokemon[2].length === 1) return this.state.pokemon[2][0]
        if (this.state.pokemon[2].length > 1) {
            for (let index = 0; index < this.state.pokemon[2].length; index++) {
                if (index === 0) phrase = this.state.pokemon[2][index]
                if (index !== 0)
                    phrase = `${phrase} and ${this.state.pokemon[2][index]}`
            }
            return phrase
        }
    }

    render() {
        return (
            <div style={{ display: 'flex' }}>
                <div className='container'>
                    <img
                        id='pokemonImg'
                        src={`https://assets.pokemon.com/assets/cms2/img/pokedex/full/${this.getPokemon()}.png`}
                        alt={this.state.pokemon[0]}
                    />
                    <p id='name'>{`${
                        this.state.pokemon[0]
                    } is a pokemon type ${this.getTypes()}`}</p>
                </div>
                <Pokedex
                    updateParent={this.update}
                    pokemons={this.state.pokemons}
                />
            </div>
        )
    }
}
