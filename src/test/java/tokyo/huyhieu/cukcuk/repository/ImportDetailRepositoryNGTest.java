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
import tokyo.huyhieu.cukcuk.model.ImportDetail;

/**
 *
 * @author huyhi
 */
public class ImportDetailRepositoryNGTest {
    
    public ImportDetailRepositoryNGTest() {
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
        List expResult = null;
        List result = ImportDetailRepository.findAll();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByImport() {
        System.out.println("findByImport");
        long id = 0L;
        List expResult = null;
        List result = ImportDetailRepository.findByImport(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotalById() {
        System.out.println("getTotalById");
        long id = 0L;
        Double expResult = null;
        Double result = ImportDetailRepository.getTotalById(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 0L;
        ImportDetail expResult = null;
        ImportDetail result = ImportDetailRepository.findById(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ImportDetail ImportDetail = null;
        ImportDetailRepository.insert(ImportDetail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        ImportDetail ImportDetail = null;
        long id = 0L;
        ImportDetailRepository.edit(ImportDetail, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 0L;
        ImportDetailRepository.remove(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemoveByIdImport() {
        System.out.println("removeByIdImport");
        long id = 0L;
        ImportDetailRepository.removeByIdImport(id);
        fail("The test case is a prototype.");
    }
    
}
