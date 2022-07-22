import "../../App.css";
import React from "react";

class BodyMainPart2c extends React.Component {
  render() {
    return (
      <button
        className={"mainPart-2c-element " + this.props.className}
        style={{
          fontSize: "30px",
          fontWeight: "600",
          marginTop: "-20px",
          marginBottom: "42px",
        }}
      >
        {this.props.language}
      </button>
    );
  }
}

export default BodyMainPart2c;
