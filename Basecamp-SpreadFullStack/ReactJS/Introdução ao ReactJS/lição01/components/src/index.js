import React from "react"
import ReactDOM from "react-dom"
import Button from './Button'
import "./style.css"

function soma (a, b) {
    alert (a + b)
}

function App () {
    return (
        <div className="App">
            Hello World
            <Button onClick = {() => soma (10,20)} name = "Nigraum" />
        </div>
    )
}

const rootElement = document.getElementById("root")
ReactDOM.render(<App /> rootElement)