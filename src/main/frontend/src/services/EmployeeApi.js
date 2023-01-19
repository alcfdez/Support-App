class Employees {
   #url

 async fetchAll(){
    try {
        fetch('https://jsonplaceholder.typicode.com/todos/1')
          .then(response => response.json())
          .then(json => console.log(json))
          let Employees = [];
        
    } catch (error) {
        console.log(error);
        
    }
}



}