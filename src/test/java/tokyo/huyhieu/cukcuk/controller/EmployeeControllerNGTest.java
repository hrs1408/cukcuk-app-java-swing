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
import tokyo.huyhieu.cukcuk.model.User;
import tokyo.huyhieu.cukcuk.view.dialog.StaffDialog;

/**
 *
 * @author huyhi
 */
public class EmployeeControllerNGTest {
    
    public EmployeeControllerNGTest() {
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
        EmployeeController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show");
        EmployeeController instance = null;
        instance.show();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_String_StaffDialog() {
        System.out.println("btnSave");
        String addOrEdit = "";
        StaffDialog dialog = null;
        EmployeeController instance = null;
        instance.btnSave(addOrEdit, dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_3args() {
        System.out.println("btnSave");
        String addOrEdit = "";
        StaffDialog dialog = null;
        User userE = null;
        EmployeeController instance = null;
        instance.btnSave(addOrEdit, dialog, userE);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnCancel() {
        System.out.println("btnCancel");
        StaffDialog dialog = null;
        EmployeeController instance = null;
        instance.btnCancel(dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testHandleAdd() {
        System.out.println("handleAdd");
        EmployeeController instance = null;
        instance.handleAdd();
        fail("The test case is a prototype.");
    }

    @Test
    public void testHandleEdit() {
        System.out.println("handleEdit");
        EmployeeController instance = null;
        instance.handleEdit();
        fail("The test case is a prototype.");
    }

    @Test
    public void testHandleDelete() {
        System.out.println("handleDelete");
        EmployeeController instance = null;
        instance.handleDelete();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSelectedRow() {
        System.out.println("selectedRow");
        EmployeeController instance = null;
        instance.selectedRow();
        fail("The test case is a prototype.");
    }
    
}
