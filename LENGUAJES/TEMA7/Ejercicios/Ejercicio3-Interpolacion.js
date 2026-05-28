const producto = "Laptop"
const precio = 899
const descuento = 0.10

// Crea un mensaje usando template strings que diga:
// "El producto Laptop cuesta 899 euros"
const mensaje1 = `El producto ${producto} cuesta ${precio}`

// Crea otro que calcule el precio final con descuento:
// "Laptop tenía un precio de 899, con 10% de descuento cuesta 809.1 euros"
const mensaje2 = `${producto} tenia un precio de ${precio}, con ${descuento * 100}% de descuento cuesta ${precio * (1 - descuento)}`
// Usa una arrow function para mostrar un saludo personalizado
const saludar = (nombre) => `Hola ${nombre}, bienvenida a nuestro sistema`

console.log(saludar("Ana"))  // Debe mostrar: "Hola Ana, bienvenida a nuestro sistema"



//Ejercicios extra con IA
//1
const nombre = "Carlos"
const edad = 28

// Crea un template string que diga:
// "Carlos tiene 28 años"
const mensaje = `${nombre} tiene ${edad} anios`

//2
const producto = "Teclado"
const precio = 50
const iva = 0.21

// Crea un mensaje que diga:
// "El teclado cuesta 50 euros y con IVA cuesta 60.5 euros"
const mensaje = `El ${producto} cuesta ${precio} euros y con IVA cuesta ${precio * (1 - iva)}`

//3
const bienvenida = (usuario, ciudad) => `Bienvenido ${usuario} desde ${ciudad}`

// Resultado esperado:
// "Bienvenido Pedro desde Valencia"
console.log(bienvenida("Pedro", "Valencia"))

//4
const nota1 = 8
const nota2 = 6
const nota3 = 9

// Crea un template string que muestre:
// "La media es 7.66"
//
// Tienes que calcular la media dentro del ${}
const resultado = `La media es ${(nota1 + nota2 + nota3) / 3}`