<script setup>
import { ref } from 'vue';
const url = "http://localhost:8080/support-app/api/employed";
const requests = ref([]);
const fetchAll = async () =>{
    try {
        const response = await fetch(url);
        const json = await response.json() ;
        for( const request of json ){
            requests.value.push( request );
            }
        } catch (error) {
            console.log(error)
        }
    }
    console.log(requests)
fetchAll();
</script>

<template>
<ul>
    <li v-for="req in requests" :key="req.id">{{ req.id }}| -{{ req.name }} - {{ req.surname }} - {{ req.typeRequest }} - {{ req.descripcion }}</li>
</ul>
</template>

<style scoped>
</style>