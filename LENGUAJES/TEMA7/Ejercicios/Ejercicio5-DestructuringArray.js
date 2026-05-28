const numeros = [10, 20, 30, 40, 50]

// Extrae el primero y segundo elemento
const [a, b] = numeros

// Extrae el primero, omite el segundo, y toma el tercero
const [primero, , tercero] = numeros

// Extrae los dos primeros y el resto en un array
const [uno, dos, ...resto] = numeros

console.log(primero)  // 10
console.log(tercero)  // 30
console.log(resto)    // [30, 40, 50]