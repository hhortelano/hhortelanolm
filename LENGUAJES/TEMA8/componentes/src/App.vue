<script setup>
import BlogPost from './componentes/BlogPost.vue';
import BotonContador from './componentes/BotonContador.vue';
import { ref } from 'vue';

const posts = ref([
  {id:1, title: "Post 01", contenido:"Contenido del post 01"},
  {id:2, title: "Post 02", contenido:"Contenido del post 02"},
  {id:3, title: "Post 03", contenido:"Contenido del post 03"},
  {id:4, title: "Post 04"},
  {id:5, title: "Post 03", contenido:"Contenido del post 03"},

])

const miFavorito = ref("")
const cambiarFavorito = (titulo) => {
  miFavorito.value = titulo
}
</script>

<template>
  <div class="container">
    <h1>DAM 1 - 2026</h1>
    
    <h2>Mi post favorito: {{ miFavorito }}</h2>
    <hr>
    <BlogPost 
      v-for="post in posts"
      :key="post.id"
      :title="post.title"
      :contenido="post.contenido"
      :id="post.id"
      @cambiarTituloFavorito="cambiarFavorito"
      class="mb-2"
      />
    
  </div>
  
</template>

<style scoped></style>
