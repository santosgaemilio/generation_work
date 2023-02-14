// PROBLEMA 1

if(GPAacumulativo > 2.0 && UnidadesTotales >= 120){
    console.log("Puede graduarse!!");
}

// PROBLEMA 2

if (cspCalificacion >= 75 || progCalificacion >= 75) {
    console.log("Eres elegible para la graduación!");
}

// PROBLEMA 3
// Quitarle la L mayúscula
// let texto = ((string = "HoLa Mundo")=>{
//     return string.slice(0,2) + string.charAt(2).toLowerCase() + string.slice(3)
// })();

let text = "Hola Mundo"
// "Hola Mundo"

function points(texto){
    let newTexto = texto.split(" ").map(
        (word)=>{
            return word.split("")
        }
    )
    
    let result = newTexto.map((word2)=>{return word2.join(".")}).join(" ")
    
    console.log(result);
}

points("Esta función trabaja con cualquier string")

