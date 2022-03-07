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

import tokyo.huyhieu.cukcuk.model.ImportDetail;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class ImportDetailRepository {
     public static List<ImportDetail> findAll() {
        List<ImportDetail> importDetails = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM IMPORTDETAIL";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ImportDetail ImportDetail = new ImportDetail(rs.getLong("ID"), rs.getLong("IDIMPORT"), rs.getLong("IDPRODUCT"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
                importDetails.add(ImportDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return importDetails;
    }

    public static List<ImportDetail> findByImport(long id) {
        List<ImportDetail> importDetails = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM IMPORTDETAIL WHERE IDIMPORT = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ImportDetail ImportDetail = new ImportDetail(rs.getLong("ID"), rs.getLong("IDIMPORT"), rs.getLong("IDMATERIAL"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
                importDetails.add(ImportDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return importDetails;
    }

    public static Double getTotalById(long id) {
         Double total = 0.0;
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM IMPORTDETAIL WHERE IDIMPORT = " + id;
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                total += rs.getDouble("INTOMONEY");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return total;
    }

    public static ImportDetail findById(long id) {
        ImportDetail ImportDetail = new ImportDetail();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM IMPORTDETAIL WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ImportDetail = new ImportDetail(rs.getLong("ID"), rs.getLong("IDIMPORT"), rs.getLong("IDPRODUCT"), rs.getLong("QUANTITY"), rs.getDouble("INTOMONEY"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ImportDetail;
    }

    public static void insert(ImportDetail ImportDetail) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO IMPORTDETAIL (IDIMPORT, IDMATERIAL, QUANTITY, INTOMONEY) VALUES (?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setLong(1, ImportDetail.getIdImport());
            statement.setLong(2, ImportDetail.getIdMaterial());
            statement.setLong(3, ImportDetail.getQuantity());
            statement.setDouble(4, ImportDetail.getIntoMoney());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(ImportDetail ImportDetail, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE IMPORTDETAIL SET IDIMPORT=?, IDMATERIAL=?, QUANTITY=?, INTOMONEY=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setLong(1, ImportDetail.getIdImport());
            statement.setLong(2, ImportDetail.getIdMaterial());
            statement.setLong(3, ImportDetail.getQuantity());
            statement.setDouble(4, ImportDetail.getIntoMoney());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM IMPORTDETAIL WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
