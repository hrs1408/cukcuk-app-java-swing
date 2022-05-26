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
import tokyo.huyhieu.cukcuk.model.OrderDetail;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class OrderDetailRepository {
     public static List<OrderDetail> findAll() {
        List<OrderDetail> OrderDetailList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM OrderDetail";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                OrderDetail OrderDetail = new OrderDetail(rs.getLong("ID"), rs.getLong("IDORDER"), rs.getLong("IDPRODUCT"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
                OrderDetailList.add(OrderDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return OrderDetailList;
    }

    public static List<OrderDetail> findAllByOrder(Long id) {
        List<OrderDetail> OrderDetailList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM OrderDetail WHERE IDORDER=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                OrderDetail OrderDetail = new OrderDetail(rs.getLong("ID"), rs.getLong("IDORDER"), rs.getLong("IDPRODUCT"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
                OrderDetailList.add(OrderDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return OrderDetailList;
    }

    public static OrderDetail findById(long id) {
        OrderDetail OrderDetail = new OrderDetail();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM OrderDetail WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                OrderDetail = new OrderDetail(rs.getLong("ID"), rs.getLong("IDORDER"), rs.getLong("IDPRODUCT"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return OrderDetail;
    }

    public static void insert(OrderDetail OrderDetail) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO OrderDetail (IDORDER, IDPRODUCT, QUANTITY, INTOMONEY) VALUES (?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setLong(1, OrderDetail.getIdOrder());
            statement.setLong(2, OrderDetail.getIdProduct());
            statement.setLong(3, OrderDetail.getQuantity());
            statement.setDouble(4, OrderDetail.getIntoMoney());
            System.out.println("Insert successfully !!");
          
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(OrderDetail OrderDetail, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE OrderDetail SET IDORDER=?, IDPRODUCT=? , QUANTITY=?, INTOMONEY=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setLong(1, OrderDetail.getIdOrder());
            statement.setLong(2, OrderDetail.getIdProduct());
            statement.setLong(3, OrderDetail.getQuantity());
            statement.setDouble(4, OrderDetail.getIntoMoney());
            System.out.println("Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM OrderDetail WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(OrderDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
