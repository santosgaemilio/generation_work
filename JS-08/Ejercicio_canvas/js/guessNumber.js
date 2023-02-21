// Número que se debe de adivinar
var max =100
let secreto = Math.floor(Math.random()*max)

// Elementos DOM
let button = document.getElementById("try")
let rstart = document.getElementById("reset")
    // Como el input está en modo "number", no es necesario corregirlo
let guess = document.getElementById("guess")
let result = document.getElementById("result")
let times = document.getElementById("tries")

// Aqui se almacenan los intentos
var tries = []

// Función de adivinanza
function guessTry(){
    let trueGuess = parseInt(guess.value)
    if (trueGuess >max || trueGuess<0){
        result.innerHTML = "Intente un número positivo menor que "+max
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
    secreto = Math.floor(Math.random()*max)
    result.innerHTML = ""
    times.innerHTML = ""
    tries = []
}

button.addEventListener("click", guessTry)
rstart.addEventListener("click", reset)