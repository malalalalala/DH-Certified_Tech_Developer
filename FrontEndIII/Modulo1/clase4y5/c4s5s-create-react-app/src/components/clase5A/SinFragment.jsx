
import React from "react";

const numbers=[1,2,3,4,5,6,7,8]

const SinFragment=()=>numbers.map((number,index)=>
<div key={index}>
    <span>No</span>
    <p>{number}</p>
    <p>sin fragment</p>
</div>
)

export default SinFragment