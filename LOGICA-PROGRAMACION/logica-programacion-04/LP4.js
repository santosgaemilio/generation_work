let num = document.querySelector("#num")
let fib = document.querySelector("#fib")

let but = document.querySelector("#but")

function fibonacci(){
    let end = parseInt(num.value)
    let id = 1
    let result = [0]
    for (let i = 1; i < end; i++) {
            result.push(id)
            id = result[result.length-2] + result[result.length-1]   
    }
    
    fib.innerHTML = result
}

but.addEventListener("click", fibonacci)

