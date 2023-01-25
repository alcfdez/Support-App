package api.repositories.mysql;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public ResultSet update(EmployedPayload employed) throws SQLException {
        String sql_insert = "UPDATE requests SET nameEmployed = ?, surname = ?, typeRequest = ? , descripcion = ? WHERE id=?";
        PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
        preparedStatement.setString(1, employed.getName());
        preparedStatement.setString(2, employed.getSurname());
        preparedStatement.setString(3, employed.getTypeRequest());
        preparedStatement.setString(4, employed.getDescripcion());
        preparedStatement.setLong(5, employed.getId()); // Esta es la peticion para guardar lo que nos llega a la data base
        preparedStatement.executeUpdate(); // Actualizamos
        preparedStatement.close(); // Cerramos conexion

    // VUELTA
        Statement statement = repository.conn.createStatement(); // Rescuperamos el ultimo añadido para saber si se creo correctamente
        String sql = String.format("Select * FROM %s ORDER BY id DESC LIMIT 1", table);
        ResultSet rs = statement.executeQuery(sql);

        return rs;
    }
    // @Override
    public List<Object> delete(int id) throws SQLException{
        String query = "delete from users where id = ?";
        PreparedStatement preparedStmt = repository.conn.prepareStatement(query);
        preparedStmt.setInt(1, id);
        preparedStmt.executeUpdate(); // Actualizamos
        preparedStmt.close(); // Cerramos conexion
        Statement statement = repository.conn.createStatement(); // Rescuperamos el ultimo añadido para saber si se creo correctamente
        String sql = String.format("Select * FROM %s ORDER BY id DESC LIMIT 1", table);
        ResultSet rs = statement.executeQuery(sql);
        List<Object> ObjectList = new ArrayList<>();
        while(rs.next()){
            EmployedPayload object = new EmployedPayload();
            object.setId(rs.getLong("id"));
            object.setName(rs.getString("nameEmployed"));
            object.setSurname(rs.getString("surname"));
            object.setTypeRequest(rs.getString("typeRequest"));
            object.setDescripcion(rs.getString("descripcion"));
            ObjectList.add(object);
        }
        return ObjectList;
    }

}
