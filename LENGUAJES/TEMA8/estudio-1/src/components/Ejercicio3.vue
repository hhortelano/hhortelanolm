<script setup>
import { computed, ref } from 'vue';
// Ejercicio3
const tareas = ref([
  {
    id: 1,
    texto: 'Preparar actividad de Vue',
    completada: false
  },
  {
    id: 2,
    texto: 'Revisar el examen de Lenguaje de Marcas',
    completada: false
  },
  {
    id: 3,
    texto: 'Corregir prácticas de Bootstrap',
    completada: true
  },
  {
    id: 4,
    texto: 'Subir notas al aula virtual',
    completada: false
  },
  {
    id: 5,
    texto: 'Enviar recordatorio a los alumnos',
    completada: true
  }
])

// Esto cambia el colo del boton cuando le das en funcion si esta completada  o no
const obtenerClaseBoton = computed(() => {
  return (tarea) =>
    tarea.completada
      ? 'btn btn-success'
      : 'btn btn-secondary'
})
</script>

<template>
<div class="container mt-5">
    <h1>Dani - Ejercicio 3: Lista de tareas</h1>

    // Esto recorre el array 
    <div v-for="tarea in tareas" :key="tarea.id" class="d-flex justify-content-between align-items-center mb-2">
      // Esto hace que cuando le das click al boton te tacha el texto cuando la tarea esta completada
      <span :class="{ 'text-decoration-line-through': tarea.completada }">
        // Esto es para mostrar el apartado de texto del array
        {{ tarea.texto }}
      </span>

      // El valor de tarea.completa es true o false y con esto cambia a true o a false cuando le das al boton
      <button @click="tarea.completada = !tarea.completada" :class="obtenerClaseBoton(tarea)" >
        // Esto cambia el texto que pone en el boton dependiendo y esta completada o no
        {{ tarea.completada ? 'Finalizado' : 'Pendiente' }}
      </button>
      
    </div>
  </div>
</template>

<style scoped>
</style>