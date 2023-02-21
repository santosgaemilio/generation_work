// Número que se debe de adivinar

let secreto = Math.floor(Math.random()*5)

// Elementos DOM
let button = document.getElementById("try")
let rstart = document.getElementById("reset")
let logIn = document.getElementById("accept")
// Como el input está en modo "number", no es necesario corregirlo
let guess = document.getElementById("guess")
let result = document.getElementById("result")
let times = document.getElementById("tries")

let userName = document.getElementById("name")
// Aqui se almacenan los intentos
var tries = []

// -----------------------------------------------------------------------------------
// INTENTO DE PONER UN OBJETO --------------------------------------------------------
class User{
    constructor(name){
        this._name = name
    }
}
// -----------------------------------------------------------------------------------
// Get name
let user3 = new User(userName.value)
console.log(user3._name);