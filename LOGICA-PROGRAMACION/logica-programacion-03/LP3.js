let num = document.querySelector("#num")
let fac = document.querySelector("#fac")

let but = document.querySelector("#but")

function factor(){
    let end = parseInt(num.value)
    let trace = [...Array(end).keys()].map(num => num + 1)
    let result = 1
    for (const ele of trace) {
        result = result * ele
    }
    fac.innerHTML = result
}

but.addEventListener("click", factor)

