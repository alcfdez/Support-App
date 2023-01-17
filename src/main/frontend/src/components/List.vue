<script setup>

</script>

<template>
    <ul>
        <li v-for="(item, index) in items" :key="index">
        <button><i class="fa-solid fa-xmark"></i></button>
        <button><i class="fa-solid fa-pen"></i></button>
        <input id="list_element" type="text" readonly>
        </li>
    </ul>
</template>

<style lang="scss" scoped>
    
</style>