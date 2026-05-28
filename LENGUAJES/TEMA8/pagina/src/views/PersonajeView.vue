<script setup>
import { computed, ref } from 'vue';
const contador = ref(0)

const aumentar = () =>{
    contador.value++
}
const restar = () =>{
    contador.value--
}

const resetear = () =>{
    contador.value = 0
}

const claseContador = computed(() =>{
    if (contador.value === 0) {
        return 'zero'
    }
    return contador.value > 0 ? 'verde' : 'rojo'
})

// Favorito

const favorito = ref(0)
const cambiarfavorito = (contador) =>{
    favorito.value = contador
}


</script>
<template>
    
    <div class="container">
        <h1>Contador</h1>
        <h1 :class="claseContador">{{ contador }}</h1>
        <button @click="aumentar" class="btn btn-success">aumentar</button>
        <button @click="restar" class="btn btn-danger">restar</button>
        <button @click="resetear" class="btn btn-primary">resetear</button>
        <button @click="cambiarfavorito(contador)" class="btn btn-secondary">Favorito</button>
        <h1>Numero Favorito</h1>
        <p>{{ favorito }}</p>
    </div>
</template>

<style scoped>
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