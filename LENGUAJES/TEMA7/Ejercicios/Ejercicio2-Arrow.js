// 1. Función tradicional
function multiplicar(a, b) {
  return a * b
}

// Convierte a arrow function:
const multiplicar = (a,b) => {
  return a * b
}

const sumar = (a, b) => { 
  return a + b
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



//Ejercicios adicionales IA

// 1
function restar(a, b) {
  return a - b
}

const restar = (a, b) => {
  return a - b
}

//2
function cuadrado(numero) {
  return numero * numero
}

const cuadrado = (numero) => numero * numero

//3

function saludar() {
  return "Hola"
}

const saludar = () => "Hola"

//4

function crearLibro(titulo, autor) {
  return {
    titulo: titulo,
    autor: autor
  }
}

const crearLibro = (titulo, autor) => ({titulo, autor})

//5
const dividir = (a, b) => {
  return a / b
}

const dividir = (a, b) => a / b

//6

const obtenerMinutos = new Date().getMinutes()

const obtenerMinutos = () => new Date().getMinutes()