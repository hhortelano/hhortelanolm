// ...
// Me sirve para operar con arrays y con objetos, me permite expandirlos

const numeros = [1, 2, 3, 4, 'Cinco', true]

const listaNumeros = [...numeros, 5, 6, ...numeros]

listaNumeros[0] = 'Dani'

console.log(listaNumeros.length)

const listaCopiada = [...listaNumeros]

// Esto tambien se puede hacer con objetos

const persona = {
    nombre: "Alberto",
    edad: 40,
}

const personaCompleto= {
    ...persona,
    ciudad: "Teruel",
    codigoPostal: 44002,
    email: "dani@gmail.com"
}

personaCompleto.email = "hola@dam.com"

console.log(personaCompleto)