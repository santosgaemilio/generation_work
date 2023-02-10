let hora = Number(prompt("Indica la hora: "))

if (hora >= 6 && hora <= 11){
    document.write("Buenos días!!")
}else if(hora>11 && hora <= 18){
    document.write("Buenas tardes!")
}else if(hora>18 && hora<=23){
    document.write("Buenas noches")
}else if(hora>24 || hora < 0){
    document.write("Esta hora no es real")
}else{
    document.write("zzz")
}