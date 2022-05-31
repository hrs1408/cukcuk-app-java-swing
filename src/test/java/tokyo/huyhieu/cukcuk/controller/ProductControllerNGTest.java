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
import tokyo.huyhieu.cukcuk.view.dialog.ProductDialog;

/**
 *
 * @author huyhi
 */
public class ProductControllerNGTest {
    
    public ProductControllerNGTest() {
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
        ProductController instance = null;
        instance.listener();
        fail("The test case is a prototype.");
    }

    @Test
    public void testShow() {
        System.out.println("show");
        ProductController instance = null;
        instance.show();
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_3args() {
        System.out.println("btnSave");
        String addOrEdit = "";
        ProductDialog dialog = null;
        Product prd = null;
        ProductController instance = null;
        instance.btnSave(addOrEdit, dialog, prd);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnSave_String_ProductDialog() {
        System.out.println("btnSave");
        String addOrEdit = "";
        ProductDialog dialog = null;
        ProductController instance = null;
        instance.btnSave(addOrEdit, dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testBtnCancel() {
        System.out.println("btnCancel");
        ProductDialog dialog = null;
        ProductController instance = null;
        instance.btnCancel(dialog);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        ProductController instance = null;
        instance.add();
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        ProductController instance = null;
        instance.edit();
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        ProductController instance = null;
        instance.remove();
        fail("The test case is a prototype.");
    }

    @Test
    public void testReload() {
        System.out.println("reload");
        ProductController instance = null;
        instance.reload();
        fail("The test case is a prototype.");
    }

    @Test
    public void testSearch() {
        System.out.println("search");
        ProductController instance = null;
        instance.search();
        fail("The test case is a prototype.");
    }
    
}
