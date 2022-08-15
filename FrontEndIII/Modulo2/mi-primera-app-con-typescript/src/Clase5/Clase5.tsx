import React from 'react'
import TitledList from './components/TitledList'
import { getFavGames, getGames } from '../Api/api'

const Clase5: React.FunctionComponent = () => {
    const favGames = getFavGames()
    const games = getGames()
    return (
        <>
            <TitledList elements={favGames} title='Juegos Favoritos' />
            <TitledList elements={games} title='Tu Biblioteca' />
        </>
    )
}

export default Clase5
