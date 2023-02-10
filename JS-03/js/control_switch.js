let diaNumero = Number(prompt("Ingrese el día de la semana: "));

switch (diaNumero) {
    case 1:
        document.write("<h3>Es lunes</h3>");
        break;
    case 2:
        document.write("<h3>Es Marte</h3>");
        break;
    case 3:
        document.write("<h3>Es Miercoles</h3>");
        break;
    case 4:
        document.write("<h3>Es Jueves</h3>");
        break;
    case 5:
        document.write("<h3>Es Viernes</h3>");
        break;
    case 6:
        document.write("<h3>Es Sábado</h3>");
        break;
    case 7:
        document.write("<h3>Es Domingo</h3>");
        break;

    default:
        document.write("<h3 style='color:crimson'>Número de día inválido</h3>");
        break;
}