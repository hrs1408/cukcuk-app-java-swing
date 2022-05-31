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
import tokyo.huyhieu.cukcuk.model.User;

/**
 *
 * @author huyhi
 */
public class UserRepositoryNGTest {

    public UserRepositoryNGTest() {
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
        List result = UserRepository.findAll();
        assertNotNull(result);
    }

    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 1;
        User expResult = new User(id, "huyhieu", "Sp140802", "Nguyễn Phan Huy Hiếu", "0911348766", true);
        User result = UserRepository.findById(id);
        assertEquals(result.getId(), expResult.getId());
    }

    @Test
    public void testFindByFullName() {
        System.out.println("findByFullName");
        String name = "";
        User expResult = null;
        User result = UserRepository.findByFullName(name);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        User User = null;
        UserRepository.insert(User);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEdit() {
        System.out.println("edit");
        User User = null;
        long id = 0L;
        UserRepository.edit(User, id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 0L;
        UserRepository.remove(id);
        fail("The test case is a prototype.");
    }

}
