<script setup>
import { computed, ref } from 'vue';

// ARRAYS
const productos = [
  { id: 1, nombre: 'Portátil', precio: 999, stock: 12, categoria: 'Electrónica' },
  { id: 2, nombre: 'Teclado', precio: 49, stock: 34, categoria: 'Periféricos' },
  { id: 3, nombre: 'Monitor', precio: 320, stock: 8, categoria: 'Electrónica' },
  { id: 4, nombre: 'Ratón', precio: 25, stock: 60, categoria: 'Periféricos' },
  { id: 5, nombre: 'Auriculares', precio: 89, stock: 20, categoria: 'Audio' },
  { id: 6, nombre: 'Webcam', precio: 75, stock: 15, categoria: 'Periféricos' },
  { id: 7, nombre: 'SSD 1TB', precio: 110, stock: 27, categoria: 'Almacenamiento' },
  { id: 8, nombre: 'Hub USB', precio: 35, stock: 45, categoria: 'Periféricos' },
  { id: 9, nombre: 'Altavoces', precio: 130, stock: 9, categoria: 'Audio' },
  { id: 10, nombre: 'Alfombrilla', precio: 18, stock: 80, categoria: 'Periféricos' },
]


const estudiantes = [
  { id: 1, nombre: 'Dani Remón', nota: 9.2, aprobado: true, curso: 'DAW' },
  { id: 2, nombre: 'Luis Martín', nota: 4.8, aprobado: false, curso: 'DAM' },
  { id: 3, nombre: 'Sara López', nota: 7.5, aprobado: true, curso: 'ASIR' },
  { id: 4, nombre: 'Carlos Pérez', nota: 6.0, aprobado: true, curso: 'DAW' },
  { id: 5, nombre: 'Diego Quiles', nota: 3.1, aprobado: false, curso: 'DAM' },
  { id: 6, nombre: 'Pedro Sanz', nota: 8.8, aprobado: true, curso: 'ASIR' },
  { id: 7, nombre: 'Elena Vega', nota: 5.5, aprobado: true, curso: 'DAW' },
  { id: 8, nombre: 'Hector Enguita', nota: 2.9, aprobado: false, curso: 'DAM' },
  { id: 9, nombre: 'Hector Lozano', nota: 9.7, aprobado: true, curso: 'ASIR' },
  { id: 10, nombre: 'Tomás Gil', nota: 7.0, aprobado: true, curso: 'DAW' },
]

// Clases contador

//Variable reactiva que cambia insantaneamente cuando se actualiza
const contador = ref(0)

const aumentar = () => {
  contador.value++
}

const restar = () => {
  contador.value--
}

const resetear = () => {
  contador.value = 0
}

// El computed lo uso para que canmbie de color dependiendo si mayor o menor que 0

const claseContador = computed(() => {
  if (contador.value === 0) {
    return 'zero'
  }
  return contador.value > 0 ? 'verde' : 'rojo'
})


</script>

<template>
  <div class="container">
    <h1>Ejercicio v-for </h1>
    <hr>
    <ul>
      <li v-for="producto in productos" :key="producto">
        {{ producto.nombre }} - {{ producto.precio }} - {{ producto.stock }} - {{ producto.categoria }}
      </li>
      <hr>
      <li v-for="estudiante in estudiantes" :key="estudiante">
        {{ estudiante.nombre }} - {{ estudiante.nota }} - {{ estudiante.aprobado }}
      </li>
    </ul>
  </div>
  <hr>
  <div class="container">
    <h1>Ejercicio v-for + v-if</h1>
    <hr>
    <template v-for="producto in productos">

      <p v-if="producto.stock <= 10">
        {{ producto.nombre }} - Pocas unidades
      </p>
      <p v-if="producto.stock > 10">
        {{ producto.nombre }}
      </p>

    </template>
    <hr>
    <table class="table table-striped table-hover table-bordered" v>
      <thead class="table-dark">
        <tr>
          <th>Nombre</th>
          <th>Nota</th>
          <th>Resultado</th>
          <th>Curso</th>
        </tr>
      </thead>

      <tbody>
        <tr v-for="estudiante in estudiantes" :key="estudiante">
          <td>{{ estudiante.nombre }}</td>
          <td>{{ estudiante.nota }}</td>
          <td v-if="estudiante.aprobado" class="text-success fw-bold">
            Aprobado
          </td>
          <td v-else class="text-danger fw-bold"> suspenso</td>
          <td> {{ estudiante.curso }}</td>

        </tr>
      </tbody>

    </table>


  </div>
  <hr>
  <div class="container">
    <h1>Ejercicio 1</h1>
    <hr>
    <div class="text-center">
      <h1>Contador</h1>
      <h1 v-bind:class="claseContador">{{ contador }}</h1>
      <button @click="aumentar" class="btn  btn-success"> Aumentar</button>
      <button @click="restar" class="btn btn-danger"> Restar</button>
      <button @click="resetear" class="btn btn-primary"> Resetear</button>

    </div>

  </div>


</template>

<style>
.rojo {
  color: red;
}

.verde {
  color: green;
}

.zero {
  color: yellow;
}
</style>
