// Versión de js 5, o sea versión vieja. 
// El module exports se pone como un objeto con las funciones que se supone que se van a probar
module.exports.index_test = {
    // En la nueva versión de js se le puso en .index_test al final, para que el import
    // lo agarrara
    suma(a,b){
        return a + b
    },
    resta(a,b){
        return a - b
    },
    mult(a,b){
        return a * b
    },
    div(a,b){
        return a / b
    }
}