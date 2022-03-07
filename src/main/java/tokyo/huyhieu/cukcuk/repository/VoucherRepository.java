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

import tokyo.huyhieu.cukcuk.model.Voucher;
import tokyo.huyhieu.cukcuk.utils.ConnectionUtils;

/**
 *
 * @author huyhi
 */
public class VoucherRepository {

    public static List<Voucher> findAll() {
        List<Voucher> VoucherList = new ArrayList<>();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Vouchers";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voucher Voucher = new Voucher(rs.getLong("ID"), rs.getString("VOUCHERNAME"), rs.getString("DATESTART"),
                        rs.getString("DATEEND"), rs.getBoolean("STATUS"));
                VoucherList.add(Voucher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return VoucherList;
    }

    public static Voucher findById(long id) {
        Voucher Voucher = new Voucher();
        Statement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement = connection.createStatement();
            String sql = "SELECT * FROM Vouchers WHERE ID=" + id + "";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Voucher = new Voucher(rs.getLong("ID"), rs.getString("VOUCHERNAME"), rs.getString("DATESTART"),
                        rs.getString("DATEEND"), rs.getBoolean("STATUS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return Voucher;
    }

    public static void insert(Voucher Voucher) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            try {
                connection = ConnectionUtils.getMyConnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sql = "INSERT INTO Vouchers (VOUCHERNAME, DATESTART, DATEEND, STATUS) VALUES (?, ?, ?, ?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, Voucher.getVoucherName());
            statement.setString(2, Voucher.getDateStart());
            statement.setString(3, Voucher.getDateEnd());
            statement.setBoolean(4, Voucher.isStatus());
            System.out.println("Insert successfully !!");
            JOptionPane.showMessageDialog(null, "Insert successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void edit(Voucher Voucher, long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "UPDATE Vouchers SET VOUCHERNAME=? DAYSTART=?, DAYEND=? WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            statement.setString(1, Voucher.getVoucherName());
            statement.setString(2, Voucher.getDateStart());
            statement.setString(3, Voucher.getDateEnd());
            System.out.println("Edit successfully !!");
            JOptionPane.showMessageDialog(null, "Edit successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void remove(long id) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = ConnectionUtils.getMyConnection();
            String sql = "DELETE FROM Vouchers WHERE ID=" + id + "";
            statement = connection.prepareCall(sql);
            System.out.println("Delete successfully !!");
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VoucherRepository.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
