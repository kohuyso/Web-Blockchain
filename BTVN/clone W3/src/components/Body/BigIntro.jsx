import "../../App.css";
import React from "react";

class BigIntro extends React.Component {
  render() {
    return (
      <div
        style={{ backgroundColor: this.props.backgroundColor }}
        className="Body-mainPart"
      ></div>
    );
  }
}

export default BigIntro;
