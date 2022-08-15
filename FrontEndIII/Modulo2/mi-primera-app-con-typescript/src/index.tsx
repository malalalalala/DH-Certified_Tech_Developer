import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'
// import Clase5 from './Clase5/Clase5'
// import Clase6 from './Clase6/container/Clase6'
import Clase7AFor from './Clase7/container/Clase7AFor'
import Clase7AMap from './Clase7/container/Clase7AMap'
import Clase7ACSS from './Clase7/container/Clase7ACSS'

const root = ReactDOM.createRoot(document.getElementById('root') as HTMLElement)
root.render(
    <React.StrictMode>
        {/* <Clase5 /> */}
        {/* <Clase6 /> */}
        <Clase7AFor />
        <Clase7AMap />
        <Clase7ACSS />
    </React.StrictMode>
)
