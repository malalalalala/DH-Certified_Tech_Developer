import React from 'react'
import styled from 'styled-components'

const StyledTest = styled.div`
    color: ${({ color }) => color};
    background-color: ${({ disabled }) => (disabled ? 'grey' : 'blue')};
`

console.log(styled.p)

const Styled = () => {
    return (
        <StyledTest color='yellow' disabled>
            <h1>Holi</h1>
        </StyledTest>
    )
}

export default Styled
