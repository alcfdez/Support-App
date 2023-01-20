class Employees {
   #url

 async fetchAll(){
    try {
        const url = 'https://jsonplaceholder.typicode.com/todos/1';
        const resp = await fetch(url);
        const jsonData = await resp.json();
        let Employees = [];
        for (const employee of json.userId){
          Employees.push(employee);
          return Employees;
        }
        
        
    } catch (error) {
        console.log(error);
        
    }
}



}