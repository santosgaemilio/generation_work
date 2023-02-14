let names = ["Maria", "Antony", "Joy", "Juan"]
// ---------------------------------------Part 1
// Forma con metodos
names.push("Emilio")
console.log(names);

// ---------------------------------------Part 2

// Con método

console.log(names.includes("Maria"));

// ---------------------------------------Part 3

// Con método

function checkList(list){
    let checkListM = list.filter(
        (name) => {
            return names.includes(name)
        }
    )
    console.log(checkListM);
}
checkList(["Maria", "Pedro", "Emilio", "Perro"])



// ----------------------------------------Part 4

// Con método

function checkCount(listNames){
    let checkMap = listNames.map(
        (strings) => {
            return strings.length
        }
    )
    console.log(checkMap);
}

checkCount(["Maria", "Pedro", "Emilio"])


