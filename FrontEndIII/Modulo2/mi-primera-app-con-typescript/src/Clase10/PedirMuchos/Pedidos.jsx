import React, { useState } from 'react'
import ContenedorPedidos from './ContenedorPedidos'

// Clase 10: Práctica integradora
// ¡Hola de nuevo! Hora de practicar. Vamos a usar los distintos métodos del ciclo de vida de
// un componente para hacer una pequeña aplicación donde veremos como trabajan:
// componentDidMount, componentDidUpdate y componentWillUnmount.
// Pasos a seguir:
// 1. Supongamos que queremos mostrar en una app la pantalla de una aplicación en
// donde pedimos una orden de pizzas (link). https://github.com/Ivanszs/dh-frontend3-clases/tree/master/clase-10/practica-clase-10-res/src
// 2. Queremos que la orden se cargue recién 2 segundos luego de que el componente
// se monte. Para esto, fijate cómo utilizar el método setTimeout() dentro del
// componentDidMount() usando props.
// 3. Luego queremos que cuando el componente se actualice, se genere una
// impresión en la consola que nos avise que efectivamente, el componente se
// actualizó (link).
// 4. Finalmente necesitaremos un botón que al presionarlo nos genere un "alert"
// diciendo que la orden fue cancelada (link) antes de desmontar el componente
// (link).
// Por último, te dejamos la solución del ejercicio de la clase anterior para que puedas
// revisar tus respuestas.
// Suerte y ¡hasta la próxima!

const menu = ['pizzas', 'hamburguesas', 'ensaladas', 'empanadas']

const Pedidos = () => {
    // const [procesarOrden, setProcesarOrden] = useState(false)
    const [pedidos, setPedidos] = useState([])

    const handlePedido = (item) => {
        // crear un duplicado de, si no se actualiza la referencia react no se vuelve a renderizar, no sabe que se actualizó
        // const newPedidos = pedidos.slice()
        // newPedidos.push(item)
        // setPedidos(newPedidos)

        setPedidos([...pedidos, item])
    }
    // console.log('procesarOrden', procesarOrden)

    const handleCancelPedido = (item) => {
        console.log('handle cancel', item)
        setPedidos(pedidos.filter((pedido) => pedido !== item))
        console.log('pedidos despues de eliminar', pedidos)
    }

    return (
        <div className='container'>
            <h1>Peditres ya</h1>
            <hr />
            {menu.map((item) => (
                <button key={item} onClick={() => handlePedido(item)}>
                    Realizar pedido de {item}
                </button>
            ))}
            <hr />
            {pedidos.length
                ? pedidos.map((pedido, item) => (
                      <ContenedorPedidos
                          key={item}
                          onCancel={handleCancelPedido}
                          comida={pedido}
                      />
                  ))
                : 'No hay pedidos'}
        </div>
    )
}

export default Pedidos
