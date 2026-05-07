//Crear una promesa
const miPromesa = new Promise((resolve, reject) => {
    // Codigo asincrono
    setTimeout( () => {
        const exito = true

        if(exito){
            resolve("Exito!! Aqui estan los datos")
        }else{
            reject("Error: Algo salio mal!")
        }
    }, 2000)
})


// Usar esa promesa
miPromesa
    .then(resultado => {
        console.log(resultado) // Si se resuleve
    })
    .catch( error => {
        console.log(error) // si falla
    })