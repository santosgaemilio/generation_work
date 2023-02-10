let diaNumero = prompt("Ingrese el día de la semana: ");

if(diaNumero == 0){
    document.write("<h3>Es domingo</h3>");
}else if(diaNumero == 1){
    document.write("<h3>Es lunes</h3>");
}else if(diaNumero == 2){
    document.write("<h3>Es martes</h3>");
}else if(diaNumero == 3){
    document.write("<h3>Es miercoles</h3>");
}else if(diaNumero == 4){
    document.write("<h3>Es jueves</h3>");
}else if(diaNumero == 5){
    document.write("<h3>Es viernes</h3>");
}else if(diaNumero == 6){
    document.write("<h3>Es sábado</h3>");
}else{
    document.write("<h3 style='color:crimson'>Número de día inválido</h3>");

}