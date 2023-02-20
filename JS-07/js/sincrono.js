// alert("cohorte 23")
console.log("hola");
// alert("dia del gatito")
console.log("adios le pido");

setTimeout(
    function(){
        console.log("Hola mundo");
    },1000
)

setTimeout(
    function(){
        console.log("Hola mundo, 2s");
    },2000
)
console.log("primero");
    
const myCallback = () => console.log("Hello world whith delay")
setTimeout(myCallback)
console.log("sorpresa");