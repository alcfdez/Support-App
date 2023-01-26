package api.contracts;
import java.io.BufferedReader;
import java.util.List;

public interface InterfaceService {
    
    public List<Object> index();
    public Object store(BufferedReader body); // Aqui va a llegar el obejto que inserto el usuario y el tipo que es.
    public Object modificated(BufferedReader body);
    public Object deleted(BufferedReader body);

}
