<script setup>
const props = defineProps({
    nombre: String,
    especie: String,
    imagen: String,
})
</script>
<template>
    
    <div class="card" style="width: 18rem;">
        <img :src="imagen" class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">{{ nombre }}</h5>
            <p class="card-text">{{ especie }}</p>
            <button 
                @click="$emit('cambiarTituloFavorito', nombre)"
                class="btn btn-outline-primary">
                    Mi favorito
            </button>
        </div>
    </div>
</template>