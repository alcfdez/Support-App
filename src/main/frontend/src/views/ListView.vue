<script setup>
import List from '../components/List.vue';
import {ref,onBeforeMount} from 'vue';
import Employed from '../services/EmployeeApi';


let employeds = ref([]);
let serviceApi = new Employed([]);

serviceApi.fetchEmployed;





onBeforeMount(async()=>{
  employeds.value = await serviceApi.fetchEmployed();
 // fetchEmployed();]
  
})





// let employeesId = ref();
// let employeesName = ref();
// let employeesSurname = ref();
// let employeesDate = ref();
// let employeesDescription = ref();
// let employeesTypeRequest = ref();

// onBeforeMount(async () => {
//   const res = await fetch(props.id);
//   const data = await res.json();
//   employees.value = data;
//   employeesId.value = employees.value.id;
//   employeesName.value = employees.value.name;
//   employeesSurname.value = employees.value.surname;
//   employeesDate.value = employees.value.date;
//   employeesDescription.value = employees.value.description;
//   employeesTypeRequest.value = employees.value.typeRequest;
// });


</script>

<template>
    <List/>
  
hola




</template>

<style scoped>
</style>