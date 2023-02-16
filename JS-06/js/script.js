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