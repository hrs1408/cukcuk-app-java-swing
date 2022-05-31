/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.controller;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tokyo.huyhieu.cukcuk.model.Product;
import tokyo.huyhieu.cukcuk.view.ProductRenderPanel;

/**
 *
 * @author huyhi
 */
public class StaffControllerNGTest {
    
    public StaffControllerNGTest() {
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
        StaffController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowProduct() {
        System.out.println("showProduct");
        StaffController instance = null;
        instance.showProduct();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddProductToOrder() {
        System.out.println("addProductToOrder");
        ProductRenderPanel panelRender = null;
        StaffController instance = null;
        instance.addProductToOrder(panelRender);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckProduct() {
        System.out.println("checkProduct");
        Product prd = null;
        StaffController instance = null;
        instance.checkProduct(prd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnImport() {
        System.out.println("btnImport");
        StaffController instance = null;
        instance.btnImport();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnExport() {
        System.out.println("btnExport");
        StaffController instance = null;
        instance.btnExport();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckOutOrder() {
        System.out.println("checkOutOrder");
        StaffController instance = null;
        instance.checkOutOrder();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSaveOrder() {
        System.out.println("saveOrder");
        StaffController instance = null;
        instance.saveOrder();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckMoney() {
        System.out.println("checkMoney");
        StaffController instance = null;
        instance.checkMoney();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowListOrder() {
        System.out.println("showListOrder");
        StaffController instance = null;
        instance.showListOrder();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCancelOrder() {
        System.out.println("cancelOrder");
        StaffController instance = null;
        instance.cancelOrder();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnVoucher() {
        System.out.println("btnVoucher");
        StaffController instance = null;
        instance.btnVoucher();
        fail("The test case is a prototype.");
    }

    @Test
    public void testLogOut() {
        System.out.println("logOut");
        StaffController instance = null;
        instance.logOut();
        fail("The test case is a prototype.");
    }
    
}
