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
import tokyo.huyhieu.cukcuk.model.Order;

/**
 *
 * @author huyhi
 */
public class OrderRepositoryNGTest {

    public OrderRepositoryNGTest() {
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
        List result = OrderRepository.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 123;
        Order order = new Order(id, Double.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, "12/12/2012", true);
        long expResult = order.getId();
        OrderRepository.insert(order);
        long result = OrderRepository.findById(id).getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        Long id = Long.valueOf(11);
        Order order = new Order(id, Double.MAX_VALUE, Long.valueOf(2), null, "12/12/2012", true);
        OrderRepository.insert(order);
        Long expResult = Long.valueOf(2);
        Long result = OrderRepository.findById(id).getIdUser();
        assertEquals(result,expResult);
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        Order Order = null;
        long id = 0L;
        OrderRepository.edit(Order, id);
    }

    @Test
    public void testEditStatus() {
        System.out.println("editStatus");
        long id = 12;
        Order order = new Order(Double.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, "12/12/2012", false);
        OrderRepository.insert(order);
        Order order1 = new Order(Double.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE, "12/12/2012", true);
        OrderRepository.editStatus(order1, id);
        assertNotEquals(order.isStatus(), order.isStatus());
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 3;
        OrderRepository.remove(id);
        Order expResult = null;
        Order result = OrderRepository.findById(id);
        assertEquals(result, expResult);
    }

    @Test(expectedExceptions = Exception.class)
    public void testRemoveWithNullId() {
        System.out.println("remove");
        Long id = null;
        OrderRepository.remove(id);
    }

}
