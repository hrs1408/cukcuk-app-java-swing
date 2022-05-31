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
import tokyo.huyhieu.cukcuk.model.Warehouse;

/**
 *
 * @author huyhi
 */
public class WarehouseRepositoryNGTest {
    
    public WarehouseRepositoryNGTest() {
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
        List result = WarehouseRepository.findAll();
        assertNotNull(result);
    }
    
    @Test
    public void testFindById() {
        System.out.println("findById");
        long id = 1;
        Warehouse expResult = new Warehouse(id, Long.valueOf(30));
        Warehouse result = WarehouseRepository.findById(id);
        assertEquals(result.getIdMaterial(), expResult.getIdMaterial());
    }
    
    @Test
    public void testInsert() {
        System.out.println("insert");
        Long id = Long.valueOf(13);
        Warehouse Warehouse = new Warehouse(id, Long.valueOf(30));
        WarehouseRepository.insert(Warehouse);
        Long expResult = WarehouseRepository.findById(id).getIdMaterial();
        assertEquals(id, expResult);
    }
    
    @Test
    public void testEdit() {
        System.out.println("edit");
        long id = 13;
        Warehouse Warehouse = new Warehouse(id, Long.valueOf(15));
        WarehouseRepository.edit(Warehouse, id);
    }
    
    @Test
    public void testRemove() {
        System.out.println("remove");
        long id = 0L;
        WarehouseRepository.remove(id);
    }
    
    @Test(expectedExceptions = Exception.class)
    public void testRemove_Exception() {
        System.out.println("remove");
        Long id = null;
        WarehouseRepository.remove(id);
    }
}
