// Estructura de if:
/*
    if(condition){
        [bloque de código]
    } else
*/

let edad = parseInt(prompt("Escribe tu edad: "));

if(edad<=17){
    document.write("<h3>Tas chiquitín</h3>");
}else if(edad > 18){
    document.write("<h3>Tas ruco</h3>");
}else{
    document.write("<h3>Tienes 18</h3>");

}

// Lo que ya sabías del = == e ===

//  and &&
//  or ||
// not !

let p = true
let q = false

if (q && p) console.log("true")
if (q || p) console.log("true")