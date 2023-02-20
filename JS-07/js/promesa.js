const myURL = document.URL.toString()
const promesa = fetch(myURL)

promesa.then((resultado) => console.log(resultado), (e)=> console.log(`error callback ${e}`));
//Cuando haces el then, tu primera función es lo que va a pasar cuando la petición en exitosa, y
// la segunda función es lo que pasa si falla. Aqui realmente no sé como podría fallar, ya lo intenté 
// varias veces. Además, técnicamente este no es una promesa



// let e = "asi se pegan strings?"
// console.log(`creo que ${e}`);

console.log(`fo
bar`);