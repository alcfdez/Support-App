<script setup>
</script>

<template>
<footer class="footer">
    <div class="footer__container-title">
      <h2 class="footer__title">&copy; Factoria F5</h2>
    </div>
    <div class="footer__container-social-media">
        <a href="https://factoriaf5.org/" target="_blank"><i class="fa-brands fa-linkedin icon-media"></i></a> 
        <a href="https://factoriaf5.org/" target="_blank"><i class="fa-brands fa-github icon-media"></i></a> 
        <a href="https://factoriaf5.org/" target="_blank"><i class="fa-brands fa-twitter icon-media"></i></a> 
    </div>
  </footer>
</template>

<style scoped lang="scss">
@use "@/scss/colors" as c;
@use "@/scss/mixins" as m;


.footer {
	@include m.flex(flex, auto, nowrap, space-around, center);
	background: map-get(c.$colors, "orange");
	padding: 1em;
	width: 100%;

    @include m.mv(600px){
        @include m.flex(flex, column, auto, auto, auto);
        font-size: .5em;
        padding:1em 0;
    }

	.footer__title {
		color: map-get(c.$colors, "white");
		font-size: 1.3em;
	}

	.footer__container-social-media {
	    @include m.flex(flex, auto, nowrap, space-around, center);
        width: 10%;
        @include m.mv(1000px){
           width: 30%;
        }
        @include m.mv(650px){
            width: 40%;
         }
         @include m.mv(590px){
            width: 80%;
         }
		.icon-media {
			font-size: 1.7rem;
			color: map-get(c.$colors, "white");
			cursor: pointer;
			&:hover {
				opacity: 0.5;
			}
		}
	}
}
</style>