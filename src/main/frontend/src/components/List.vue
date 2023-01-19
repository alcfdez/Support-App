<script setup>
import internal from "stream";
import { onBeforeMount, ref } from "vue";

const props = defineProps({
  name: {
    type: String,
  },
  date: {
    type: Number,
  },
  description: {
    type: String,
  },
  request: {
    type: String
  },
});

let employees = ref({});

let employeesName = ref();
let employeesDate = ref();
let employeesDescription = ref();
let employeesRequest = ref();

onBeforeMount(async()=>{
     const res = await fetch(props.name)
     const data = await res.json()
     employees.value = data;
     employeesName.value = employees.value;
     employeesDate.value = employees.value;
     employeesDescription.value = employees.value;
     employeesRequest.value = employees.value;
})







</script>

<template>
<<<<<<< HEAD



  <ul>
    <li v-for="(employee, index) in employees" :key="index">
       <p> {{ employeesName }}</p>
       <p>{{ employeesDate }}</p>
       <p>{{ employeesRequest }}</p>
       <!-- <p>{{ employeesDescription }}</p> -->
       <p>testeo</p>
      <button><i class="fa-solid fa-xmark"></i></button>
      <button><i class="fa-solid fa-pen"></i></button>
      <input id="list_element" type="text" readonly />
    </li>
  </ul>
=======
    <ul>
        <li>
        <p>nombre y apellidos tiriti</p>
        <p>10/10/1000</p>
        <p>tipo de solicitud lorena ipsum</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Perspiciatis, nesciunt. Pariatur deserunt sed atque incidunt ducimus laudantium enim doloremque earum, ab repellat molestiae temporibus aliquid est velit voluptate? Architecto, facere. Nobis odit delectus fugit ipsum repudiandae dolores quasi? Minus tempore, suscipit laborum voluptates perferendis hic. Distinctio rem aperiam molestiae dolorem.</p>
        <button><i class="fa-solid fa-xmark"></i></button>
        <button><i class="fa-solid fa-pen"></i></button>
        <input id="list_element" type="text" readonly>
        </li>
    </ul>
>>>>>>> ca6dbb72a2fa18a4dce2eb8e1366ac5b1c3c589d
</template>

<style lang="scss" scoped></style>
