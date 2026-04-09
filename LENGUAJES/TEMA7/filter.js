// filter selecciona elementos que cumplen una condicion
const numeros = [5, 12 ,8, 20, 3, 15]
// Necesito numeros mayores que 10
const mayoresDe10 = numeros.filter( n => n > 10 )
console.log(mayoresDe10)

// Necesito los pares

const pares = mayoresDe10.filter( n => n % 2 === 0)
console.log(pares)
// CASO REAL

const alumnos = [
    {nombre: "Dylan", nota: 5},
    {nombre: "Remon", nota: 4},
    {nombre: "Andres", nota: 10}
]

// Alumbos aprobados

const aprobados = alumnos.filter(a => a.nota >= 5)
console.log(aprobados)