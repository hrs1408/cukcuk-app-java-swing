package tokyo.huyhieu.cukcuk.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
        System.out.println("Success connect DB");
        return SQLServerConnUtils_JDBC.getSQLServerConnection();
    }   
}
