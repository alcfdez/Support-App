package api.contracts;

import java.sql.ResultSet;
import java.sql.SQLException;

import api.payloads.EmployedPayload;

public interface InterfaceEmployedRepository {
    
    public ResultSet getAll();
    public ResultSet save(EmployedPayload people) throws SQLException;

}
