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
public class ImportDetailNGTest {
    
    public ImportDetailNGTest() {
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
        ImportDetail instance = new ImportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = Long.MAX_VALUE;
        ImportDetail instance = new ImportDetail();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetIdImport() {
        System.out.println("getIdImport");
        ImportDetail instance = new ImportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setIdImport(expResult);
        long result = instance.getIdImport();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdImport() {
        System.out.println("setIdImport");
        long idImport = Long.MAX_VALUE;
        ImportDetail instance = new ImportDetail();
        instance.setIdImport(idImport);
        assertEquals(idImport, instance.getIdImport());
    }

    @Test
    public void testGetIdMaterial() {
        System.out.println("getIdMaterial");
        ImportDetail instance = new ImportDetail();
        long expResult = Long.MAX_VALUE;
        instance.setIdMaterial(expResult);
        long result = instance.getIdMaterial();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdMaterial() {
        System.out.println("setIdMaterial");
        long idMaterial = Long.MAX_VALUE;
        ImportDetail instance = new ImportDetail();
        instance.setIdMaterial(idMaterial);
        assertEquals(idMaterial, instance.getIdMaterial());
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ImportDetail instance = new ImportDetail();
        long expResult = Long.MAX_VALUE;

        instance.setQuantity(expResult);
        long result = instance.getQuantity();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        long quantity = Long.MAX_VALUE;
        ImportDetail instance = new ImportDetail();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }

    @Test
    public void testGetIntoMoney() {
        System.out.println("getIntoMoney");
        ImportDetail instance = new ImportDetail();
        Double expResult = Double.MAX_VALUE;
        instance.setIntoMoney(expResult);
        Double result = instance.getIntoMoney();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIntoMoney() {
        System.out.println("setIntoMoney");
        Double intoMoney = Double.MAX_VALUE;
        ImportDetail instance = new ImportDetail();
        instance.setIntoMoney(intoMoney);
        assertEquals(intoMoney, instance.getIntoMoney());
    }
    
}
