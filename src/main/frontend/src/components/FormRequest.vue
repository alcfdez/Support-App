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
            <textarea name="name-description" class="__container-forms__label__inputbox__description" cols="30" rows="5"></textarea>
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
    background-color: map-get(c.$colors, "green");
    display: flex;
    justify-content: center;

    
}

.__container-forms {
    width: 30%;
    background-color: map-get(c.$colors, "white");;
    padding: 2em;
    @include m.borderRadius();
    font-weight: bold;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
   

    &__label {
        background-color: map-get(c.$colors, "white");;
       
        
        &__inputbox {
            @include m.borderRadius();
            height: 2em;
            width: 100%;
            padding: 0.5em;
            background-color: map-get(c.$colors, "grey");
            margin-bottom: 1em;
        
            &__description {
                
                background-color:map-get(c.$colors, "green");
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
    width: 80%;
    display: flex;
    justify-content: center;
    color: map-get(c.$colors, "white");
    margin-bottom: 1em;
}
.container__button{
    width: 50%;
    display: flex;
    justify-content: center;
    gap: 1em;
    color: map-get(c.$colors, "white");
    
.button__two{
        border: .1em solid  map-get(c.$colors, "orange");
        @include m.borderRadius();
        padding: 0 1.1em;
        font-size: 1em;
        color:   map-get(c.$colors, "orange");
    }
.button__three{
    border: .1em solid   map-get(c.$colors, "orange");
    @include m.borderRadius();
    padding: .7em;
    font-size: 1em;
    color:   map-get(c.$colors, "orange");
    }


}

</style>
