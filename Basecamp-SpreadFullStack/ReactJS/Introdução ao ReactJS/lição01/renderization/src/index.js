import React from "react"
import ReactDOM from "react-dom"
import "./style.css"


const element = 'Testando teste teste'
const element2 = <h1>Olá seu amiguinho aqui</h1>

function App () {
    
    return (
        <div>
            {element}
            {element2}
        </div>
    )
}



const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)