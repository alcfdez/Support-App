<script setup>
const props = defineProps({


employed: {
  type:Object,
},

});



  // id: {
  //   type: int,
  // },
  // name: {
  //   type: String,
  // },
  // surname: {
  //   type: String,
  // },
  // date: {
  //   type: Date,
  // },
  // description: {
  //   type: String,
  // },
  // typeRequest: {
  //   type: String,
  // },
</script>

<template>
    <ul>
    <li v-for="employe in employed" :key="employe.id">
      <p>{{ employe.id }}</p>
      <p>{{ employe.name }}</p>
      <p>{{ employe.surname }}</p>
      <p>{{ employe.date }}</p>
      <p>{{ employe.description }}</p>
      <p>{{ employe.typeRequest }}</p>

      <p>HOLA</p>
      <button><i class="fa-solid fa-xmark"></i></button>
      <button><i class="fa-solid fa-pen"></i></button>
      <input id="list_element" type="text" readonly />
    </li>
  </ul>
  
  
  
  <!-- <ul> -->
    <!-- <li>
      <p>nombre y apellidos tiriti</p>
      <p>10/10/1000</p>
      <p>tipo de solicitud lorena ipsum</p>
      <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Perspiciatis,
        nesciunt. Pariatur deserunt sed atque incidunt ducimus laudantium enim
        doloremque earum, ab repellat molestiae temporibus aliquid est velit
        voluptate? Architecto, facere. Nobis odit delectus fugit ipsum
        repudiandae dolores quasi? Minus tempore, suscipit laborum voluptates
        perferendis hic. Distinctio rem aperiam molestiae dolorem.
      </p> -->
    <!-- <button><i class="fa-solid fa-xmark"></i></button>
    <button><i class="fa-solid fa-pen"></i></button>
    <input id="list_element" type="text" readonly />
    </li> -->
  <!-- </ul> -->
</template>

<style lang="scss" scoped>
ul {
  display: flex;
  flex-direction: row;
}
</style>
