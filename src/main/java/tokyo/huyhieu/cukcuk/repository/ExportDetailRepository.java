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
import tokyo.huyhieu.cukcuk.model.ExportDetail;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class ExportDetailRepository {
    public static List<ExportDetail> findAll() {
        List<ExportDetail> ExportDetailList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM ExportDetail";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ExportDetail ExportDetail = new ExportDetail(rs.getLong("ID"), rs.getLong("IDEXPORT"),
                        rs.getLong("IDMATERIAL"), rs.getLong("QUANTITY"));
                ExportDetailList.add(ExportDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ExportDetailList;
    }

    public static ExportDetail findById(long id) {
        ExportDetail ExportDetail = new ExportDetail();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM ExportDetail WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ExportDetail = new ExportDetail(rs.getLong("ID"), rs.getLong("IDEXPORT"), rs.getLong("IDMATERIAL"),
                        rs.getLong("QUANTITY"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ExportDetail;
    }

    public static List<ExportDetail> findByExport(long id) {
        List<ExportDetail> ExportDetails = new ArrayList();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM ExportDetail WHERE IDEXPORT=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ExportDetail exportDetail  = new ExportDetail(rs.getLong("ID"), rs.getLong("IDEXPORT"), rs.getLong("IDMATERIAL"),
                        rs.getLong("QUANTITY"));
                ExportDetails.add(exportDetail);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ExportDetails;
    }

    public static void insert(ExportDetail ExportDetail) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO ExportDetail (IDEXPORT, IDMATERIAL, QUANTITY) VALUES (?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setLong(1, ExportDetail.getIdExport());
            statement.setLong(2, ExportDetail.getIdMaterial());
            statement.setLong(3, ExportDetail.getQuantity());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(ExportDetail ExportDetail, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE ExportDetail SET IDEXPORT=?, IDMATERIAL=?, QUANTITY=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setLong(1, ExportDetail.getIdExport());
            statement.setLong(2, ExportDetail.getIdMaterial());
            statement.setLong(3, ExportDetail.getQuantity());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM ExportDetail WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void removeByIdExport(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM ExportDetail WHERE IDEXPORT=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ExportDetailRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
