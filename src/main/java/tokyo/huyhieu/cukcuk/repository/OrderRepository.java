/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokyo.huyhieu.cukcuk.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tokyo.huyhieu.cukcuk.model.Order;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class OrderRepository {
     public static List<Order> findAll() {
        List<Order> OrderList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Orders";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Order Order = new Order(rs.getLong("ID"), rs.getDouble("TOTALMONEY"), rs.getLong("IDVOUCHER"), rs.getLong("IDUSER"), 
                rs.getString("DATEORDER"), rs.getBoolean("STATUSORDER"));
                OrderList.add(Order);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return OrderList;
    }

    public static Order findById(long id) {
        Order Order = new Order();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Orders WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Order = new Order(rs.getLong("ID"), rs.getDouble("TOTALMONEY"), rs.getLong("IDVOUCHER"), rs.getLong("IDUSER"), 
                rs.getString("DATEORDER"), rs.getBoolean("STATUSORDER"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Order;
    }

    public static Order insert(Order Order) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO Orders (TOTALMONEY, IDUSER, DATEORDER, STATUSORDER) VALUES (?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setDouble(1, Order.getTotalMoney());
            statement.setLong(2, Order.getIdUser());
            statement.setString(3, Order.getDate());
            statement.setBoolean(4, Order.isStatus());
            System.out.println("Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Order;
    }

    public static void edit(Order Order, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE Orders SET TOTALMONEY=?, IDVOUCHER=? , IDUSER=?, DATEORDER=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setDouble(1, Order.getTotalMoney());
            statement.setLong(2, Order.getIdVoucher());
            statement.setLong(3, Order.getIdUser());
            statement.setString(4, Order.getDate());
            System.out.println("Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void editStatus(Order Order, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE Orders SET STATUSORDER=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setBoolean(1, Order.isStatus());
            System.out.println("Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM Orders WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
