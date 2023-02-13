let miVariable = 5;
// Poniendo los [] ya se sabe que es un arreglo, es lo mismo que python
let miArray = [1,2,3,4,5]
// Cada elemento del array tiene un índice, como en python
// let myArray = new Array();
let miArray2 = [4]
let miArray3 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]

// Aqui no es realmente como álgebra lineal, se buscan los elementos del array externo primero y después los segundos
// muy diferente a Matlab
console.log(miArray3[2][1])
console.log("El primer vector es: ", miArray3[0])

// ---------------------------LOOPS-------------------------------------------------
// ----------------------------FOR--------------------------------------------------
// for (let i = 1; i<10;i++){
//     console.log(i)
// }

for(let i=0;i<5;i++){
    console.log('Array ', miArray[i]);
}

for(let i=0;i<3;i++){
    for(let j=0;j<3;j++){
        console.log("Array 2: ", miArray3[i][j])
    }
    console.log('********************');
}

let really = [[],[],[]]

// Multiplicación de matrices matemáticamente (INVESTIGAR)
for(let i=0;i<3;i++){
    for(let j=0;j<3;j++){
        really[i][j] = miArray3[i][j] * miArray3[i][j]
    }
    
}

console.log(really);


// ----------------------------WHILE---------------------------------------------

let contador = 0;
while(contador <10){
    console.log(contador)
    contador++
}