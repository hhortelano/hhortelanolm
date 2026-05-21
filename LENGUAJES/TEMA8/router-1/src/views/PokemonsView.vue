<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { RouterLink} from 'vue-router'


    const pokemons = ref([]);
    const n_pokemons = ref(0);

    const getPokemons = async () => {
        try {
            const response = await axios.get('https://pokeapi.co/api/v2/pokemon/');
            //console.log(response.data.results);
            pokemons.value = response.data.results
            n_pokemons.value = response.data.count
        } catch (error) {
            console.log('Error al obtener Pokemons: ', error)
        }
    }

    getPokemons();
</script>
<template>
    <h1>Numero de Pokemons: {{ n_pokemons }}</h1>
    <ul>
        <li v-for="poke in pokemons" :key="poke.name">
            <RouterLink :to="`/pokemons/${poke.name}`">
                {{ poke.name }}
            </RouterLink> 
             </li>
    </ul>
</template>