// Nos permite extrar los valores de objetos y arrays facilmente
const persona = {
    nombre: "Dylan",
    edad: 20,
    
}
/*
const nombre = persona.nombre

const edad = persona.edad
*/

const { nombre, edad} = persona

console.log(nombre)