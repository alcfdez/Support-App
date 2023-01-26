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

    <nav class="nav">
      <router-link to="/FormEditView" class="nav__link nav__link-list" href="">Form Edit</router-link>
    </nav>
  <main>
    <ul class="wrapper">
      <li class="wrapper__request" v-for="employed in employeds" :key="employed">
        <button class="wrapper__btn btn-delete">
          <i class="fa-solid fa-xmark"></i>
        </button>
        <button class="wrapper__btn btn-edit">
          <i class="fa-solid fa-pen"></i>
          <!-- <router-link id="link" to="/FormView" class="nav__link nav__link-form" href=""></router-link> -->
        </button>
        <List :employed="employed" />

        <input id="list_element" type="text" readonly />
      </li>
    </ul>
  </main>
  <FootPage />
</template>
<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;

main {
  height: 100vh;
  background: url("@/assets/img/fondo.png");
  background-size: cover;
  @include m.flex(flex, auto, nowrap, center, center);

  .wrapper {
    background-color: map-get(c.$colors, "white");
    @include m.borderRadius();
    @include m.flex(flex, column, nowrap, center, center);
    gap: 1em;
    padding: 1em;
    width: 60%;

    &__request {
      @include m.flex(flex, row, nowrap, space-between, center);
      background-color: map-get(c.$colors, "grey");
      @include m.borderRadius();
      padding: 0.5em;
      width: 80%;
    }
    &__btn {
      background-color: map-get(c.$colors, "white");
      padding: 1em;
      @include m.borderRadius();
      margin: .5em;
      color: map-get(c.$colors, "orange");
      &:hover{
        cursor: pointer;
        opacity: .8;
      }

      
    }
  }
}

.nav__link{
  margin-left: 5em;
}
</style>
