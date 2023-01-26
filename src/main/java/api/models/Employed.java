package api.models;

// import java.sql.PreparedStatement;
import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// import api.payloads.EmployedPayload;
// import api.repositories.mysql.MysqlConnexion;

public class Employed {
    private Long id;
    private String name;
    private String surname;
    private String typeRequest;
    private String descripcion;

    public Employed() {
        this.name = name;
        this.surname = surname;
        this.typeRequest = typeRequest;
        this.descripcion = descripcion;
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

    public List<Object> index(ResultSet rs) { // Este metodo nos devuevle todos los empleados

        try {
            // Statement statement = repository.conn.createStatement(); // Con esta linea y la creaccion de arriba tengo acceso a la conexion
            // String sql = String.format("SELECT * FROM %s", table); // Le mandamos a la base d edatos esta consulta
            // ResultSet rs = statement.executeQuery(sql); // Hacemos una consulta sql, aqui ya tenemos las filas

            List<Object> employeds = new ArrayList<>(); // Creamos una lista de Payloads

            while(rs.next()) { // Un bucle que si hay siguiente elemento haga algo, en este caso nos crea la lista de payloads creada arriba, rellenando todos los parametros necesarios
                // EmployedPayload employed = new EmployedPayload();
                
                Employed employed = new Employed();
                employed.setId(rs.getLong("id"));
                employed.setName(rs.getString("nameEmployed"));
                employed.setSurname(rs.getString("surname"));
                employed.setTypeRequest(rs.getString("typeRequest"));
                employed.setDescripcion(rs.getString("descripcion"));
                employeds.add(employed);
            }

            // System.out.println(employeds);
            return employeds;

        } catch (Exception ex) {
            System.out.println("SQL Exception" + ex.getMessage());
            return null;
        }
    
    }

    // @Override
    // public String toString() {
    //     return "Employed [id=" + id + ", name=" + name + ", surname=" + surname + ", typeRequest=" + typeRequest
    //             + ", descripcion=" + descripcion + ", ]";
    // }

    // public EmployedPayload save(EmployedPayload employed) throws SQLException { // Creamos el metodo que nos guardara lo que recibamos de el controlador 
    //    // IDA
    //     String sql_insert = "INSERT INTO requests (nameEmployed, surname, typeRequest, descripcion) VALUES (?,?,?,?)";
    //     PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
    //     preparedStatement.setString(1, employed.getName());
    //     preparedStatement.setString(2, employed.getSurname());
    //     preparedStatement.setString(3, employed.getTypeRequest());
    //     preparedStatement.setString(4, employed.getDescripcion()); // Esta es la peticion para guardar lo que nos llega a la data base
    //     preparedStatement.executeUpdate(); // Actualizamos
    //     preparedStatement.close(); // Cerramos conexion

    // // VUELTA
    //     Statement statement = repository.conn.createStatement(); // Rescuperamos el ultimo añadido para saber si se creo correctamente
    //     String sql = String.format("Select * FROM %s ORDER BY id DESC LIMIT 1", table);
    //     ResultSet rs= statement.executeQuery(sql);

    //     while( rs.next()) {
    //         employed.setId(rs.getLong("id"));
    //         employed.setName(rs.getString("nameEmployed"));
    //         employed.setSurname(rs.getString("surname"));
    //     }

    //     return employed;
    // }
}
  