import React from "react";

const Father = props => {
	return (
		<div
			style={{
				width:"75%",
				background: "#FFEFD5",
				height:"200px"
			}}
		>
			<h2>Soy un padre</h2>
			{props.children}
		</div>
	);
}


export default Father
