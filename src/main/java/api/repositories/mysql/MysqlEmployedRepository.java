package api.repositories.mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import api.contracts.InterfaceEmployedRepository;
import api.payloads.EmployedPayload;


public class MysqlEmployedRepository implements InterfaceEmployedRepository {

    private MysqlConnexion repository;
    String table = "requests";

    public MysqlEmployedRepository() {
        this.repository = new MysqlConnexion();
    }

    @Override
    public ResultSet getAll() {
        try {
            Statement statement = repository.conn.createStatement();
            String sql = String.format("SELECT * FROM %s", table);
            ResultSet rs = statement.executeQuery(sql);
            return rs;
            
        } catch (Exception ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public ResultSet save(EmployedPayload employed) throws SQLException {
        String sql_insert = "INSERT INTO requests (nameEmployed, surname, typeRequest, descripcion) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
        preparedStatement.setString(1, employed.getName());
        preparedStatement.setString(2, employed.getSurname());
        preparedStatement.setString(3, employed.getTypeRequest());
        preparedStatement.setString(4, employed.getDescripcion()); // Esta es la peticion para guardar lo que nos llega a la data base
        preparedStatement.executeUpdate(); // Actualizamos
        preparedStatement.close(); // Cerramos conexion

    // VUELTA
        Statement statement = repository.conn.createStatement(); // Rescuperamos el ultimo añadido para saber si se creo correctamente
        String sql = String.format("Select * FROM %s ORDER BY id DESC LIMIT 1", table);
        ResultSet rs = statement.executeQuery(sql);

        return rs;
    }
    
}
