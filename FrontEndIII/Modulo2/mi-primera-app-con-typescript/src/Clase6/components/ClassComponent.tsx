import React, { Component } from 'react'

interface IProps {
    name: string
    invitado: boolean
}

export default class ClassComponent extends Component<IProps> {
    render(): JSX.Element {
        return (
            <li>
                {this.props.name} {this.props.invitado ? '' : 'No '}está
                invitado a la fiesta
            </li>
        )
    }
}
