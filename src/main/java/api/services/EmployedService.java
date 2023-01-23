package api.services;

import java.io.BufferedReader;
import java.sql.ResultSet;
import java.util.List;

import com.google.gson.Gson;

import api.contracts.InterfaceEmployedRepository;
import api.contracts.InterfaceService;
import api.models.Employed;
import api.payloads.EmployedPayload;

// En el servicio podemos tener el metdo get, post, delte etc.. 
// La responsabilidad de pedir al modelo los datos es del SERVICIO NO DEL CONTROLADOR

public class EmployedService implements InterfaceService {
    
    private Employed employed;
    private Gson gson; // Lo declaramos para poder usarlo
    private InterfaceEmployedRepository repository;

    public EmployedService(InterfaceEmployedRepository repository) {
        this.employed = new Employed(); // Lo hacemos desde constructor para tener acceso de todods los metodos a un trabajador
        this.gson = new Gson();
        this.repository = repository;
    }
    
    public  List<Object> index() { 
        return employed.index(repository.getAll());
    }

    @Override
    public Object store(BufferedReader body) {
        // Implementamos el metodo que creamos en el servicio para cumplir con el contrato y devolver el empleado añadido en la base de datos
        try {
            EmployedPayload employedPayload =  gson.fromJson(body, EmployedPayload.class); // Convertimos a formato json lo que nos mando el controlador y se lo devolvemos
            ResultSet rs = repository.save(employedPayload);// Debemos llevar al modelo para insetarlo en la base de datos

            while( rs.next()){
                employed.setId(rs.getLong("id"));
                employed.setName(rs.getString("nameEmployed"));
            }

            return employed;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
            }
    }
}
