// Escribe tu código aquí.
s = "bocina"
a = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];

function bigWords(s,a){
    sLen = s.length 
    a2 = []
    
    for (i  = 0; i < a.length; i++) {
        if(sLen < a[i].length){
            a2.push(a[i])
        }
        
    }
    console.log(a2);
}

bigWords(s,a)


let lista = document.querySelector("#lista")
const myArray = ['insecto', 'bootcamp', 'escritorio'];
function printArray(a){
    let str = ""
    for (i  = 0; i < a.length; i++) {
        str = str + "<li>"+a[i]+"</li>"
        
    }
    lista.innerHTML = str
}

document.querySelector("#act").addEventListener("click",()=>printArray(myArray))

