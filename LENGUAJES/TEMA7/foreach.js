const alumnos = ["Hector","Javi", "Maria", "Dylan"]
// forma antigua 

//  for (let i = 0; i < alumnos.length; i++){
//     console.log(alumnos[i])
//  }

// forma moderna 
alumnos.forEach( (a) => {
    console.log( a )
})

// Forma moderna con indice
alumnos.forEach( (alumno, posicion) =>{
    console.log( `${posicion +1} - ${alumno}` )
})