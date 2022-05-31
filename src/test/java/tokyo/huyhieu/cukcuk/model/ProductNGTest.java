/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.model;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author huyhi
 */
public class ProductNGTest {

    public ProductNGTest() {
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
        Product instance = new Product();
        Long expResult = Long.MIN_VALUE;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.MIN_VALUE;
        Product instance = new Product();
        instance.setId(id);
        assertEquals(id, instance.getId());

    }

    @Test
    public void testGetIdCategory() {
        System.out.println("getIdCategory");
        Product instance = new Product();
        Long expResult = Long.MIN_VALUE;
        instance.setIdCategory(expResult);
        Long result = instance.getIdCategory();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdCategory() {
        System.out.println("setIdCategory");
        Long idCategory = null;
        Product instance = new Product();
        instance.setIdCategory(idCategory);
        assertEquals(idCategory, instance.getIdCategory());
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Product instance = new Product();
        String expResult = "San Pham";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "San Pham";
        Product instance = new Product();
        instance.setName(name);
        assertEquals(name, instance.getName());

    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        Double expResult = 10.50;
        instance.setPrice(expResult);
        Double result = instance.getPrice();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        Double price = 10.50;
        Product instance = new Product();
        instance.setPrice(price);
        assertEquals(price, instance.getPrice());

    }

    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Product instance = new Product();
        String expResult = "C:\\Users\\huyhi\\Pictures\\CODEXR-1-1024x1024.png";
        instance.setImage(expResult);
        String result = instance.getImage();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String image = "C:\\Users\\huyhi\\Pictures\\CODEXR-1-1024x1024.png";
        Product instance = new Product();
        instance.setImage(image);
        assertEquals(image, instance.getImage());

    }

}
