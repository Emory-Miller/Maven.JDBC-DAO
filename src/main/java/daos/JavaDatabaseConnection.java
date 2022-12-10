package daos;

import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JavaDatabaseConnection{
    public static final String dbURL = "jdbc:mysql://localhost:3306/JDBC_CRUD_DAO_LAB";
    public static final String username = "jdbc_dao_lab";
    public static final String password = "jdbcpassword";

    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(dbURL, username, password);

        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }
}
