import "../../App.css";
import React from "react";
import BodyMainPart from "./BodyMainPart";
import a from "../../images/images";
import BodyMainPart2a from "./BodyMainPart2a";
import BodyMainPart2b from "./BodyMainPart2b";
import BodyMainPart2c from "./BodyMainPart2c";
import BodyFirst from "./BodyFirst";

const BodyParts = [
  {
    backgroundColor: "#d9eee1",
    language: "HTML",
    describe: "The language for building web pages",
    imag: a.ANH1,
    color: "back",
    fetures: [
      {
        FeClass: "green-button",
        Fedescribe: "Learn HTML",
      },
      {
        FeClass: "yellow-button",
        Fedescribe: "Video Tutorial",
      },
      {
        FeClass: "black-button",
        Fedescribe: "HTML Reference",
      },
      {
        FeClass: "pink-button",
        Fedescribe: "Buy Certificate",
      },
    ],
    getS: function () {
      return this.fetures.length;
    },
  },

  {
    backgroundColor: "#fff4a3",
    language: "CSS",
    describe: "The language for styling web pages",
    imag: a.ANH2,
    color: "back",
    fetures: [
      {
        FeClass: "green-button",
        Fedescribe: "Learn CSS",
      },
      {
        FeClass: "black-button",
        Fedescribe: "CSS Reference",
      },
      {
        FeClass: "pink-button",
        Fedescribe: "Buy Certificate",
      },
    ],
    getS: function () {
      return this.fetures.length;
    },
  },

  {
    backgroundColor: "#282a35",
    language: "JavaScript",
    describe: "TThe language for programming web pages",
    imag: a.ANH3,
    color: "white",
    fetures: [
      {
        FeClass: "green-button",
        Fedescribe: "Learn JavaScript",
      },
      {
        FeClass: "white-button",
        Fedescribe: "JavaScript Reference",
      },
      {
        FeClass: "pink-button",
        Fedescribe: "Buy Certificate",
      },
    ],
    getS: function () {
      return this.fetures.length;
    },
  },

  {
    backgroundColor: "#f3ecea",
    language: "Python",
    describe: "A popular programming language",
    imag: a.ANH4,
    color: "back",
    fetures: [
      {
        FeClass: "green-button",
        Fedescribe: "Learn Python",
      },
      {
        FeClass: "black-button",
        Fedescribe: "Python Reference",
      },
      {
        FeClass: "pink-button",
        Fedescribe: "Buy Certificate",
      },
    ],
    getS: function () {
      return this.fetures.length;
    },
  },

  {
    backgroundColor: "#96D4D4",
    language: "SQL",
    describe: "A language for accessing databases",
    imag: a.ANH5,
    color: "back",
    fetures: [
      {
        FeClass: "green-button",
        Fedescribe: "Learn SQL",
      },
      {
        FeClass: "black-button",
        Fedescribe: "SQL Reference",
      },
      {
        FeClass: "pink-button",
        Fedescribe: "Buy Certificate",
      },
    ],
    getS: function () {
      return this.fetures.length;
    },
  },
];

const BodyMainPart2aEle = [
  {
    backgroundColor: "#ffb3bb",
    language: "PHP",
    describe: "A web server programming language",
    buttonT: "Lear PHP",
  },

  {
    backgroundColor: "#fff080",
    language: "jQuery",
    describe: "A JS library for developing web pages",
    buttonT: "Lear jQuery",
  },

  {
    backgroundColor: "#F3ECEA",
    language: "Java",
    describe: "A programming language",
    buttonT: "Lear Java",
  },
  {
    backgroundColor: "#D9EEE1",
    language: "C++",
    describe: "A programming language",
    buttonT: "Lear C++",
  },
  {
    backgroundColor: "#96D4D4",
    language: "W3.CSS",
    describe: "A CSS framework for faster and better responsive web pages",
    buttonT: "Lear W3.CSS",
  },
  {
    backgroundColor: "#E7E9EB",
    language: "Bootstrap",
    describe: "A CSS framework for designing better web pages",
    buttonT: "Lear Bootstrap",
  },
];

const BodyMainPart2bEle = [
  {
    className: "pink-button",
    language: "C",
  },
  {
    className: "yellow-button",
    language: "C#",
  },
];
const BodyMainPart2cEle = [
  {
    className: "white-button",
    language: "R",
  },
  {
    className: "green1-button",
    language: "Kotlin",
  },
  {
    className: "green2-button",
    language: "Node.js",
  },
  {
    className: "pink-button",
    language: "React",
  },

  {
    className: "yellow-button",
    language: "JSON",
  },
  {
    className: "white-button",
    language: "AngularJS",
  },
  {
    className: "green1-button",
    language: "MySQL",
  },
  {
    className: "green2-button",
    language: "XML",
  },

  {
    className: "pink-button",
    language: "Sass",
  },
  {
    className: "yellow-button",
    language: "Icons",
  },
  {
    className: "white-button",
    language: "RWD",
  },
  {
    className: "green1-button",
    language: "Graphics",
  },

  {
    className: "green2-button",
    language: "SVG",
  },
  {
    className: "pink-button",
    language: "Canvas",
  },
  {
    className: "yellow-button",
    language: "Raspberry Pi",
  },
  {
    className: "white-button",
    language: "Cyber Security",
  },

  {
    className: "green1-button",
    language: "Colors",
  },
  {
    className: "green2-button",
    language: "Git",
  },
  {
    className: "pink-button",
    language: "Matplotlib",
  },
  {
    className: "yellow-button",
    language: "NumPy",
  },

  {
    className: "white-button",
    language: "R",
  },
  {
    className: "green1-button",
    language: "Kotlin",
  },
  {
    className: "green2-button",
    language: "Node.js",
  },
  {
    className: "pink-button",
    language: "React",
  },
];

const BodyMainPart2dEle = [
  {
    className: "green2-button",
    language: "Excel",
  },
  {
    className: "yellow-button",
    language: "Google Sheets",
  },
  {
    className: "pink-button",
    language: "Machine Learning",
  },
  {
    className: "white-button",
    language: "Artificial Intelligence",
  },
  {
    className: "white-button",
    language: "Statistics",
  },
  {
    className: "green1-button",
    language: "Data Science",
  },
];

class Body extends React.Component {
  render() {
    console.log("Rendering Body.js");

    const BodyMainPartElements = BodyParts.map((part, index) => {
      return (
        <BodyMainPart
          key={index}
          color={part.color}
          backgroundColor={part.backgroundColor}
          language={part.language}
          describe={part.describe}
          imag={part.imag}
          getS={part.getS()}
          fetures={part.fetures}
        />
      );
    });

    const BodyMainPartElements2a = BodyMainPart2aEle.map((part, index) => {
      return (
        <BodyMainPart2a
          key={index}
          backgroundColor={part.backgroundColor}
          language={part.language}
          describe={part.describe}
          buttonT={part.buttonT}
        />
      );
    });

    const BodyMainPartElements2b = BodyMainPart2bEle.map((part, index) => {
      return (
        <BodyMainPart2b
          key={index}
          className={part.className}
          language={part.language}
        />
      );
    });
    const BodyMainPartElements2c = BodyMainPart2cEle.map((part, index) => {
      return (
        <BodyMainPart2c
          key={index}
          className={part.className}
          language={part.language}
        />
      );
    });

    const BodyMainPartElements2d = BodyMainPart2dEle.map((part, index) => {
      return (
        <BodyMainPart2b
          key={index}
          className={part.className}
          language={part.language}
        />
      );
    });

    return (
      <div>
        <BodyFirst></BodyFirst>
        {BodyMainPartElements}
        <div className="Body-mainPart-2a">{BodyMainPartElements2a}</div>
        <div className="Body-mainPart-2b">{BodyMainPartElements2b}</div>
        <div className="Body-mainPart-2c">{BodyMainPartElements2c}</div>
        <div className="Body-mainPart-2d">{BodyMainPartElements2d}</div>
        <div className="Body-mainPart-2f">
          <h1
            style={{ fontSize: "75px", fontWeight: "700", textAlign: "center" }}
          >
            Code Editor
          </h1>
          <h4 style={{ marginTop: "-25px", fontSize: "22px" }}>
            With our online code editor, you can edit code and view the result
            in your browser
          </h4>
          <img
            src={a.ANH6}
            style={{ marginTop: "15px", height: "500px", width: "1206px" }}
          ></img>
          <button
            className="green-button"
            style={{
              marginTop: "15px",
              fontSize: "22px",
              fontWeight: "600",
              textAlign: "center",
              padding: "12px",
              border: "none",
              borderRadius: "7px",
              marginLeft: "-767px",
              paddingLeft: "21px",
              paddingRight: "21px",
            }}
          >
            Try Frontend Editor (HTML/CSS/JS)
          </button>
          <button
            className="yellow-button"
            style={{
              marginTop: "24px",
              fontSize: "22px",
              fontWeight: "550",
              textAlign: "center",
              padding: "12px",
              border: "none",
              borderRadius: "7px",
              marginLeft: "-724px",
              paddingLeft: "21px",
              paddingRight: "21px",
            }}
          >
            Try Backend Editor (Python/PHP/Java..)
          </button>
        </div>
        <div className="backImage"></div>
        <div className="Body-mainPart-2e">
          <h1 style={{ fontSize: "72px", fontWeight: "700" }}>
            W3Schools Spaces
          </h1>
          <h3
            style={{ fontSize: "30px", fontWeight: "700", marginTop: "-10px" }}
          >
            Build your own website with W3Schools Spaces.
          </h3>
          <button
            className="green-button"
            style={{
              fontSize: "25px",
              fontWeight: "bold",
              marginTop: "21px",
              border: "none",
              borderRadius: "25px",
              width: "360px",
              padding: "18px 28px",
              opacity: "0.75",
            }}
          >
            {" "}
            Get Start for Free{" "}
          </button>
        </div>
      </div>
    );
  }
}
export default Body;
