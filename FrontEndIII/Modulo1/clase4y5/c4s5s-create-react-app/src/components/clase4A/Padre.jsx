import React from "react";
import Hijo from './Hijo'

const frutas=['piña','banano','pera','manzana','naranja']
const titulo='Listado de frutas'

const Padre=()=>{
    const hijos=()=>frutas.map((fruta,index)=><Hijo key={index} fruta={fruta}/>)
    return(
        <>
            <h1>{titulo}</h1>
            <ul>{hijos()}</ul>
        </>
    )
}

export default Padre