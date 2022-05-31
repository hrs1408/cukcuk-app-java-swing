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
import tokyo.huyhieu.cukcuk.model.Supplier;
import tokyo.huyhieu.cukcuk.view.dialog.SupplierDialog;

/**
 *
 * @author huyhi
 */
public class SupplierControllerNGTest {
    
    public SupplierControllerNGTest() {
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
        SupplierController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show");
        SupplierController instance = null;
        instance.show();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_String_SupplierDialog() {
        System.out.println("btnSave");
        String addOrEdit = "";
        SupplierDialog dialog = null;
        SupplierController instance = null;
        instance.btnSave(addOrEdit, dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_3args() {
        System.out.println("btnSave");
        String addOrEdit = "";
        SupplierDialog dialog = null;
        Supplier supplier = null;
        SupplierController instance = null;
        instance.btnSave(addOrEdit, dialog, supplier);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnCancel() {
        System.out.println("btnCancel");
        SupplierDialog dialog = null;
        SupplierController instance = null;
        instance.btnCancel(dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectedRow() {
        System.out.println("selectedRow");
        SupplierController instance = null;
        instance.selectedRow();
        fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        SupplierController instance = null;
        instance.add();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        SupplierController instance = null;
        instance.edit();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        SupplierController instance = null;
        instance.remove();
        fail("The test case is a prototype.");
    }
    
}
