class PayloadsEmployed {
  #name;
  #surname;
  #date;
  #description;
  #typeRequest;

  constructor(name, surname, date, description, typeRequest) {
    this.#name = name;
    this.#surname = surname;
    this.#date = date;
    this.#description = description;
    this.#typeRequest = typeRequest;
  }

  //constructor

  //getters y setters
  get name() {
    return this.#name;
  }

  set name(name) {
    this.#name = name;
  }

  get surname() {
    return this.#surname;
  }

  set surname(surname) {
    this.#surname = surname;
  }

  get description() {
    return this.#description;
  }

  set description(description) {
    this.#description = description;
  }

  get typeRequest() {
    return this.#typeRequest;
  }

  set typeRequest(typeRequest) {
    this.#typeRequest = typeRequest;
  }

  get date(){
    return this.#date;
   }

   set date(date){
     this.#date = date;
   }
}
