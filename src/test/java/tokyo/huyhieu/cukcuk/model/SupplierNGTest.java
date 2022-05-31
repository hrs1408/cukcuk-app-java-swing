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
public class SupplierNGTest {
    
    public SupplierNGTest() {
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
        Supplier instance = new Supplier();
        Long expResult = Long.MAX_VALUE;
        instance.setId(expResult);
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.MAX_VALUE;
        Supplier instance = new Supplier();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Supplier instance = new Supplier();
        String expResult = "Nguyễn Văn A";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Nguyễn Văn A";
        Supplier instance = new Supplier();
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Supplier instance = new Supplier();
        String expResult = "Hà Nội";
        instance.setAddress(expResult);
        String result = instance.getAddress();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "Hà Nội";
        Supplier instance = new Supplier();
        instance.setAddress(address);
        assertEquals(address, instance.getAddress());
    }

    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Supplier instance = new Supplier();
        String expResult = "0987654321";
        instance.setPhone(expResult);
        String result = instance.getPhone();
        assertEquals(result, expResult);
    }

    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "0987654321";
        Supplier instance = new Supplier();
        instance.setPhone(phone);
        assertEquals(phone, instance.getPhone());
    }
    
}
