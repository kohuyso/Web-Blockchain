import "../../App.css";
import React from "react";

// var lenFe = this.props.fetures.length;

class BodyMainPart extends React.Component {
  render() {
    console.log(this.props.fetures);
    return (
      <div
        style={{ backgroundColor: this.props.backgroundColor }}
        className="Body-mainPart"
      >
        <div className="Body-mainPart-1">
          <h1>{this.props.language}</h1>
        </div>

        <ul>
          {this.props.fetures.map((fetures) => (
            <li> {fetures.FetextColor} </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default BodyMainPart;
