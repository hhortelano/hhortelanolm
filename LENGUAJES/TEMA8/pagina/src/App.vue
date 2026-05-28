<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import axios from 'axios';





</script>

<template>
  <div class="container text-center ">
    <h1>Esta es mi pagina de VUE</h1>
    <nav>
      <RouterLink to="/">Home</RouterLink>
      <RouterLink to="/cards">Cards</RouterLink>
      <RouterLink to="/personaje">Contador</RouterLink>
    </nav>
  </div>

 <RouterView/>
</template>

<style scoped></style>
