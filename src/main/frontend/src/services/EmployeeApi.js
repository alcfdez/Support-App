class Employed {
  #url;

  async fetchEmployed() {
    try {
      const url = "http://localhost:8080/support-app/api/employed";
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
