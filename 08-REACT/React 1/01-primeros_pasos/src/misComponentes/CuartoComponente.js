import React from 'react'

const productos = [
    {titulo: "Motos", esFruta: false, id: 1},
    {titulo: "Perros", esFruta: false, id: 2},
    {titulo: "Manzana", esFruta: true, id: 3},
    {titulo: "Pera", esFruta: true, id: 3}
]
export default function CuartoComponente() {
    const lista = productos.map(producto => <li key = {producto.id}>{producto.titulo}</li>)
  return (
    <div>
        <h2>Cuarto Componente</h2>
        <h3>Jugando con map()</h3>
        <ol>
            {lista}
        </ol>

    </div>
  )
}
