package tokyo.huyhieu.cukcuk.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_JDBC {
    public SQLServerConnUtils_JDBC() {

    }

    public static Connection getSQLServerConnection() throws SQLException, ClassNotFoundException {
        String hostName = "HARISON\\NSSQKSERVERZ";
        String database = "CUKCUK_DB";
        String userName = "sa";
        String password = "123";
        return getSQLServerConnection(hostName, database, userName, password);
    }

    public static Connection getSQLServerConnection(String hostName, String database, String userName, String password)
            throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" + ";databaseName=" + database;
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
}
