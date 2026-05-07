<script setup>
  const nombre = "Vue 3"
  const arrayFrutas = ["🍎", "🍌", "🍉", "🍓", "🍒"];
  const descargaFrutas = [
    {
        name: "Manzana",
        price: "1.00€",
        descripcion: "Manzana Golden",
        stock: 0,
    },
    {
        name: "Pera",
        price: "2.00€",
        descripcion: "Pera Conferencia",
        stock: 10,
    },
    {
        name: "Naranja",
        price: "3.00€",
        descripcion: "Naranja de Valencia",
        stock: 20,
    },
  ]
  const fruta = {
    name: "Fresa",
    price: "4.00€",
    descripcion: "Cosa"
  }
</script>

<template>
  <h1>Hola {{ nombre }}</h1>
  <hr>
  <h3>Directiva v-for</h3>
  <p>{{ arrayFrutas }}</p>
  <ul>
    <li v-for="(fruta, index) in arrayFrutas"
    :key="index">
      {{ index }} - {{ fruta }}
    </li>
  </ul>
  <hr>
  <p>Recorremos un array de objetos</p>
  <ul>
    <li v-for="fruta in descargaFrutas" :key="fruta">
      {{ fruta.name }} - {{ fruta.price }} - {{ fruta.descripcion }}
    </li>
  </ul>
  <hr>
  <p>Recorremos un objeto</p>
  <ul>
    <li v-for="(valor, propiedad) in fruta">
      {{ propiedad }} - {{ valor }}
    </li>
  </ul>
  <hr>
  <p>Lista de productos con 10 mas unidades</p>
  
</template>