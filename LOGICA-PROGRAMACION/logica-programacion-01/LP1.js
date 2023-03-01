let num1 = document.querySelector("#num1")
let num2 = document.querySelector("#num2")
let num3 = document.querySelector("#num3")
let orden = document.querySelector("#orden")
let orden2 = document.querySelector("#orden2")
let but = document.querySelector("#but")
function order(){
    if (num1.value === num2.value && num2.value === num3.value){
        orden.innerHTML = "Los números son iguales"
        orden2.innerHTML = ""
    }
    else{
        let ord = [num1.value, num2.value, num3.value]
        ord.sort((a, b)=>{return b - a})
        orden.innerHTML = "Mayor a menor: " + ord
        ord.sort((a, b)=>{return a - b})
        orden2.innerHTML = "Menor a mayor: " + ord
    }
    
}

but.addEventListener("click", order)

