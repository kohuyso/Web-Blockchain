import "../../App.css";
import React from "react";

class BodyMainPart2a extends React.Component {
  render() {
    return (
      <div
        className="mainPart-2a-element"
        style={{ backgroundColor: this.props.backgroundColor }}
      >
        <h1 style={{ fontSize: "54px" }}>{this.props.language}</h1>
        <p
          style={{
            fontSize: "18px",
            fontWeight: "500",
            marginTop: "-20px",
            marginBottom: "42px",
          }}
        >
          {this.props.describe}
        </p>
        <button className={"tut-button black-button"}>
          {this.props.buttonT}
        </button>
      </div>
    );
  }
}

export default BodyMainPart2a;
