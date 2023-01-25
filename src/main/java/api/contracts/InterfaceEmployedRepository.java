package api.contracts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import api.payloads.EmployedPayload;

public interface InterfaceEmployedRepository {
    
    public ResultSet getAll();
    public ResultSet save(EmployedPayload people) throws SQLException;
    public ResultSet update(EmployedPayload people) throws SQLException;
    public List<Object> delete(int id) throws SQLException;

}
