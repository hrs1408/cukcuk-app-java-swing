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
public class OrderNGTest {
    
    public OrderNGTest() {
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
        Order instance = new Order();
        Long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.MAX_VALUE;
        Order instance = new Order();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetTotalMoney() {
        System.out.println("getTotalMoney");
        Order instance = new Order();
        Double expResult = Double.MAX_VALUE;
        instance.setTotalMoney(expResult);
        Double result = instance.getTotalMoney();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetTotalMoney() {
        System.out.println("setTotalMoney");
        Double totalMoney = Double.MAX_VALUE;
        Order instance = new Order();
        instance.setTotalMoney(totalMoney);
        assertEquals(totalMoney, instance.getTotalMoney());
    }

    @Test
    public void testGetIdUser() {
        System.out.println("getIdUser");
        Order instance = new Order();
        Long expResult = Long.MAX_VALUE;
        instance.setIdUser(expResult);
        Long result = instance.getIdUser();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetIdUser() {
        System.out.println("setIdUser");
        Long idUser = Long.MAX_VALUE;
        Order instance = new Order();
        instance.setIdUser(idUser);
        assertEquals(idUser, instance.getIdUser());
    }

    @Test
    public void testGetIdVoucher() {
        System.out.println("getIdVoucher");
        Order instance = new Order();
        Long expResult = Long.MAX_VALUE;
        instance.setIdVoucher(expResult);
        Long result = instance.getIdVoucher();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetIdVoucher() {
        System.out.println("setIdVoucher");
        Long idVoucher = Long.MAX_VALUE;
        Order instance = new Order();
        instance.setIdVoucher(idVoucher);
        assertEquals(idVoucher, instance.getIdVoucher());
    }

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Order instance = new Order();
        String expResult = "12/12/2012";
        instance.setDate(expResult);
        String result = instance.getDate();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "12/12/2012";
        Order instance = new Order();
        instance.setDate(date);
        assertEquals(date, instance.getDate());
        
    }

    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Order instance = new Order();
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(result, expResult);
        
    }

    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = true;
        Order instance = new Order();
        instance.setStatus(status);
        assertEquals(status, instance.isStatus());
    }
    
}
