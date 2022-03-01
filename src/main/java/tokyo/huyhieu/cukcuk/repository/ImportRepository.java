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
import tokyo.huyhieu.cukcuk.model.Import;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class ImportRepository {
     public static List<Import> findAll() {
        List<Import> ImportList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Import";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Import Import = new Import(rs.getLong("ID"), rs.getLong("IDMATERIAL"), rs.getLong("IDSUPPLIER"), rs.getLong("IDUSER"), 
                rs.getLong("QUANTITY"), rs.getDouble("TOTALPRICE"));
                ImportList.add(Import);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ImportList;
    }

    public static Import findById(long id) {
        Import Import = new Import();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Import WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Import = new Import(rs.getLong("ID"), rs.getLong("IDMATERIAL"), rs.getLong("IDSUPPLIER"), rs.getLong("IDUSER"), 
                rs.getLong("QUANTITY"), rs.getDouble("TOTALPRICE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Import;
    }

    public static void insert(Import Import) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO Import (IDMATERIAL, IDSUPPLIER, IDUSER, QUANTITY, TOTALPRICE) VALUES (?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setLong(1, Import.getIdMaterial());
            statement.setLong(2, Import.getIdSupplier());
            statement.setLong(3, Import.getIdUser());
            statement.setLong(4, Import.getQuantity());
            statement.setDouble(5, Import.getTotalPrice());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(Import Import, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE Import SET IDMATERIAL=?, IDSUPPLIER=?, IDUSER=?, QUANTITY=?, TOTALPRICE=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setLong(1, Import.getIdMaterial());
            statement.setLong(2, Import.getIdSupplier());
            statement.setLong(3, Import.getIdUser());
            statement.setLong(4, Import.getQuantity());
            statement.setDouble(5, Import.getTotalPrice());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM Import WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ImportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
