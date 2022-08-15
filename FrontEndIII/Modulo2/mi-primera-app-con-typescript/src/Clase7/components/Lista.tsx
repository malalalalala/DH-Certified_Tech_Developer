import React from 'react'
// import styles from './lista.module.css'

const Lista = (props: { elementos: string[] }): any => {
    // código que prepara la lista
    const lista = props.elementos.map((elemento) => (
        <li key={elemento}>{elemento}</li>
    ))
    // return (
    //     <div className={styles.lista} role='main'>
    //         <h1 className={styles.title}>Películas</h1>
    //         {lista}
    //     </div>
    // )
    return (
        <div role='main'>
            <h1>Películas</h1>
            {lista}
        </div>
    )
}

export default Lista
