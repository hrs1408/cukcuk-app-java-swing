/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.model;

import static org.testng.Assert.*;

/**
 *
 * @author huyhi
 */
public class CategoryNGTest {
    
    public CategoryNGTest() {
    }
    
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }
    
    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Category.
     */
    @org.testng.annotations.Test
    public void testGetId() { //test get id for category
        System.out.println("getId");
        Category instance = new Category();
        instance.setId(Long.valueOf(1));
        Long expResult = Long.valueOf(1);
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    /**
     * Test of setId method, of class Category.
     */
    @org.testng.annotations.Test
    public void testSetId() { // test set id for category
        System.out.println("setId");
        Long id = Long.valueOf(1);
        Category instance = new Category();
        instance.setId(id);
        Long expected = Long.valueOf(1);
        assertEquals(expected, instance.getId());
        
    }

    /**
     * Test of getName method, of class Category.
     */
    @org.testng.annotations.Test
    public void testGetName() { // test set name for category
        System.out.println("getName");
        Category instance = new Category();
        instance.setName("do an nhanh");
        String expResult = "do an nhanh";
        String result = instance.getName();
        assertEquals(result, expResult, "Pass");
    }

    /**
     * Test of setName method, of class Category.
     */
    @org.testng.annotations.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "huyhieu";
        Category instance = new Category();
        instance.setName(name);
         assertEquals(name, instance.getName());
    }
    
}
