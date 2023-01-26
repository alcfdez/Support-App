package api.repositories.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnexion {
    public Connection conn; // Un atributo publico que me da la conexión
    private String driver = "com.mysql.cj.jdbc.Driver"; // Un driver para conectarnos a nuesta database, lo busca solo desde el connector

    private String url = "jdbc:mysql://localhost:8889/java_support_app?" + 
        "useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        public MysqlConnexion(){
            if(conn == null) {
                this.getConnection();
            }
        }

        private void getConnection(){
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url, "root", "");
            }catch( Exception ex){
                System.out.println("Exception" + ex.getMessage());
            }
        }
}
