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
    <div v-for="tarea in tareas" :key="tarea.id" class="d-flex justify-content-between align-items-center mb-2">
      <span :class="{ 'text-decoration-line-through': tarea.completada }">
        {{ tarea.texto }}
      </span>

      <button @click="tarea.completada = !tarea.completada" :class="obtenerClaseBoton(tarea)" >
        {{ tarea.completada ? 'Finalizado' : 'Pendiente' }}
      </button>
      
    </div>
  </div>
</template>

<style scoped>
</style>