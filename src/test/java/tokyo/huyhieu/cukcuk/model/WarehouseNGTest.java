/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.model;

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
public class WarehouseNGTest {

    public WarehouseNGTest() {
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
    public void testGetIdMaterial() {
        System.out.println("getIdMaterial");
        Warehouse instance = new Warehouse();
        Long expResult = Long.MAX_VALUE;
        instance.setIdMaterial(expResult);
        Long result = instance.getIdMaterial();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdMaterial() {
        System.out.println("setIdMaterial");
        Long idMaterial = Long.MAX_VALUE;
        Warehouse instance = new Warehouse();
        instance.setIdMaterial(idMaterial);
        assertEquals(idMaterial, instance.getIdMaterial());

    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Warehouse instance = new Warehouse();
        Long expResult = Long.MAX_VALUE;
        instance.setQuantity(expResult);
        Long result = instance.getQuantity();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long quantity = Long.MAX_VALUE;
        Warehouse instance = new Warehouse();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());

    }

}
