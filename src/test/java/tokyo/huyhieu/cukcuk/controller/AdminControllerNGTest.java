/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import javax.swing.JPanel;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author huyhi
 */
public class AdminControllerNGTest {
    
    public AdminControllerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testListener() {
        System.out.println("listener");
        AdminController instance = null;
        instance.listener();
    }

    @Test
    public void testBtnDashBoard() {
        System.out.println("btnDashBoard");
        AdminController instance = null;
        instance.btnDashBoard();
    }

    @Test
    public void testBtnProduct() {
        System.out.println("btnProduct");
        AdminController instance = null;
        instance.btnProduct();
    }

    @Test
    public void testBtnCategory() {
        System.out.println("btnCategory");
        AdminController instance = null;
        instance.btnCategory();
    }

    @Test
    public void testBtnWareHouse() {
        System.out.println("btnWareHouse");
        AdminController instance = null;
        instance.btnWareHouse();
    }

    @Test
    public void testBtnVoucher() {
        System.out.println("btnVoucher");
        AdminController instance = null;
        instance.btnVoucher();
    }

    @Test
    public void testBtnSupplier() {
        System.out.println("btnSupplier");
        AdminController instance = null;
        instance.btnSupplier();
    }

    @Test
    public void testBtnStaff() {
        System.out.println("btnStaff");
        AdminController instance = null;
        instance.btnStaff();
    }

    @Test
    public void testBtnImport() {
        System.out.println("btnImport");
        AdminController instance = null;
        instance.btnImport();
    }

    @Test
    public void testBtnExport() {
        System.out.println("btnExport");
        AdminController instance = null;
        instance.btnExport();
    }

    @Test
    public void testSwitchPanel() {
        System.out.println("switchPanel");
        JPanel panel = null;
        AdminController instance = null;
        instance.switchPanel(panel);
    }

    @Test
    public void testLogOut() {
        System.out.println("logOut");
        AdminController instance = null;
        instance.logOut();
    }
    
}
