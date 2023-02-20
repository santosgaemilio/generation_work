let lista = [12,5,80,34]
console.log(lista.length);

for(let i=0;i<lista.length;i++){
    console.log(lista[i])
}

let nuevaLista = lista.slice(1,4)
console.log(nuevaLista);

let otraLista = lista.join("-")
console.log(otraLista);

let otraotraLista = lista.push(100)
// El push hace return el lenght del array
console.log(otraotraLista);
console.log(lista);

let masListas = lista.concat(12,13)
console.log(masListas);

let popLista = lista.pop()
// El pop te hace return del elemento que sacó (Último elemento)
console.log(popLista);
console.log(lista);

let shiftLista = lista.shift()
// El shift te hace raturn del elemento que sacó (Primer elemento)
console.log(shiftLista);
console.log(lista);

// let spliceLista = lista.splice(1,2)
// console.log(spliceLista);
// console.log(lista);

let lista2 = [12,5,80,34,7]
lista2.splice(2,0,100,200,300)
console.log(lista2)
lista2.reverse()
console.log(lista2);

let lt = "Hola".split("")
console.log(lt);
lt.reverse()
let stn = lt.join("")
console.log(stn);


let lista3 = [12,5,80,34,7]
lista3.sort()
console.log(lista3);

let lista4 = [23,345,67,123,6781234,564,34,567]
lista4.sort(
    function(v1,v2){
        return v1 - v2
    }
)
console.log(lista4);

let nuevanuevaLista = lista4.map(
    function(valor){
        return valor * 2
    }
)
console.log(nuevanuevaLista);

// 40 100 1 5 25 10
// 1 100 40 5 25 10
// 1 100 5 40 25 10
// 1 100 5 25 40 10
// 1 100 5 25 10 40
// ---------------
// 1 100 5 25 10 40
// 1 5 100 25 10 40
// 1 5 25 100 10 40