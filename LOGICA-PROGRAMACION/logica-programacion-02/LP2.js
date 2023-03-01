let centi = document.querySelector("#grados")
let fa = document.querySelector("#fa")
let ke = document.querySelector("#ke")
let but = document.querySelector("#but")

function conv(){

    let faN = ((parseInt(centi.value)*1.8) + 32).toFixed(2)
    let keN = parseInt(centi.value) + 273.15

    fa.innerHTML = "Grados Fahrenheit: " + faN
    ke.innerHTML = "Grados Kelvin: " + keN
    faN  = 0
    keN = 0
}

but.addEventListener("click", conv)