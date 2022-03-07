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

import tokyo.huyhieu.cukcuk.model.Material;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class MaterialRepository {
     public static List<Material> findAll()  {
        List<Material> MaterialList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Materials";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Material Material = new Material(rs.getLong("ID"), rs.getString("MATERIALNAME"),
                        rs.getDouble("PRICE"));
                MaterialList.add(Material);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return MaterialList;
    }

    
    public static Material findById(long id) {
        Material Material = new Material();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Materials WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Material = new Material(rs.getLong("ID"), rs.getString("MATERIALNAME"),
                        rs.getDouble("PRICE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Material;
    }

    public static Material findByName(String name) {
        Material Material = new Material();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM MATERIALS WHERE MATERIALNAME="+"N'"+ name +"'"+ "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Material = new Material(rs.getLong("ID"), rs.getString("MATERIALNAME"),
                        rs.getDouble("PRICE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Material;
    }

    public static void insert(Material Material) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO Materials (MATERIALNAME, PRICE) VALUES (?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, Material.getName());
            statement.setDouble(2, Material.getPrice());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(Material Material, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE Materials SET MATERIALNAME=?, PRICE=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setString(1, Material.getName());
            statement.setDouble(2, Material.getPrice());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM Materials WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MaterialRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
