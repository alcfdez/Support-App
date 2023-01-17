<script setup>

</script>

<template>
    <main>

        <form class="__container-forms">
                <label class="__container-forms-firstname" for="firstname" >First name:</label><br>
                <input type="text" id="__container-forms-firstname" name="firstname" value="first Name"><br>

                <label class=__container-forms-surname for="surname">Surname:</label><br>
                <input type="text" id="__container-forms-surname" name="surname" value="surname"><br>
        
                <label class="__container-forms-date" for="date">Data of Request:</label><br>
                <input type="date" id="__container-forms-date" name="date" value="date of Request"><br>
            
                <label class="__container-forms-typerequest" for="type">Type of Request:</label><br>
                <input type="text" id="__container-forms-typerequest" name="typerequest" value="type of Request"><br>
            </form>

    </main>
</template>


<style lang="scss" scoped>

.__container-forms{
    margin-left: 2em;
    margin-top: 2em;
    background-color: red;
}

</style>