<script setup>
import { computed, ref } from 'vue';
const contador1 = ref(0)
const contador2 = ref(0)


const aumentarL1 = () => {
    contador1.value++
}
const aumentarL2 = () => {
    contador1.value = contador1.value + 2

}
const aumentarL3 = () => {
    contador1.value = contador1.value + 3
}


const aumentarV1 = () => {
    contador2.value++
}
const aumentarV2 = () => {
    contador2.value = contador2.value + 2
}
const aumentarV3 = () => {
    contador2.value = contador2.value + 3
}


const resetear = () => {
    contador1.value = 0
    contador2.value = 0
}

//Marcadores

const resultados = ref([])

const guardar = () => {
    if (contador1.value === 0 && contador2.value === 0) {
        return
    } else {
        resultados.value.push('Resultado final: Local ' + contador1.value + ' - ' + contador2.value + ' Visitante')
    }

    contador1.value = 0
    contador2.value = 0
}
</script>


<template>
    <div class="container text-center mb-5">
        <div class="row mb-5">
            <h1>Marcador de Baloncesto</h1>
        </div>

        <div class="row">
            <div class="col">
                <h2 class="mb-3">Local</h2>
                <h1>{{ contador1 }}</h1>
                <div class="btn-group mt-3" role="group" aria-label="Basic example">
                    <button @click="aumentarL1" type="button" class="btn btn-primary">+1</button>
                    <button @click="aumentarL2" type="button" class="btn btn-primary">+2</button>
                    <button @click="aumentarL3" type="button" class="btn btn-primary">+3</button>
                </div>
            </div>
            <div class="col-6">
                <img src="./4354856.png" class="pt-3" alt="..." width="25%">
            </div>
            <div class="col">
                <h2 class="mb-3">Visitante</h2>
                <h1>{{ contador2 }}</h1>
                <div class="btn-group mt-3" role="group" aria-label="Basic example">
                    <button @click="aumentarV1" type="button" class="btn btn-primary">+1</button>
                    <button @click="aumentarV2" type="button" class="btn btn-primary">+2</button>
                    <button @click="aumentarV3" type="button" class="btn btn-primary">+3</button>
                </div>
            </div>
        </div>
        <div class="row mt- text-center">
            <div class="col"></div>
            <div class="col mt-5">
                <button @click="resetear" type="button" class="btn btn-light me-2 ">Resetear</button>
                <button @click="guardar" :disabled="contador1 === 0 && contador2 === 0" type="button"
                    class="btn btn-primary">Terminar Partido</button>
            </div>
            <div class="col"></div>

        </div>
        <div class="row mt-5 text-start">
            <ul class="list-group">
                <li v-for="resultado in resultados" class="list-group-item">{{resultado}}</li>
            </ul>
        </div>
    </div>

</template>


<style scoped></style>