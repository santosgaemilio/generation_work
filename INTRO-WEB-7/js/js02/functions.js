function resta(){
    let v1 = parseInt(document.getElementById("v3").value);
    let v2 = parseInt(document.getElementById("v4").value);
    let resta  = v1 - v2

    document.getElementById("resta").innerHTML = resta
    
}
function mult(){
    let v1 = parseInt(document.getElementById("v5").value);
    let v2 = parseInt(document.getElementById("v6").value);
    let mult  = v1 * v2

    document.getElementById("mult").innerHTML = mult
    
}
let divi = function(){
    let v1 = parseInt(document.getElementById("v7").value);
    let v2 = parseInt(document.getElementById("v8").value);
    let divi  = v1 / v2

    document.getElementById("divi").innerHTML = divi
    
}
function suma(){
    let v1 = parseInt(document.getElementById("v1").value);
    let v2 = parseInt(document.getElementById("v2").value);
    let suma = v1 + v2;

    document.getElementById("suma").innerHTML = suma;
}

console.log("Hola")

// No escribí cada función, solamente las explicaciones

// - El scope es el alcance que tengan las cosas, las funciones definidas tienen un scope local
// - Las funciones anónimas tienen un scope local por que pues están definidas como variables
// - El hoisting es la altura o como la cronología del JS, el JS lee de arriba a abajo como todo
// - Las funciones definidas se pasan por ahi los niveles de hoisting y pueden ser llamadas antes 
// de poder ser declaradas

/*
    - Funciones directas- Nombre (comunes)
    - Funciones anónimas- Viven pegadas a una variable o constante
    - Funciones como métodos- Para específicar que hacen los objetos
    - Funciones como constructores- Para construir o crear un objeto
*/

// Buscar que es refactorizar código
// Hacer que el código funcione igual, pero más eficiente


// Funciones flecha
    // Función normal: 
        function sumar(a,b){
            let sum1 = a + b
            console.log(sum1)
        }

    // Función flecha
        const sumarF = (a,b) => a + b;

/*

Return: La sentencia return finaliza la ejecucion de la funcion, y especifica un valor 
para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar 
y tambien para poder asignar el resultado a una variable.


*/







