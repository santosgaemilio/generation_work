// Prueba efectiva
// const index_test = require("../Calculadora")
// Con ./ te manda al final de las carpetas, y creo que ahi te busca

import { index_test } from "../Calculadora";
// Este es lo mismo que hacer la variable, pero ahora es talvez más legible
test('test suma', () =>{
    const r = index_test.suma(3,2)
    expect(r).toBe(5)
})

test.todo('test resta');
test.todo('test mult');
test.todo('test div');