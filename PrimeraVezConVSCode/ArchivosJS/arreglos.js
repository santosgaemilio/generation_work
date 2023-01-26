let miArreglo = [] //Declaración literal
let miArreglo01 = new Array() //Declaración por instancia

let miArreglo02 = [1,2,3,4]

// En javascript el índice empieza en 0
console.log('dato del arreglo en el indice 0:', miArreglo02[0])
console.log('dato del arreglo en el indice 1:', miArreglo02[1])
console.log('dato del arreglo en el indice 2:', miArreglo02[2])
console.log('dato del arreglo en el indice 3:', miArreglo02[3])

let miArreglo03 = ['Hola', 'que', 'tal']
console.log(miArreglo03[0])
console.log(miArreglo03[1])
console.log(miArreglo03[2])

let miArreglo04 = [{nombre:'Emilio'}, {apellido:'Santos'}, {edad: 26}]

console.log('Elemento del arreglo de tipo objeto miArreglo04 ', miArreglo04[0].nombre)
console.log('Elemento del arreglo de tipo objeto miArreglo04 ', miArreglo04[0])
console.log('Elemento del arreglo de tipo objeto miArreglo04 ', miArreglo04[0]['nombre'])
console.log('El tamaño de miArreglo04 es: '+ miArreglo04.length)

let nuevoArr = [3,6,1,4]
console.log('sort() ' + nuevoArr.sort())
console.log('pop() ' + nuevoArr.pop())
console.log('push() ' + nuevoArr.push(10) +' '+ nuevoArr)
console.log('reverse() ' + nuevoArr.reverse())

console.log('javascript'[2])

let matrix = [
            [1,2,3], 
            [4,5,6],
            [7,8,9]
            ]
console.log('tamaño: '+ matrix.length)
console.log(matrix[1][1])
console.log(matrix[2][1])

let otroArreglo = ['que', 'hola', 'tal', 'como']

console.log('sort() ' + otroArreglo.sort())
console.log('pop() ' + otroArreglo.pop())
console.log('push() ' + otroArreglo.push('estas'))
console.log('reverse() ' + otroArreglo.reverse())