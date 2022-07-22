import React from "react";
import { FaCaretDown } from "react-icons/fa";

var button1Status = [0, 0, 0];

const buttonC1 = () => {
  var button1_1 = document.getElementById("1");
  if (button1Status[0] == 0) {
    button1_1.style.display = "block";
    button1Status[0] = 1;
  } else {
    button1_1.style.display = "none";
    button1Status[0] = 0;
  }
};
const buttonC2 = () => {
  var button1_2 = document.getElementById("2");
  if (button1Status[1] == 0) {
    button1_2.style.display = "block";
    button1Status[1] = 1;
  } else {
    button1_2.style.display = "none";
    button1Status[1] = 0;
  }
};
const buttonC3 = () => {
  var button1_3 = document.getElementById("3");
  if (button1Status[2] == 0) {
    button1_3.style.display = "block";
    button1Status[2] = 1;
  } else {
    button1_3.style.display = "none";
    button1Status[2] = 0;
  }
};
class Header_record extends React.Component {
  render() {
    return (
      <div>
        <button className="header-button1" onClick={buttonC1}>
          Tutorials
          <FaCaretDown style={{ marginTop: "3px" }} />
          <div className="header-1-expand" id="1">
            Tutorials
          </div>
        </button>
        <button className="header-button1" onClick={buttonC2}>
          References
          <FaCaretDown style={{ marginTop: "3px" }} />
          <div className="header-1-expand" id="2">
            {" "}
            References{" "}
          </div>
        </button>
        <button className="header-button1" onClick={buttonC3}>
          Exercises
          <FaCaretDown style={{ marginTop: "3px" }} />
          <div className="header-1-expand" id="3">
            {" "}
            Exercises{" "}
          </div>
        </button>
      </div>
    );
  }
}

export default Header_record;
