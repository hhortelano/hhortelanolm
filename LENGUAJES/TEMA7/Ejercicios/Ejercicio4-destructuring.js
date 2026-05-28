const libro = {
  titulo: "El Quijote",
  autor: "Cervantes",
  año: 1605,
  paginas: 863
}

// Extrae solo titulo y autor
const { titulo, autor } = libro

// Extrae año y paginas, renombrando paginas como "total_paginas"
const { año, paginas: total_paginas } = libro

// Accede a los valores
console.log(titulo)  // "El Quijote"
console.log(autor)   // "Cervantes"