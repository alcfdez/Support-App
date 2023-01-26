class Employed {
  #url;

  async fetchEmployed() {
    try {
      const url = "https://jsonplaceholder.typicode.com/users";
      const resp = await fetch(url);
      const jsonData = await resp.json();
      let employeds = [];
      for (const employed of jsonData) {
        employeds.push(employed);
      }
      return employeds;
    } catch (error) {
      console.log(error);
    }
  }
}

export default Employed;
