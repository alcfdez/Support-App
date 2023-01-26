<script setup>
const props = defineProps({
  employed: {
    type: Object,
  },
});
</script>

<template>
  <div class="request">
    <p class="request__id">{{ employed.id }}</p>
    <div>
      <p class="request__name">{{ employed.name }}</p>
      <p class="request_surname">{{ employed.surname }}</p>
      <p class="request_typeRequest">{{ employed.typeRequest }}</p>
      <p class="request_descripcion">{{ employed.descripcion }}</p>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;
.request {
  @include m.flex(flex, column, nowrap, center, center);
  width: 100%;
  
}



</style>
