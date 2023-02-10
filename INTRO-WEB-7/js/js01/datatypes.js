var nombre = "Emilio"
var edad = 26
var tengoMascotas = true
var tengoTrabajo = false
var tengoSueldo //Undefined

// let nombre = "Emilio"
// let edad = 30
// let tengoMascotas = true
// let tengoTrabajo = false
// let tengoSueldo

// function sala(){
    
//     let horas = parseInt(prompt("Ingrese las horas trabajadas: "));
//     let porHora = parseInt(prompt("Ingrese el pago por hora: "));
//     let salario = horas * porHora;
//     alert("Tu salario es: " + salario + " pesos")

// }

function sala2(){
    
    let horas = document.getElementById("horas").value;
    let porHora = document.getElementById("porHora").value;
    let salario = horas * porHora;
    document.getElementById("salario").innerHTML = salario + " pesos"

}

function opera(){
    let solu = (3+2)/(2*5)
    document.getElementById("solu").innerHTML = "La solución es: "+solu
}

function imc(){

    let peso = document.getElementById("peso").value;
    let altura = document.getElementById("altura").value;
    let pesoKg = peso*0.453592
    let alturaM = altura/100
    let imc = pesoKg/(alturaM*alturaM)
   
    switch(true){
        case imc<16:
            var sit = "criterio de ingreso"
            break;
        case imc>=16 && imc<16.9:
            var sit = "infrapeso"
            break;
        case imc>=17 && imc<18.4:
            var sit = "bajo peso"
            break;
        case imc>=18.5 && imc<24.9:
            var sit = "peso normal"
            break;
        case imc>=25 && imc<29.9:
            var sit = "sobrepeso"
            break;
        case imc>=30 && imc<34.9:
            var sit = "obesidad premórbida"
            break;
        case imc>=40 && imc<45:
            var sit = "obesidad mórbida"
            break;
        case imc>45:
            var sit = "obesidad hipermórbida"
            break;
    }

    document.getElementById("pesoId").innerHTML = pesoKg + " kg";
    document.getElementById("imc").innerHTML = imc;
    document.getElementById("obesi").innerHTML = sit;
}

