<script setup>
import CardPersonaje from '@/components/CardPersonaje.vue';
import axios from 'axios';
import { computed, ref } from 'vue';

const personajes = ref([])

const favorito = ref("")

const cambiarFavorito = (titulo) => {
    favorito.value = titulo
}

// Paginacion

const personajesPagina = 6;

const inicio = ref(0);

const fin = ref(personajesPagina);

const tamanoPost = computed(() => personajes.value.length)

//metodos

const next = () =>{
    if (fin.value > personajes.value.length) {

    } else {
        inicio.value = inicio.value + personajesPagina  
        fin.value = fin.value + personajesPagina
    }
}
const previous = () => {
  if (inicio.value > 0) {
    inicio.value = inicio.value - personajesPagina
    fin.value = fin.value - personajesPagina
  } else {

  }


}


const getData = async () => {
    try {
        const response = await axios('https://rickandmortyapi.com/api/character/')
        personajes.value = response.data.results
    } catch (error) {
        console.log('Ha ocurrido un error con el fetch a la Aapi')
    }
}
getData()



</script>
<template>

    <h2>Mi Personaje Favorito: {{ favorito }}</h2>
    <div class="btn-group" role="group" aria-label="Basic example">
        <button 
        type="button" 
        class="btn btn-outline-primary" 
        @click="previous"
        :disabled="inicio === 0"
        
        >
        Anterior {{ inicio }}
        </button>
        
        <button 
        type="button" 
        class="btn btn-outline-primary" 
        @click="next"
        :disabled="fin >= tamanio"
        >
        Siguiente {{ fin }}
        </button>
    </div>
    <div class="d-flex">
        <CardPersonaje v-for="personaje in personajes.slice(inicio, fin)" 
    :nombre="personaje.name" 
    :especie="personaje.species"
    :imagen="personaje.image" 
    @cambiarTituloFavorito="cambiarFavorito"
    />
    </div>


</template>
<style scoped>
.contenedor-cards{
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
}
</style>
