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

/**
 *
 * @author huyhi
 */
public class WarehouseControllerNGTest {
    
    public WarehouseControllerNGTest() {
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
        WarehouseController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show");
        WarehouseController instance = null;
        instance.show();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnAdd() {
        System.out.println("btnAdd");
        WarehouseController instance = null;
        instance.btnAdd();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnEdit() {
        System.out.println("btnEdit");
        WarehouseController instance = null;
        instance.btnEdit();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnRemove() {
        System.out.println("btnRemove");
        WarehouseController instance = null;
        instance.btnRemove();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectedRow() {
        System.out.println("selectedRow");
        WarehouseController instance = null;
        instance.selectedRow();
        fail("The test case is a prototype.");
    }
    
}
