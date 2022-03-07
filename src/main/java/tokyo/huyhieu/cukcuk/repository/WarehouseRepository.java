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

import tokyo.huyhieu.cukcuk.model.Warehouse;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huyhi
 */
public class WarehouseRepository {
      public static List<Warehouse> findAll()  {
        List<Warehouse> WarehouseList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM WAREHOUSE";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Warehouse Warehouse = new Warehouse(rs.getLong("IDMATERIAL"), rs.getLong("QUANTITY"));
                WarehouseList.add(Warehouse);
            }
        } catch (SQLException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return WarehouseList;
    }

    
    public static Warehouse findById(long id) {
        Warehouse Warehouse = new Warehouse();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM WAREHOUSE WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Warehouse = new Warehouse(rs.getLong("IDMATERIAL"), rs.getLong("QUANTITY"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Warehouse;
    }

    public static void insert(Warehouse Warehouse) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO WAREHOUSE (IDMATERIAL, QUANTITY) VALUES (?, ?)";
            statement = connection.prepareCall(sql);
            statement.setLong(1, Warehouse.getIdMaterial());
            statement.setLong(2, Warehouse.getQuantity());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(Warehouse Warehouse, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE WAREHOUSE SET IDMATERIAL=?, QUANTITY=? WHERE IDIDMATERIAL=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setLong(1, Warehouse.getIdMaterial());
            statement.setLong(2, Warehouse.getQuantity());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM WAREHOUSE WHERE IDMATERIAL=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(WarehouseRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
