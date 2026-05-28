<script setup>
import { computed, ref } from 'vue'

    // Metodos
    /*const manejarClick = (mensaje) => {
        console.log(mensaje)
    }
    const manejarClick2 = () => {
        console.log("Hola")
    }
    */
    
    
    const contador = ref(0)
    const aumentar = () => {
        //console.log('incrementar')
        contador.value++
        //console.log(contador)
    }
    const restar = () => {
        contador.value--
    }
    const resetear = () => {
        contador.value = 0
    }

    // Propiedades Computadas
    
    const arrayFavoritos = ref([])
    const favoritos = ()=> {
        
        arrayFavoritos.value.push ( contador.value)
    }
</script>


<template>
    <div class="container">
        <div class="text-center">
                <!--<button v-on:click="manejarClick('Mensaje como paramatro')">Click Aqui</button>
            <button @click="manejarClick">Click Aqui</button>-->
            <hr>
            <h1>Contador</h1>
            <h1 v-bind:class="claseContador" >{{ contador }}</h1>
            <button @click="aumentar" class="btn btn-success">Aumentar</button>
            <button @click="restar" class="btn btn-danger">Resta</button>
            <button @click="resetear" class="btn btn-primary">Resetear</button>
            <button @click="favoritos" class="btn btn-info">Favorito </button>
            <ul>
                <li v-for="f in arrayFavoritos">
                    {{  f }}
                </li>
            </ul>
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