import "../../App.css";
import React from "react";

// var lenFe = this.props.fetures.length;

class BodyMainPart extends React.Component {
  render() {
    return (
      <div>
        <div
          style={{
            backgroundColor: this.props.backgroundColor,
            color: this.props.color,
          }}
          className="Body-mainPart"
        >
          <div className="Body-mainPart-1">
            <h1 style={{ fontSize: "105px" }}>{this.props.language}</h1>
            <p
              style={{
                fontSize: "21px",
                fontWeight: "600",
                marginTop: "-40px",
              }}
            >
              {this.props.describe}
            </p>
            <br></br>
            {this.props.fetures.map((feture, index) => (
              <button
                className={"tut-button " + feture.FeClass}
                key={index}
                // className={feture.FeClass}
              >
                {feture.Fedescribe}
              </button>
            ))}
          </div>
          <div>
            <img src={this.props.imag} className="imageP"></img>
          </div>
        </div>
      </div>
    );
  }
}

export default BodyMainPart;
