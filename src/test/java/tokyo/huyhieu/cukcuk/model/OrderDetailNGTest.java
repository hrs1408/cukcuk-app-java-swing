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
public class OrderDetailNGTest {
    
    public OrderDetailNGTest() {
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
        OrderDetail instance = new OrderDetail();
        Long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.MAX_VALUE;
        OrderDetail instance = new OrderDetail();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetIdOrder() {
        System.out.println("getIdOrder");
        OrderDetail instance = new OrderDetail();
        Long expResult = Long.MAX_VALUE;
        instance.setIdOrder(expResult);
        Long result = instance.getIdOrder();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdOrder() {
        System.out.println("setIdOrder");
        Long idOrder = Long.MAX_VALUE;
        OrderDetail instance = new OrderDetail();
        instance.setIdOrder(idOrder);
        assertEquals(idOrder, instance.getIdOrder());
    }

    @Test
    public void testGetIdProduct() {
        System.out.println("getIdProduct");
        OrderDetail instance = new OrderDetail();
        Long expResult = Long.MAX_VALUE;
        instance.setIdProduct(expResult);
        Long result = instance.getIdProduct();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIdProduct() {
        System.out.println("setIdProduct");
        Long idProduct = Long.MAX_VALUE;
        OrderDetail instance = new OrderDetail();
        instance.setIdProduct(idProduct);
        assertEquals(idProduct, instance.getIdProduct());
    }

    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        OrderDetail instance = new OrderDetail();
        Long expResult = Long.MAX_VALUE;
        instance.setQuantity(expResult);
        Long result = instance.getQuantity();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        Long quantity = Long.MAX_VALUE;
        OrderDetail instance = new OrderDetail();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }

    @Test
    public void testGetIntoMoney() {
        System.out.println("getIntoMoney");
        OrderDetail instance = new OrderDetail();
        Double expResult = Double.MAX_VALUE;
        instance.setIntoMoney(expResult);
        Double result = instance.getIntoMoney();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetIntoMoney() {
        System.out.println("setIntoMoney");
        Double intoMoney = Double.MAX_VALUE;
        OrderDetail instance = new OrderDetail();
        instance.setIntoMoney(intoMoney);
        assertEquals(intoMoney, instance.getIntoMoney());
    }
    
}
