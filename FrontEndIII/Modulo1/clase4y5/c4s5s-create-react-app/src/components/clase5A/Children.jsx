import React from "react";

const Children = props => {
	return (
		<div
			style={{
				width:"50%",
				background: "#FA8072",
				height:"100px",
				padding: "10px",
				fontSize:"40px"
			}}
		>	
			{props.autor}
		</div>
	);
}

export default Children