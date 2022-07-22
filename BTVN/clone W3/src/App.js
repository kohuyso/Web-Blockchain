import "./App.css";
import React from "react";
import Body from "./components/Body/Body.jsx";
import Header from "./components/Header/Header.jsx";
const h2 = <h2>aaa</h2>;

class App extends React.Component {
  render() {
    console.log("Rendering App.js");
    return (
      <div className="App">
        <Header></Header>
        <Body></Body>
      </div>
    );
  }
}

export default App;
