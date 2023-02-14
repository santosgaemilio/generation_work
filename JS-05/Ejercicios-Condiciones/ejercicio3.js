function numberRange(number){

    switch (true) {
        case (number>=0 && number<=25):
            console.log(number + " is between 0 and 25");
            break;
        case (number>=26 && number<=100):
            console.log(number + " is between 26 and 100");
            break;
        case (number>100):
            console.log(number + " is greater than 100");
            break;
        case (number<0):
            console.log(number + " is less than 0");
            break;
         
    }
}

numberRange(-234)