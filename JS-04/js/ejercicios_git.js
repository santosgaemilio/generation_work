// Ejercicio 1
let nombres = ["Sofia", "David", "Juan"];
console.log(nombres)
nombres.push("Sara", "Agustin")
nombres.shift()
console.log(nombres)
nombres.splice(1,0,"Renata")
nombres.push("Elena")
console.log(nombres)

// Ejercicio 2

let pattern = "*"
for (i=0;i<=4;i++){
    console.log(pattern)
    pattern = pattern + "*"
}

// Ejercicio 3

xValue = 3
while(xValue>=0){
    console.log(xValue)
    xValue = xValue - 0.5
}

let odd = 1
while(odd<101){
    if (odd%2 !== 0){
        console.log(odd)
    }
    odd ++
}

function bracket(n){
    i=1
    while(i<=n){
        console.log("["+i+"]")
        i++
    }
}

bracket(6)

