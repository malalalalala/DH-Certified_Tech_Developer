import React from 'react'

interface IProps {
    elementos: string[]
}

const Class4: React.FunctionComponent<IProps> = (props) => {
    return (
        <div>Class4
            {props.elementos.map((element, i) =>
            (<li key={i} id={element}>
                {element}
            </li>))}
        </div>
    )
}

export default Class4