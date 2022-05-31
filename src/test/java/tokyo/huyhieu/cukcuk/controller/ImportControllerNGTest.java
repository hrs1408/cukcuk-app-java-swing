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
public class ImportControllerNGTest {
    
    public ImportControllerNGTest() {
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
        ImportController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show");
        ImportController instance = null;
        instance.show();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShowDetail() {
        System.out.println("showDetail");
        ImportController instance = null;
        instance.showDetail();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnAdd() {
        System.out.println("btnAdd");
        ImportController instance = null;
        instance.btnAdd();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnEdit() {
        System.out.println("btnEdit");
        ImportController instance = null;
        instance.btnEdit();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnDelete() {
        System.out.println("btnDelete");
        ImportController instance = null;
        instance.btnDelete();
        fail("The test case is a prototype.");
    }
    
}
