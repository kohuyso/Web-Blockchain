import React from "react";
import Logo from "../../images/favicon.ico";
import "../../App.css";
import Header_record from "./Header_record";
import { RiContrastFill } from "react-icons/ri";
import { GiEarthAsiaOceania } from "react-icons/gi";
import { FaSearch } from "react-icons/fa";

const recordEl = [
  {
    title: "Tutorials",
    Onfuction: "buttonC1()",
  },
  {
    title: "References",
    Onfuction: "buttonC2",
  },
  {
    title: "Exercises",
    Onfuction: "buttonC3",
  },
];

// const Alo1 = recordEl.map((part, index) => {
//   return (
//     <Header_record key={index} title={part.title} Onfuction={part.Onfuction} />
//   );
// });

class Header extends React.Component {
  render() {
    return (
      <div className="header">
        <div className="header-1">
          <a href="https://www.w3schools.com/" className="header-logo">
            <img
              src={Logo}
              alt="Logo"
              style={{
                width: "54px",
                marginTop: "3px",
                marginLeft: "5px",
              }}
            />
            <div className="header-logo-schools">schools</div>
          </a>
          <Header_record></Header_record>
          <button className="header-button1"> Videos </button>
        </div>

        <div
          className="header-1"
          style={{ alignItems: "center", marginRight: "18px" }}
        >
          <RiContrastFill id="icon1" style={{}}></RiContrastFill>
          <GiEarthAsiaOceania id="icon2"></GiEarthAsiaOceania>
          <FaSearch id="icon3"></FaSearch>
          <button className="header-button2">
            <div style={{ padding: "12px" }}>Pro</div>
          </button>
          <button
            className="header-button2"
            style={{ backgroundColor: "#ffc0c7" }}
          >
            <div style={{ padding: "12px" }}>Get Certificate</div>
          </button>
          <button className="header-button2">
            <div style={{ padding: "12px" }}>Website</div>
          </button>
          <button className="header-button2 header-login-Button">
            <div
              style={{
                padding: "12px",
                paddingLeft: "40px",
                paddingRight: "40px",
                color: "white",
              }}
            >
              Log in
            </div>
          </button>
        </div>
      </div>
    );
  }
}

export default Header;
