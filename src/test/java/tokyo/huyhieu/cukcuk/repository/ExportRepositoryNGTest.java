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
import tokyo.huyhieu.cukcuk.model.Export;

/**
 *
 * @author huyhi
 */
public class ExportRepositoryNGTest {
    
    public ExportRepositoryNGTest() {
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
        List result = ExportRepository.findAll();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 0L;
        Export expResult = null;
        Export result = ExportRepository.findById(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Export Export = null;
        ExportRepository.insert(Export);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Export Export = null;
        long id = 0L;
        ExportRepository.edit(Export, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 0L;
        ExportRepository.remove(id);
        fail("The test case is a prototype.");
    }
    
}
