package api.payloads;

public class EmployedPayload {
    private Long id;
    private String name;
    private String surname;
    private String typeRequest;
    private String descripcion;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getTypeRequest() {
        return typeRequest;
    }
    public void setTypeRequest(String typeRequest) {
        this.typeRequest = typeRequest;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
