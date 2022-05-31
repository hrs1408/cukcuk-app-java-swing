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
public class ExportDetailNGTest {
    
    public ExportDetailNGTest() {
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
        ExportDetail instance = new ExportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = Long.MAX_VALUE;
        ExportDetail instance = new ExportDetail();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetIdExport() {
        System.out.println("getIdExport");
        ExportDetail instance = new ExportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setIdExport(expResult);
        long result = instance.getIdExport();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdExport() {
        System.out.println("setIdExport");
        long idExport = Long.MAX_VALUE;
        ExportDetail instance = new ExportDetail();
        instance.setIdExport(idExport);
        assertEquals(idExport, instance.getIdExport());
    }

    @Test
    public void testGetIdMaterial() {
        System.out.println("getIdMaterial");
        ExportDetail instance = new ExportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setIdMaterial(expResult);
        long result = instance.getIdMaterial();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdMaterial() {
        System.out.println("setIdMaterial");
        long idMaterial = Long.MAX_VALUE;
        ExportDetail instance = new ExportDetail();
        instance.setIdMaterial(idMaterial);
        assertEquals(idMaterial, instance.getIdMaterial());
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ExportDetail instance = new ExportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setQuantity(expResult);
        long result = instance.getQuantity();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        long quantity = Long.MAX_VALUE;
        ExportDetail instance = new ExportDetail();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }
    
}
