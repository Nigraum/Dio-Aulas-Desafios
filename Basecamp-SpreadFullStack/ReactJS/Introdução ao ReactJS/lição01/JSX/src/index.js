import React from "react"
import ReactDOM from "react-dom"
import "./style.css"

function soma(a, b) {
    return a + b
}

function primeiroJSX() {
    return (
        <div className="teste">
            Yan Negrao - Introdução ao ReactJS
            <h1>Soma: {soma(15, 65)}</h1>
        </div>
    )
}


const App = () => {
    return (
        <div className="App">
            {primeiroJSX()}
        </div>
    )
}


const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)