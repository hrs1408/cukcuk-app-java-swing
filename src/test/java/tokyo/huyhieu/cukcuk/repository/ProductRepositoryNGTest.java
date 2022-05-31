/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tokyo.huyhieu.cukcuk.repository;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tokyo.huyhieu.cukcuk.model.Product;

/**
 *
 * @author huyhi
 */
public class ProductRepositoryNGTest {

    public ProductRepositoryNGTest() {
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
    public void testFindAll() {
        System.out.println("findAll");
        List result = ProductRepository.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = Long.valueOf(1);
        Product expResult = new Product(id, Long.valueOf(1), "Bánh chocolate", 32000.00, "C:\\Users\\huyhi\\Documents\\banh-chocolate-fondant-033.jpg");
        Product result = ProductRepository.findById(id);
        assertEquals(result.getId(), expResult.getId());
    }

    @Test
    public void testFindByNameAdd() {
        System.out.println("findByNameAdd");
        String name = "Bánh chocolate";
        String expResult = "Bánh chocolate";
        Product result = ProductRepository.findByNameAdd(name);
        assertEquals(result.getName(), expResult);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Long id = Long.valueOf(46);
        Product product = new Product(id, Long.valueOf(1), "tesst", 3200.0, "asd");
        ProductRepository.insert(product);
        Long expResult = ProductRepository.findById(id).getId();
        assertEquals(id, expResult);
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        long id = 14;
        Product product = new Product(id, Long.valueOf(1), "tesst", 3200.0, "asd");
        ProductRepository.edit(product, id);
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 47;
        ProductRepository.remove(id);
        Product expResult = null;
        Long result = ProductRepository.findById(id).getId();
        assertEquals(result, expResult);
    }

    @Test(expectedExceptions = Exception.class)
    public void testRemoveWithNullID() {
        System.out.println("remove");
        Long id = null;
        ProductRepository.remove(id);
    }
    
    @Test(expectedExceptions = Exception.class)
    public void testRemoveWithEmptyID() {
        System.out.println("remove");
        long id = Long.valueOf("");
        ProductRepository.remove(id);
    }

}
