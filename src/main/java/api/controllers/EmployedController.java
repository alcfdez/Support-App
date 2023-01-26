package api.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import api.contracts.InterfaceEmployedRepository;
import api.contracts.InterfaceService;
// import api.models.Employed;
import api.models.Message;
import api.repositories.mysql.MysqlEmployedRepository;
// import api.payloads.EmployedPayload;
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
    
    private InterfaceService employedService; // Usamos como atributo para poder acceder a el servicio desde TODA la clase

    public EmployedController() {
        InterfaceEmployedRepository db = new MysqlEmployedRepository();
        this.employedService = new EmployedService(db);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // Esta clase nos devuelve la respuesta, la peticion y si no nos devueleve un error

        resp.setContentType("application/json;charset=UTF-8"); // Tenemos que definir que tipo sera la respuesta que vamos a recibir.
        resp.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = resp.getWriter(); // El objeto que devolveremos en la salida.

        // EmployedService employedService = new EmployedService();  // La responsabilidad de pedir al modelo los datos es del SERVICIO NO DEL CONTROLADOR
        
        // Tenemos que crear un tryCatch para controlar el status de la peticion y controlarla en caso de errores
        try {
            List<Object> employeds =  employedService.index(); // Pasamos a la vista la lista de nuestros empleados en payloads
            out.println(View.show(employeds)); // Recibo los empleados y respondemos al cliente
            resp.setStatus(HttpServletResponse.SC_OK); // La respuesta devolverá un status 200 siempre que salga todo bien
            out.close(); // Tenemos que cerrar la comunicacion cuando acabe la conexion
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Si da error devolvemos un bad request por ejemplo
            Message message = new Message(); // Creamos una clase message para poder tener una clase que se ocupe de los mensaje 
            message.setMessage("Error en el traspaso de datos d" + e.getMessage()); // Le seteamos el valor de error por que estamos en el catch
            out.println(View.show(message)); // Imprimimos el message llamando a nuestra clase vista con el metodo show que creamos
        }


    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=utf-8"); // Seteamos de que tipo sera la respuesta
        resp.addHeader("Access-Control-Allow-Origin", "*");
        
        PrintWriter out = resp.getWriter(); // La salida

        try {
            Object employed = employedService.store(req.getReader()); // El controlador llama al servicio para pasarle lo que le ha llegado del body
            out.println(View.show(employed));
            resp.setStatus(HttpServletResponse.SC_CREATED); // Comprobamos que la respuesta se creo correstamente
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error:" + e.getMessage());
        }
    }



    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
        resp.setContentType("application/json;charset=UTF-8"); 
        resp.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = resp.getWriter(); 

        try {
            Object employed = employedService.modificated(req.getReader()); // El controlador llama al servicio para pasarle lo que le ha llegado del body
            out.println(View.show(employed));
            resp.setStatus(HttpServletResponse.SC_OK); // Comprobamos que la respuesta se creo correstamente
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error:" + e.getMessage());
        }

    }
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
        resp.setContentType("application/json;charset=UTF-8"); 
        resp.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = resp.getWriter(); 

        try {
            Object employed = employedService.deleted(req.getReader()); // El controlador llama al servicio para pasarle lo que le ha llegado del body
            out.println(View.show(employed));
            resp.setStatus(HttpServletResponse.SC_OK); // Comprobamos que la respuesta se creo correstamente
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error:" + e.getMessage());
        }

    }
}