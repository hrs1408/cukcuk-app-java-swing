package tokyo.huyhieu.cukcuk.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

public class UserRepository {
    public static List<User> findAll() {
        List<User> accountList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                User account = new User();
                long id = rs.getInt(1);
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                boolean role = rs.getBoolean(4);
                account.setId(id);
                account.setUserName(userName);
                account.setPassword(passWord);
                account.setRole(role);
                accountList.add(account);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return accountList;
    }
}
