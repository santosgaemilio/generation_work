function points(texto){
    let newTexto = texto.split(" ").map(
        (word)=>{
            return word.split("")
        }
    )
    
    let result = newTexto.map((word2)=>{return word2.join(".")}).join(" ")
    
    console.log(result);
}

points("Esta función trabaja con cualquier string")