// Todas las clases heredan de la clase Object, es la clase padre por default

// ESTA PARTE DE ARRIBA FUE ESCRITA DESPUÉS DE LA CLASE EMPLEADO ^^^
class Persona{
    constructor(name, lastName){
        this._name = name
        this._lastName = lastName
    }
    set name(name){
        this._name = name
    }

    get name(){
        return this._name
    }

    set lastName(lastName){
        this._lastName = lastName
    }

    get lastName(){
        return this._lastName
    }

    // No se necesita la palabra function, pero ya sabías
    nombreCompleto(){
        return "This person is called " + this._name + " " + this._lastName
    }

    // Sobreescribir el método toString, que viene de la clase padre Object
    toString(){
        return this.nombreCompleto()
    }

}
let emilio = new Persona("Emilio", "Santos")
console.log(emilio);

let goku = new Persona("Son", "Goku")
goku.name = "Gohan?"
console.log(goku.name);

// HERENCIA
// Vamos a hacer una subclase usando el concepto de herencia

class Empleado extends Persona{
    // Se usa la palabra reservabada 'extends' para declarar que es una extensión de Persona
    constructor(nombre, apellido, departamento){
        super(nombre,apellido)
        // Así se hace la herencia de propiedades, con la función super (o método)
        // También se declaran estos atributos en el constructor, no sé si se pasan los métodos también
        this._departamento = departamento
    }

    set departamento(departamento){
        this._departamento = departamento
    }

    get departamento(){
        return this._departamento
    }

    nombreCompleto(){
        return super.nombreCompleto() + " and works in the " + this._departamento + " department"
    }
}

let Marco = new Empleado("Marco", "Reyes", "Finanzas")

console.log(Marco.departamento);
console.log(Marco.nombreCompleto());

console.log(emilio.toString());
console.log(Marco.toString());