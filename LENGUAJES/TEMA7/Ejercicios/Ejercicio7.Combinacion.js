// Dado este array de usuarios
const usuarios = [
  { id: 1, nombre: "Ana", activo: true },
  { id: 2, nombre: "Carlos", activo: false },
  { id: 3, nombre: "María", activo: true }
]

// 1. Usa destructuring en un forEach para acceder a nombre y activo
usuarios.forEach(({ nombre, activo }) => {
  console.log(`${nombre}: ${activo ? "activo" : "inactivo"}`)
})

// 2. Crea un nuevo usuario basado en otro con cambios
const usuarioBase = usuarios[0]
const usuarioNuevo = { ...usuarioBase, id: 4, nombre: "Pedro" }

// 3. Usa map y arrow function para extraer solo los nombres
const nombres = usuarios.map((___)  => ___)

// 4. Usa filter y arrow function para obtener solo usuarios activos
const usuariosActivos = usuarios.filter((___)  => ___)

console.log(nombres)          // ["Ana", "Carlos", "María"]
console.log(usuariosActivos)  // Array con Ana y María