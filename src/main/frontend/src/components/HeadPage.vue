<script setup>

</script>

<template>
    <header class="header">
        <img class="header__logo" src="@/assets/img/logo-factoria.png" alt="logo f5">
    </header>
</template>

<style scoped lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;
    .header{
        @include m.flex(flex, auto, nowrap, center, center);
        height: 9em;
        width: 100%;
        position: relative;
        top: 8%;
        background: map-get(c.$colors, "white");;
        
        &__logo{
            width: 100%;
            height: 100%;
            object-fit: contain;
        }
    }

</style>