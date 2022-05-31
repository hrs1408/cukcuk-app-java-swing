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
public class ImportNGTest {
    
    public ImportNGTest() {
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
        Import instance = new Import();
        long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = Long.MAX_VALUE;
        Import instance = new Import();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetIdSupplier() {
        System.out.println("getIdSupplier");
        Import instance = new Import();
        long expResult = Long.MAX_VALUE;
        instance.setIdSupplier(expResult);
        long result = instance.getIdSupplier();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdSupplier() {
        System.out.println("setIdSupplier");
        long idSupplier = Long.MAX_VALUE;
        Import instance = new Import();
        instance.setIdSupplier(idSupplier);
        assertEquals(idSupplier, instance.getIdSupplier());
    }

    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Import instance = new Import();
        long expResult = Long.MAX_VALUE;
        instance.setIdUser(expResult);
        long result = instance.getIdUser();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        long idUser = Long.MAX_VALUE;
        Import instance = new Import();
        instance.setIdUser(idUser);
        assertEquals(idUser, instance.getIdUser());
    }

    @Test
    public void testGetTotalMoney() {
        System.out.println("getTotalMoney");
        Import instance = new Import();
        Double expResult = Double.MAX_VALUE;
        instance.setTotalMoney(expResult);
        Double result = instance.getTotalMoney();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetTotalMoney() {
        System.out.println("setTotalMoney");
        Double totalMoney = Double.MAX_VALUE;
        Import instance = new Import();
        instance.setTotalMoney(totalMoney);
        assertEquals(totalMoney, instance.getTotalMoney());
    }

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Import instance = new Import();
        String expResult = "12/12/2012";
        instance.setDate(expResult);
        String result = instance.getDate();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "12/12/2012";
        Import instance = new Import();
        instance.setDate(date);
        assertEquals(date, instance.getDate());
    }
    
}
