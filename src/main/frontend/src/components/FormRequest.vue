<script setup></script>

<template>
    <main>
        <div class="__container-title">
            <h2>Fill Form Request</h2>
        </div>

        <form class="__container-forms">
            <label class="__container-forms__label" for="firstname">First name:</label><br />
            <input type="text" class="__container-forms__label__inputbox" name="firstname" /><br />

            <label class="__container-forms__label" for="surname">Surname:</label><br />
            <input type="text" class="__container-forms__label__inputbox" name="surname" /><br />

            <label class="__container-forms__label" for="date">Data of Request:</label><br />
            <input type="date" class="__container-forms__label__inputbox" name="date" /><br />

            <label class="__container-forms__label" for="type">Type of Request:</label><br />
            <select type="text" class="__container-forms__label__inputbox" name="typerequest">
                <option class= "features" ></option>
                <option class= "features" >Material Request</option>
                <option class= "features" >Repair Request</option>
                <option class= "features" >TI Service Request</option>
                <option class= "features" >SAC</option>
            </select><br />

            <label class="__container-forms__label" for="type">Description of your Request:</label><br />
            <input type="text" class="__container-forms__label__inputbox__description" name="description" /><br />

                <button class="button__one" type="button">
                    Submit</button><br />
                <div class="container__button">
                    <button class="button__two" type="button">
                        Reset</button><br />
                    <button class="button__three" type="button">
                        Cancel
                    </button>
                </div>
        </form>
        
    </main>
</template>

<style lang="scss" scoped>
main {
    width: 100%;
    height: 100%;
    background-color: rgb(204, 199, 199);
    
}

.__container-title {
    background-color: orangered;
    margin: 3em 27.8em 0.5em;
    width: 15em;
    height: 3em;
    border-radius: 0.5em;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 1.2em;
    font-weight: bold;
    color: white;
}

.__container-forms {
    width: 30%;
    margin: 1em 30em 5em;
    background-color: white;
    padding: 2em;
    border-radius: 1em;
    font-weight: bold;

    &__label {
        background-color: white;
        margin-left: 1em;

        &__inputbox {
            border-radius: 1em;
            height: 2em;
            width: 20em;
            padding: 0.5em;
            background-color: rgb(160, 158, 158);
            margin-left: .7em;
        
            &__description {
                height: 10em;
                width: 20.1em;
                background-color:rgb(160, 158, 158);
                border-radius: 1em;
                margin-left: .7em;
            }
        }
    }

 
    }
.button__one{
    background-color: orangered;
    border-radius: 1em;
    padding: 0.7em;
    width: 18em;
    display: flex;
    justify-content: center;
    margin-left: 1.6em;
    color: white;
}
.container__button{
    width: 50%;
    display: flex;
    justify-content: center;
    margin-left: 5.2em;
    gap: 1em;
    color: white;
    
.button__two{
        border: .1em solid orangered;
        border-radius: 1em;
        padding: 0 1.1em;
        font-size: 1em;
        color: orangered;
    }
.button__three{
    border: .1em solid orangered;
        border-radius: 1em;
        padding: .7em;
        font-size: 1em;
        color: orangered;
    }


}

</style>
