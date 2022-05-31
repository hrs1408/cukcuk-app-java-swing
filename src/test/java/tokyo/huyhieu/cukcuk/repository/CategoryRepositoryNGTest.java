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
import tokyo.huyhieu.cukcuk.model.Category;

/**
 *
 * @author huyhi
 */
public class CategoryRepositoryNGTest {

    public CategoryRepositoryNGTest() {
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
        List result = CategoryRepository.findAll();
        assertNotNull(result); 
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 1;
        Category expResult = new Category(Long.valueOf(1), "Món ăn");
        Category result = CategoryRepository.findById(id);
        assertEquals(result.getId(), expResult.getId());
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Long id = Long.valueOf(16);
        Category Category = new Category(id, "testInsert");
        CategoryRepository.insert(Category);
        Long expResult = CategoryRepository.findById(id).getId();
        assertEquals(id, expResult);
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        long id = 14;
        Category Category = new Category(id, "testEdit");
        CategoryRepository.edit(Category, id);
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 13;
        if (CategoryRepository.findById(id) != null) {
            CategoryRepository.remove(id);
            Category expResult = null;
            Long result = CategoryRepository.findById(id).getId();
            assertEquals(result, expResult);
        } else {
            fail("No categories in database");
        }
    }

    @Test(expectedExceptions = Exception.class)
    public void testRemoveWithNullId() {
        System.out.println("remove");
        Long id = null;
        CategoryRepository.remove(id);
    }
    
    @Test(expectedExceptions = Exception.class)
    public void testRemoveWithEmpyId() {
        System.out.println("remove");
        Long id = Long.valueOf("");
        CategoryRepository.remove(id);
    }
    
}
