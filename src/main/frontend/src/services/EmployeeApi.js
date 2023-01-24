class Employeds {
  #url;

  async fetchEmployed() {
    try {
      const url = "http://localhost:8080/support-app/api/employed";
      console.log("hola desde consola");
      const resp = await fetch(url);
      const jsonData = await resp.json();
      let employeds = [];
      for (const employed of jsonData) {
        employeds.push(employed);
        return employeds;
      }
  // let employees = jsonData.employees;
  // return employees;

    } catch (error) {
      console.log(error);
    }
  }
}

export default Employeds;
