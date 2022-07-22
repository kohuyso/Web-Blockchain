import React from "react";
import "../../App.css";
import { FaSearch } from "react-icons/fa";

class BodyFirst extends React.Component {
  render() {
    var af = document.getElementById("gseach");
    const FcOn = () => {
      alert("as");
    };
    const FcOut = () => {
      alert("aa");
    };
    return (
      <div className="Body-first">
        <h1
          style={{
            fontSize: "88px",
            fontWeight: "700",
            textAlign: "center",
            marginTop: "120px",
            color: "white",
          }}
        >
          Learn to Code
        </h1>
        <h3
          style={{
            fontSize: "29px",
            fontWeight: "700",
            marginTop: "-33px",
            color: "#ffc0c7",
            marginBottom: "45px",
          }}
        >
          With the world''s largest web developer site.
        </h3>

        <div className="search-Part">
          <input
            id="gseach"
            type="search"
            placeholder="Search our tutorials, e.g. HTML"
            style={{
              border: "none",
              borderBottomLeftRadius: "25px",
              borderTopLeftRadius: "25px",
              height: "57px",
              fontSize: "21px",
              paddingLeft: "25px",
              width: "495px",
              fontWeight: "600",
            }}
          />

          <button
            className="green-button"
            style={{
              border: "none",
              width: "120px",
              borderBottomRightRadius: "25px",
              borderTopRightRadius: "25px",
            }}
          >
            <FaSearch
              style={{
                fontSize: "24px",
              }}
            />
          </button>
        </div>

        <h3
          style={{
            fontSize: "29px",
            fontWeight: "700",
            marginTop: "50px",
            color: "white",
            marginBottom: "45px",
          }}
        >
          <a
            href="https://www.w3schools.com/where_to_start.asp"
            className="text-Underline"
          >
            Not Sure Where To Begin?
          </a>
        </h3>
      </div>
    );
  }
}

export default BodyFirst;
