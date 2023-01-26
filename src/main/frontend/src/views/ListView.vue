<script setup>
import List from '../components/List.vue';
import {ref,onBeforeMount} from 'vue';
import Employed from '../services/EmployeeApi.js';

let serviceApi = new Employed([]);

serviceApi.fetchEmployed;
let employeds = ref([]);

onBeforeMount(async()=>{
  employeds.value = await serviceApi.fetchEmployed();
  
  console.log(employeds.value)
})
</script>

<template>
    <ul>
      <li v-for="employed in employeds">
      <List :employed="employed"/>
      <button><i class="fa-solid fa-xmark"></i></button>
      <button><i class="fa-solid fa-pen"></i></button>
      <input id="list_element" type="text" readonly />
    </li>
  </ul>
</template>

<style scoped>
</style>