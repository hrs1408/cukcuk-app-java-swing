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
import tokyo.huyhieu.cukcuk.model.ExportDetail;

/**
 *
 * @author huyhi
 */
public class ExportDetailRepositoryNGTest {
    
    public ExportDetailRepositoryNGTest() {
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
        List result = ExportDetailRepository.findAll();
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 0L;
        ExportDetail expResult = null;
        ExportDetail result = ExportDetailRepository.findById(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testFindByExport() {
        System.out.println("findByExport");
        long id = 0L;
        List expResult = null;
        List result = ExportDetailRepository.findByExport(id);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        ExportDetail ExportDetail = null;
        ExportDetailRepository.insert(ExportDetail);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        ExportDetail ExportDetail = null;
        long id = 0L;
        ExportDetailRepository.edit(ExportDetail, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 0L;
        ExportDetailRepository.remove(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemoveByIdExport() {
        System.out.println("removeByIdExport");
        long id = 0L;
        ExportDetailRepository.removeByIdExport(id);
        fail("The test case is a prototype.");
    }
    
}
