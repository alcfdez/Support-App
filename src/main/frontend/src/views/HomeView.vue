<script setup>
import FootPage from '@/components/FootPage.vue';
import HeadPage from '@/components/HeadPage.vue';
import { onBeforeMount } from '@vue/runtime-core';
</script>

<template>
  <main>
    <HeadPage />
    <nav class="nav">
      <router-link id="link" to="/FormView" class="nav__link nav__link-form" href="">Fill Form Request</router-link>

      <router-link to="/ListView" class="nav__link nav__link-list" href="">List Request</router-link>
        
    </nav>
  </main>
    <FootPage />
</template>

<style lang="scss" scoped>
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;

  main{
    height: 100vh;
    background: url("@/assets/img/fondo.png");
    background-size: cover;

    .nav{
      @include m.flex(flex, column, auto, center, center);
      height: 70%;
      gap:2em;
      font-weight: bold;

      &__link{
        @include m.flex(flex, auto, nowrap, center, center);
        background: map-get(c.$colors, "orange");
        @include m.borderRadius();
        color: map-get(c.$colors, "white");
        font-size: 2em;
        -webkit-box-shadow: 0px 18px 13px 6px rgba(56,51,56,0.59);
        -moz-box-shadow: 0px 18px 13px 6px rgba(56,51,56,0.59);
        box-shadow: 0px 18px 13px 6px rgba(56,51,56,0.59);
          &:hover{
            transition: .4s;
            background: map-get(c.$colors, "white");
            color: map-get(c.$colors, "orange");
    }
        &-form{
          height: 3em;
          width: 20%;
        }

        &-list{
          height: 2em;
          width: 18%;
        }
      }
    }
  }


</style>
