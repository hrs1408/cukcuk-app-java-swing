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
public class ExportNGTest {
    
    public ExportNGTest() {
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
        Export instance = new Export();
        long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = Long.MAX_VALUE;
        Export instance = new Export();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Export instance = new Export();
        long expResult = Long.MAX_VALUE;
        instance.setIdUser(expResult);
        long result = instance.getIdUser();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        long idUser = Long.MAX_VALUE;
        Export instance = new Export();
        instance.setIdUser(idUser);
        assertEquals(idUser, instance.getIdUser());
    }

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Export instance = new Export();
        String expResult = "12/12/2012";
        instance.setDate(expResult);
        String result = instance.getDate();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "12/12/2012";
        Export instance = new Export();
        instance.setDate(date);
        assertEquals(date, instance.getDate());
    }
    
}
