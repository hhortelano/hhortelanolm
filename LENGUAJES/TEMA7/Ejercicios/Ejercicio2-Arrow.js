// 1. Función tradicional
function multiplicar(a, b) {
  return a * b
}

// Convierte a arrow function:
const multiplicar = (a,b) => {
  return a * b
}

// 2. Función que devuelve un objeto
function crearPersona(nombre, edad) {
  return {
    nombre: nombre,
    edad: edad
  }
}

// Convierte a arrow function (simplificada):
const crearPersona = (nombre,edad) => ({nombre, edad})

// 3. Función sin parámetros
function obtenerHora() {
  return new Date().getHours()
}

// Convierte a arrow function:
const obtenerHora = new Date().getHours()