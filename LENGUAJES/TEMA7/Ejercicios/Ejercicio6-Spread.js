const numeros1 = [1, 2, 3]
const numeros2 = [4, 5, 6]

// Combina ambos arrays en uno nuevo
const todosCombinados = [...numeros1, ...numeros2]

// Copia numeros1 y agrega el número 7
const copiaConAgregar = [...numeros1, 7]

const persona = { nombre: "Luis", edad: 30 }

// Crea un nuevo objeto con los datos de persona + una ciudad
const personaCompleta = {...persona, ciudad: "Teruel"}

// Actualiza el nombre de persona manteniendo otros datos
const personaActualizada = {...persona, nombre: Ana}