/* eslint-disable @typescript-eslint/no-floating-promises */
import React, { useEffect, useState } from 'react'
import Swal from 'sweetalert2'

// interface ButtonProps {
//     onCancel: (event: React.MouseEvent<HTMLButtonElement, MouseEvent>) => void;
// }
const ContenedorPedidos = ({ onCancel, comida }) => {
    console.log(comida)
    const [pedidoReady, setPedidoReady] = useState(false)
    const [hasBebida, setHasBebida] = useState(false)
    // const [isCanceling, setIsCanceling] = useState(false)
    // const [precio, setPrecio] = useState(0)
    // const [sabor, setSabor] = useState('')

    // ToDo List
    // Cambiar pedido a pizzas
    // Cambiar precio a 9.99
    // Cambiar pedido a empanadas
    // Cambiar sabor a muzzarella
    // Cambiar pedido a milanesas

    useEffect(() => {
        // console.log('mount')
        // setPedido('pizzas')

        // no se puede acceder al valor de pedido en setTimout porque cuando se realizan varios setState distintos todos se van a realizar al mismo tiempo y solo se va a realizar un solo render. Con los estados de react no se sabe exactamente cuando va a cambair el estado, hay que esperar a cuando él quiera. Si nosotros queremos usar pedido cuando ya esté actualizado, tenemos que usar otro useEffect

        const timeOut = setTimeout(() => {
            setPedidoReady(true)
            console.log('timeout ready')
            console.log('pedido dentro setTimout', pedidoReady)
        }, 2000)

        // siempre debo usar funciones de saneamiento porque o sino igual se puede ejecutar el setTimout, es decir nunca cancelo el pedido, la idea es sanear las variables que queden flotando, a pesar de que ya el componente se haya desmontado
        return () => {
            clearTimeout(timeOut)
        }
    }, [])

    // useEffect(() => {
    //     console.log('pedido en el otro useEffect', pedido)
    //     console.log('pedido listo', pedido)
    // }, [pedido])

    // useEffect(() => {
    //     console.log(comida)
    // }, [comida])

    // console.log('pedido', pedido)

    // useEffect(() => {
    //     setPrecio(9.99)
    //     setPedido('empanadas')
    // }, [])

    // useEffect(() => {
    //     setSabor('mozzarella')
    //     setPedido('milanesas')
    // }, [])
    // // hace un render primero con todas las variasbles undefined o con los valores iniciales y luego un rerender con los valores finales, cuando react lo considere conveniente y hasta que no se realice ese rerender no podemos acceder a ese nuevo estado
    // console.log('render', pedido, precio, sabor)

    const swalWithBootstrapButtons = Swal.mixin({
        customClass: {
            confirmButton: 'btn btn-success',
            cancelButton: 'btn btn-danger',
        },
        buttonsStyling: false,
    })

    const handleClick = () => {
        // setIsCanceling(true)
        Swal.fire({
            title: 'Are you sure?',
            text: "You won't be able to revert this!",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonText: 'Yes, cancel it!',
            cancelButtonText: 'No, I still want my order!',
            reverseButtons: true,
        }).then((result) => {
            console.log(result)

            if (result.isConfirmed) {
                onCancel(comida)
                swalWithBootstrapButtons.fire(
                    'Canceled!',

                    'Your order has been canceled',
                    'success'
                )
            } else if (
                /* Read more about handling dismissals below */
                result.dismiss === Swal.DismissReason.cancel
            ) {
                // setIsCanceling(false)
                swalWithBootstrapButtons.fire(
                    'Reverted',
                    'Your orderis safe :)',
                    'error'
                )
            }
        })
    }

    return (
        <div>
            {pedidoReady
                ? `Tu pedido de ${comida} se está preparando`
                : `Procesando Pedido de ${comida} `}
            &nbsp;
            {/* este botón tiene que desmontar ese mismo componente (Pedido.tsx) así que lo que tenemos que hacer es llamar una función que nos proveea nuestro padre */}
            {hasBebida ? (
                `Bebida incluida`
            ) : (
                <button onClick={() => setHasBebida(true)}>
                    Agregar Bebida
                </button>
            )}
            &nbsp;
            <button onClick={handleClick}>Cancelar Pedido</button>
        </div>
    )
}

export default ContenedorPedidos
