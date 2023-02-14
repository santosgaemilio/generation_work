let names = ["Maria", "Antony", "Joy", "Juan"]
// Part 1
// Forma con metodos
names.push("Emilio")
console.log(names);

// Part 2
function checkName(name){
    for(i=0;i<=names.length;i++){
        if (name === names[i]){
            return console.log(true);
        }
    }
    console.log(false)
}

checkName("Perro")
// con método
console.log(names.includes("Maria"));