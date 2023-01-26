<script setup>
import List from "../components/List.vue";
import { ref, onBeforeMount } from "vue";
import Employed from "../services/EmployeeApi.js";
import HeadPage from "../components/HeadPage.vue";
import FootPage from "../components/FootPage.vue";

let serviceApi = new Employed([]);

serviceApi.fetchEmployed;
let employeds = ref([]);

onBeforeMount(async () => {
  employeds.value = await serviceApi.fetchEmployed();

  console.log(employeds.value);
});
</script>

<template>
  <HeadPage />
  <ul class="wrapper">
    <li  v-for="employed in employeds" :key="employed">
      <List :employed="employed" />
      <button><i class="fa-solid fa-xmark"></i></button>
      <button><i class="fa-solid fa-pen"></i></button>
      <input id="list_element" type="text" readonly />
    </li>
  </ul>
  <FootPage />
</template>
<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;

.wrapper{
    height: 100vh;
    background: url("@/assets/img/fondo.png");
    background-size: cover;

    
}
li{
    background-color: aquamarine;
    display: flex;
    justify-content: center;
    
}
</style>
