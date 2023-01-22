package api.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

// import api.models.Employed;
import api.models.Message;
import api.payloads.EmployedPayload;
import api.services.EmployedService;
import api.views.View;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// EL CONTROLADOR SOLAMENTE MANDA Y DEVUELVE PERO NO PUEDE SABER COMO SE HACEN LAS COSAS

@WebServlet(urlPatterns = "/api/employed")

public class EmployedController extends HttpServlet { // Con este objeto tenemos acceso a muchos metodos para tratar las Api
    
    private EmployedService employedService; // Usamos como atributo para poder acceder a el servicio desde TODA la clase

    public EmployedController() {
        this.employedService = new EmployedService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // Esta clase nos devuelve la respuesta, la peticion y si no nos devueleve un error

        resp.setContentType("application/json;charset=UTF-8"); // Tenemos que definir que tipo sera la respuesta que vamos a recibir.
        
        PrintWriter out = resp.getWriter(); // El objeto que devolveremos en la salida.

        // EmployedService employedService = new EmployedService();  // La responsabilidad de pedir al modelo los datos es del SERVICIO NO DEL CONTROLADOR
        
        // Tenemos que crear un tryCatch para controlar el status de la peticion y controlarla en caso de errores
        try {
            List<EmployedPayload> employeds =  employedService.index(); // Pasamos a la vista la lista de nuestros empleados en payloads
            out.println(View.show(employeds)); // Recibo los empleados y respondemos al cliente
            resp.setStatus(HttpServletResponse.SC_OK); // La respuesta devolverá un status 200 siempre que salga todo bien
            out.close(); // Tenemos que cerrar la comunicacion cuando acabe la conexion
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Si da error devolvemos un bad request por ejemplo
            Message message = new Message(); // Creamos una clase message para poder tener una clase que se ocupe de los mensaje 
            message.setMessage("Error en el traspaso de datos" + e.getMessage()); // Le seteamos el valor de error por que estamos en el catch
            out.println(View.show(message)); // Imprimimos el message llamando a nuestra clase vista con el metodo show que creamos

        }


    }
    
}
