const numeros = [1 , 2 , 3 ,4 ,5 ,6 ,7 ,8]
/*
const dobles = numeros.map( (numero) => {
    console.log(`Procesando: ${numero}`)
    return numero * 2
})
*/
const dobles = numeros.map(n => n * 2)

console.log(numeros)
console.log(dobles)
// Necesito que todos valores del array numero que sean Divisibles por dos me los multipliques por 100

const problema = numeros.map( n =>{
    if ( n % 2 === 0){
        return n * 100
    }
    return n
})

console.log(problema)

// CASO REAL

const usuarioDesdeServidor = [
    {id: 1, nombre: "Ana", edad: 17},
    {id: 1, nombre: "Hector", edad: 19},
    {id: 1, nombre: "Remon", edad: 19},
]

// Necesitamos en la UI solo los nombres

const nombres = usuarioDesdeServidor.map( u =>  u.nombre)
console.log(nombres )
//  Puedo crear objetos transformados
const usuarioFormateados = usuarioDesdeServidor.map( u => ({
    label: u.nombre,
    valor: u.id,
    esAdulto: u.edad >= 18
}))
console.log( usuarioFormateados[2])