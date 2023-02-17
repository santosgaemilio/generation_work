/*

Qué encontramos en el árbol del DOM?

* Node: Es la unidad más básica dentro del documento. Puede ser una etiqueta, un
texto dentro de una etiqueta o un comentario, etc. 

    <title> NODO
        Manipulación DOM //Es un nodo, pero es hijo del title
    </title>

    - Document: También es un nodo, del tipo documento, es el nodo raiz a partir del
    cual se desarrollan o general todos los demás nodos. 

    - Element: Son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Atribute: Nodos que dan información asociada al tipo de elemento
    (Son como los tipos de preferencias que le pones a las tags)

    - Comentario: Comentarios y otros elementos dentro del HTML son considerados 
    nodos

*/

/*

Cómo leer nodos de mi Document Object Model (DOM)

Métodos tradicionales (Que se usan en versioes antiguas de JS)

    - document.getElementById() (suma_btn)
    - document.getElementsByTagName() (<button>)
    - document.getElementsByClassName() (boton)

*/

// EJEMPLOS

// let elementoId = document.getElementById("resta_btn")
// console.log(elementoId);

// let elementoTag = document.getElementsByTagName("button")
// console.log(elementoTag);

// console.log("Primer elemento", elementoTag[0]);

// let elementoClassName = document.getElementsByClassName("boton")
// console.log(elementoClassName);

/*
Métodos modernos

    - document.querySelector(#suma_btn)
    - documento.querrySelectorAll(.botones)

*/

// EJEMPLOS

// let unElemento = document.querySelector("#input1")
// console.log(unElemento);

// let variosElementos = document.querySelectorAll(".boton")
// console.log(variosElementos);

/*
Creación de Nodos
    -document.createElement(tipoNodo)
*/

// Creación de una etiqueta del tipo imagen
let imagenPerrito = document.createElement("img")
// Creación de atributos
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.alt = "perrito bonito"
imagenPerrito.style.width = "150px"
imagenPerrito.style.borderRadius = "10%"
// Poner elemento en el HTML
document.body.append(imagenPerrito)

// Actualizar nodos
// 1er paso: Identificar el nodo que quiero cambiar (outer) [Esto es más como 
// opcional]
// 2do paso: Modificar el nodo (inner)

let resultadoQueCambia = document.getElementById("resultado")
resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas"
// BOTONES Y FUNCIONES

let input1 = document.getElementById("input1")
let input2 = document.getElementById("input2")

let botonSuma = document.getElementById("suma_btn")
let botonResta = document.getElementById("resta_btn")
let botonMult = document.getElementById("mult_btn")
let botonDiv = document.getElementById("div_btn")

let resultado = document.getElementById("resultado")

/*
Manipulación del DOM

    - Métodods para acceder elementos
        - document.getElementById
        - etc.
    - Métodos para crear elementos
        - document.createElement (etiqueta)
        - document.createTextNode(texto)
    - Métodos para insertar elementos
        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement
    - Métodos para modificar elementos
        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)
*/

// No sé sinsea así, se ven muchas líneas
let textoAModificar = document.querySelector("#main_title")
function cambiarColor(){
    textoAModificar.style.color = "blue";
}function cambiarColor2(){
    textoAModificar.style.color = "black";
}
botonSuma.addEventListener("mouseover", cambiarColor)
botonSuma.addEventListener("mouseout", cambiarColor2)
// Funciones para la calculadora


function suma() {
    let n1 = parseInt(input1.value)
    let n2 = parseInt(input2.value)
    let suma = n1 + n2
    resultado.innerHTML = suma + " "+ botonSuma.value
}
botonSuma.addEventListener("click", suma)


function resta() {
    let n1 = parseInt(input1.value)
    let n2 = parseInt(input2.value)
    let resta = n1 - n2
    resultado.innerHTML = resta
}
botonResta.addEventListener("click", resta)
function mult() {
    let n1 = parseInt(input1.value)
    let n2 = parseInt(input2.value)
    let mult = n1 * n2
    resultado.innerHTML = mult
}
botonMult.addEventListener("click", mult)
function div() {
    let n1 = parseInt(input1.value)
    let n2 = parseInt(input2.value)
    let div = n1 / n2
    resultado.innerHTML = div
}
botonDiv.addEventListener("click", div)

// Segundo intento
document.querySelectorAll('.boton').forEach(click => {
    let id = click.getAttribute('id');
    let n1 = parseInt(input1.value)
    let n2 = parseInt(input2.value)
    click.addEventListener('click', () => {
        suma = n1 + n2
        resta = n1 - n2
        mult = n1 * n2
        div = n1 / n2
      console.log('A button with ID ' + id + ' was clicked!') 
    } );
  });

// let result = ()=>{
//     suma = n1 + n2
//     resta = n1 - n2
//     mult = n1 * n2
//     div = n1 / n2

//     bots.map((bot)=>{if(bot.value != null || bots.value != undefined){return }})
// }




/*
Cómo se crea un evento (addEventListener)
    - node.addEventListener("evento a escuchar")

*/