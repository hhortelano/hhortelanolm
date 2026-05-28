<script setup>

import BlogPost from './componentes/BlogPost.vue';
import BotonContador from './componentes/BotonContador.vue';
import { computed, ref } from 'vue';
import PaginatePost from './componentes/PaginatePost.vue';
import LoadingSpinner from './componentes/LoadingSpinner.vue';

const posts = ref([])

const miFavorito = ref("")

const cambiarFavorito = (titulo) => {
  miFavorito.value = titulo
}

// Paginacion
const postsXPagina = 10;

const inicio = ref(0);

const fin = ref(postsXPagina)



const loading = ref(true)

// Metodos para la paginacion

const next = () => {
  if (fin.value > posts.value.length) {

  } else {
    inicio.value = inicio.value + postsXPagina
    fin.value = fin.value + postsXPagina
  }

}

const previous = () => {
  if (inicio.value > 0) {
    inicio.value = inicio.value - postsXPagina
    fin.value = fin.value - postsXPagina
  } else {

  }


}

// Vamos a usar Fetch para cargar una APi Publica

fetch('https://jsonplaceholder.typicode.com/posts')

  // Lo que nosotros formateamos en json
  .then(response => response.json())

  //.then( data => console.log(data))
  .then(data => posts.value = data)

  .finally(
    setTimeout( () => {
      loading.value = false
    }, 1000)
    )


</script>

<template>
  <div class="container">

    <h1>DAM 1 - 2026</h1>

    <h2>Mi post favorito: {{ miFavorito }}</h2>

    <LoadingSpinner v-if="loading" />
    <div class="container">
      <PaginatePost 
      class="mb-2" 
      @next="next" 
      @previous="previous" 
      :inicio="inicio" 
      :fin="fin" 
      :tamanio="tamanoPost" 
      />
      
      <BlogPost 
      v-for="post in 
      posts.slice(inicio, fin)" 
      :key="post.id" 
      :title="post.title" 
      :contenido="post.contenido"
      :id="post.id" 
      @cambiarTituloFavorito="cambiarFavorito" 
      class="mb-2"
      />
    </div>


  </div>

</template>

<style scoped></style>
