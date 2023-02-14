let texto = "Hola Mundo"
// let mensaje = "El texto tiene " + texto.length + " caracteres"
// console.log(mensaje) 
let mensaje = ""

for (let index = 0; index < texto.length; index++) {
    mensaje+= texto[index] + ""
    
}

mensaje = mensaje.trim()
console.log(mensaje);
console.log(mensaje.toUpperCase());
console.log(mensaje.toLowerCase());

// Bastante castroso el Quokka
let palabra = mensaje.substring(5,7)
let palabra2 = mensaje.substr(-5)
// El substr() acepta valores negativos, pero esta ya ni se usa. Es mejor tener en cuenta el substring
// El substr() agarra (inicio,que tan largo)
// El substring() agarra (inicio, final[no inclusivo])
console.log(palabra);
console.log(palabra2);
let splot = mensaje.split(" ")
let splat = mensaje.split(".")
console.log(splot);
console.log(splat);


console.log(splot[0] + " / "+ splot[1]);

if (mensaje.includes("u")) {
    console.log("SI lo tiene");
}else{
    console.log("No lo tiene");
}