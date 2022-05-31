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
public class MaterialNGTest {

    public MaterialNGTest() {
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
    public void testGetId() {
        System.out.println("getId");
        Material instance = new Material();
        Long expResult = Long.MIN_VALUE;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.MIN_VALUE;
        Material instance = new Material();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Material Test";
        Material instance = new Material();
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Material Test";
        Material instance = new Material();
        instance.setName(name);
        assertEquals(name, instance.getName());

    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Material instance = new Material();
        Double expResult = 1000.5;
        instance.setPrice(expResult);
        Double result = instance.getPrice();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double price = 1000.5;
        Material instance = new Material();
        instance.setPrice(price);
        assertEquals(price, instance.getPrice());
    }

}
