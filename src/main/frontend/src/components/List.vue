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
</template>

<style lang="scss" scoped></style>
