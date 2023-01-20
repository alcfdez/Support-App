package api.repositories.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnexion {
    public Connection conn; // Un atributo publico que me da la conexión
    private String driver = "com.mysql.cj.jdbc.Driver"; // Un driver para conectarnos a nuesta database, lo busca solo desde el connector

    private String url = "jdbc:mysql://127.0.0.1:80/requests?/" + 
        "useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        public MysqlConnexion(){
            if(conn == null) {
                this.getConnection();
            }
        }

        private void getConnection(){
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url, "root", "EnolDev131313.");
            }catch( Exception ex){
                System.out.println("Exception" + ex.getMessage());
            }
        }
}
