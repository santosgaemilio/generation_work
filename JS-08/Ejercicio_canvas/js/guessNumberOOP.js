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
    constructor(name, tries){
        this._name = name
        this._tries = tries
    }

    set name(name){
        this._name = name
    }

    get name(){
        return this._name
    }
    
    set tries(tries){
        this._tries = tries
    }

    get tries(){
        return this._tries
    }

}
// -----------------------------------------------------------------------------------


// Función de adivinanza
function guessTry(){
    let trueGuess = parseInt(guess.value)
    if (trueGuess >100 || trueGuess<0){
        result.innerHTML = "Intente un número positivo menor que 100"
    }else if
    ( trueGuess === secreto){
        result.innerHTML = "Felicidades, adivinaste el número secreto!" 
        // Se imprimen los intentos
        tries.push(trueGuess)
        let numTries = tries.length
        times.innerHTML = "Tus intentos fueron: "+ tries +"|| Wow fueron "+numTries+ " intentos"
        
    }else if (trueGuess > secreto){
        // Te dice si el número está abajo o arriba
        result.innerHTML = "Ups, el número secreto es incorrecto, vuelve al intentarlo. El número debe ser menor" 
        tries.push(trueGuess)
    }else if (trueGuess < secreto){
        // Te dice si el número está abajo o arriba
        result.innerHTML = "Ups, el número secreto es incorrecto, vuelve al intentarlo. El número debe ser mayor"
        tries.push(trueGuess)
    }
    
}

// Función de reset
function reset(){
    secreto = Math.floor(Math.random()*5)
    result.innerHTML = ""
    times.innerHTML = ""
    tries = []
}

let userBase = []

// nueva función reset
function accept(){
    let accept = document.createElement()
    let name = userName.value
    userBase.push(new User(name, tries.length, tries))
   
   
}

button.addEventListener("click", guessTry)
rstart.addEventListener("click", reset)
logIn.addEventListener("click", accept)