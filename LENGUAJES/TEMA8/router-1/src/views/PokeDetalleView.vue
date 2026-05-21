<script setup >

import axios from 'axios';
import { ref } from 'vue';

import { useRoute, useRouter} from 'vue-router';
    
const route= useRoute();
const router= useRouter();
const poke = ref({});
    
const getData= async () => {
    try{
        const response = await axios.get(`https://pokeapi.co/api/v2/pokemon/${route.params.name}`)
        //console.log(response)
        poke.value = response.data
    } catch (error) {
        console.log("Error al obtener info de pokemons: ", error);
    }
}
const back = () => {
    router.back()
}
    getData();
</script>


<template>
    
    <div v-if="poke.name">
        
        <h1>Poke detalle: {{ route.params.name }}</h1>
        <img :src="poke.sprites.front_default" alt="poke.name">
        <button  @click="back">Atras</button>
    </div>
</template>