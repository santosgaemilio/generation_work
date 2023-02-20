// Los nombres de las clases siempre van en mayúsculas
// En esta versión de hacer objetos siempre se hace de manera abstracta
// Se empieza con una abstracción general

class OperacionesAritmeticas{
    // Esta clase no tiene más clasificaciones arriba de ella, pero si debajo
    numero0 = 12;
    numero1 = 234;
    // Estas de arriba son propiedades, no necesitan palabra reservada
    // Miembro de datos son los atributos al parecer

    // VAMOS A MODIFICAR EL CONSTRUCTOR
    
    constructor(v1,v2){
        this.numero0 = v1
        this.numero1 = v2
    }

    sumar(a,b){ 
        return a+b
    }
    // Los métodos siempre son verbos en infinitivo, supongo que inglés es 
    // más simple. No se pone function tampoco
}

let objt1
objt1 = new OperacionesAritmeticas()
// El objt1 es una instacia de la clase, o sea un objeto
// Yo supongo que las líneas 18 y 19 se pueden poner en una misma

// Se pone () por que las clases tienen una función constructor en default, se
// puede definir pero no es necesario
console.log(objt1.sumar(34,34));
console.log(objt1.numero0);


let objt2 = new OperacionesAritmeticas()
console.log(objt2.sumar(objt2.numero0, objt2.numero1));
// NO SÉ POR QUE NO AGARRAN EL VALOR DEFAULT, TAL VEZ EL CONSTRUCTOR SIEMPRE VA PRIMERO

let objt3 = new OperacionesAritmeticas()
objt3.numero0 = 23
objt3.numero1 = 2345
console.log(objt3.sumar(objt3.numero0, objt3.numero1));

let objt4  = new OperacionesAritmeticas(23,23)
console.log(objt4.sumar(objt4.numero0, objt4.numero1));

// ES CASI EXACTAMENTE LO MISMO QUE EN PYTHON