<script setup>

    // defineProps(['title', 'contenido', 'id', 'colorText'])
    const props = defineProps({
        title: String,
        id: String,
        contenido: {
            type: String,
            default: 'Sin descripcion'

        }
    })
    
    
</script>

<template>
    <div class="card">
        <div class="card-body">
            <h4 class="card-title">
                {{title}}
            </h4>
            <p>
                {{ id }} - {{ contenido }}
            </p>
            <button 
                @click="$emit('cambiarTituloFavorito', title)"
                class="btn btn-outline-primary">
                    Mi favorito
            </button>
        </div>
    </div>
</template>