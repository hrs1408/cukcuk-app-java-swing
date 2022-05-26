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
public class UserNGTest {

    public UserNGTest() {
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

    /**
     * Test of getId method, of class User.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        User instance = new User();
        instance.setId(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        Long expResult = Long.MAX_VALUE;
        Long result = instance.getId();
        assertEquals(result, expResult);
    }

    /**
     * Test of setId method, of class User.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = Long.valueOf(10);
        User instance = new User();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    /**
     * Test of getUserName method, of class User.
     */
    @Test
    public void testGetUserName() {
        System.out.println("getUserName");
        User instance = new User();
        instance.setUserName("huyhieu");
        String expResult = "huyhieu";
        String result = instance.getUserName();
        assertEquals(result, expResult);
    }

    /**
     * Test of setUserName method, of class User.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "huyhieu";
        User instance = new User();
        instance.setUserName(userName);
        assertEquals(userName, instance.getUserName());
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        instance.setPassword("12345678");
        String expResult = "12345678";
        String result = instance.getPassword();
        assertEquals(result, expResult);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "12345678";
        User instance = new User();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());

    }

    /**
     * Test of getFullName method, of class User.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        User instance = new User();
        instance.setFullName("Nguyen Phan Huy Hieu");
        String expResult = "Nguyen Phan Huy Hieu";
        String result = instance.getFullName();
        assertEquals(result, expResult);
    }

    /**
     * Test of setFullName method, of class User.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");
        String fullName = "Nguyen Phan Huy Hieu";
        User instance = new User();
        instance.setFullName(fullName);
        assertEquals(fullName, instance.getFullName());
    }

    /**
     * Test of getPhone method, of class User.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        User instance = new User();
        instance.setPhone("0911348766");
        String expResult = "0911348766";
        String result = instance.getPhone();
        assertEquals(result, expResult);
    }

    /**
     * Test of setPhone method, of class User.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "0911348766";
        User instance = new User();
        instance.setPhone(phone);
        assertEquals(phone, instance.getPhone());

    }
    

    /**
     * Test of getRole method, of class User.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        User instance = new User();
        Boolean expResult = null;
        Boolean result = instance.getRole();
        assertEquals(result, expResult);
    }

    /**
     * Test of setRole method, of class User.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        Boolean role = null;
        User instance = new User();
        instance.setRole(role);
    }
}
