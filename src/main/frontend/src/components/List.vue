<script setup>
const props = defineProps({
employed: {
  type:Object,
}
});

</script>

<template>
    <h1>{{ employed.id }}</h1>
    <h2>{{ employed.name }}</h2>
    <h2>{{ employed.posts }}</h2>
</template>

<style lang="scss" scoped>
ul {
  display: flex;
  flex-direction: row;
}
</style>
