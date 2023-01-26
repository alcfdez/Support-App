<script setup></script>

<template>
    <main>
       
        <form class="__container-forms">
            <label class="__container-forms__label" for="firstname">First name:</label>
            <input type="text" class="__container-forms__label__inputbox" name="firstname" />

            <label class="__container-forms__label" for="surname">Surname:</label>
            <input type="text" class="__container-forms__label__inputbox" name="surname" />

            <label class="__container-forms__label" for="date">Data of Request:</label>
            <input type="date" class="__container-forms__label__inputbox" name="date" />

            <label class="__container-forms__label" for="type">Type of Request:</label>
            <select type="text" class="__container-forms__label__inputbox" name="typerequest">
                <option class= "features" selected disabled >Put the type of Request</option>
                <option class= "features" >Material Request</option>
                <option class= "features" >Repair Request</option>
                <option class= "features" >TI Service Request</option>
                <option class= "features" >SAC</option>
            </select>

            <label class="__container-forms__label" for="type">Description of your Request:</label>
            <textarea name="name-description" class="__container-forms__label__inputbox__description" cols="33" rows="5"></textarea>
                <button class="button__one" type="button">
                    Submit</button>
                <div class="container__button">
                    <button class="button__two" type="button">
                        Reset</button>
                    <button class="button__three" type="button">
                        Cancel
                    </button>
                </div>
        </form>
        
    </main>
</template>

<style lang="scss" scoped>

@use "@/scss/mixins.scss" as m;
@use "@/scss/colors.scss" as c;


main {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    background: url("@/assets/img/fondo.png");
    background-size: cover;
    
    
}

.__container-forms {
    width: 30%;
    background-color: map-get(c.$colors, "white");
    padding: 2em;
    @include m.borderRadius();
    font-weight: bold;
    display: flex;;
    flex-direction: column;
    align-items: flex-start;
    margin-top: 20px;
    margin-bottom: 20px;
   

    &__label {
        background-color: map-get(c.$colors, "white");;
       
        
        &__inputbox {
            @include m.borderRadius();
            width: 100%;
            padding: 0.5em;
            background-color: map-get(c.$colors, "grey");
            margin-bottom: 1em;
            
        
            &__description {
                    background-color:map-get(c.$colors, "grey");
                    @include m.borderRadius();
                    margin-bottom: 1em;
                }
        }
    }

 
    }
.button__one{
    background-color: map-get(c.$colors, "orange");;
    @include m.borderRadius();
    padding: 0.7em;
    width: 100%;
    display: flex;
    justify-content: center;
    color: map-get(c.$colors, "white");
    margin-bottom: 1em;
    border:2px solid map-get(c.$colors, "orange");
    
    cursor: pointer;
    &:hover{ 
            background-color: map-get(c.$colors, "white");
            color: map-get(c.$colors, "orange");
            border:2px solid map-get(c.$colors, "orange");
    }
}
.container__button{
    width: 100%;
    display: flex;
    justify-content: center;
    gap: 1em;
    color: map-get(c.$colors, "white");
    cursor: pointer;
    margin: 0 auto;
    
.button__two,
.button__three{
        border: .1em solid  map-get(c.$colors, "orange");
        @include m.borderRadius();
        padding:  .7em;
        font-size: 1em;
        color:   map-get(c.$colors, "orange");
        cursor: pointer;
        width: 47%;
        &:hover{ 
            background-color: map-get(c.$colors, "orange");
            color: map-get(c.$colors, "white");
        }

    }


}

</style>
