package api.services;

import java.util.List;

import api.models.Employed;
// import api.payloads.EmployedPayload;

// En el servicio podemos tener el metdo get, post, delte etc.. 
// La responsabilidad de pedir al modelo los datos es del SERVICIO NO DEL CONTROLADOR

public class EmployedService {
    
    private Employed employed;

    public EmployedService() {
        this.employed = new Employed(); // Lo hacemos desde constructor para tener acceso de todods los metodos a un trabajador
    }
    
    public  List<Object> index() { 
        return employed.index();
    }
    
}
