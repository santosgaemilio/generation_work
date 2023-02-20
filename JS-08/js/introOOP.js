let persona = {
    nombre: "Emilio",
    apellido: "Santos",
    sumare: (n1,n2) => {return (suma = n1 + n2 )},
    sayName: function() {
        return 'My name is '+ this.nombre
    }
}

console.log(persona.apellido);
console.log(persona.nombre);
console.log(persona.sumare(2,3));
console.log(persona.sayName());