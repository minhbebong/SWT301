/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Lenovo
 */
public class NumberEvenTest {
    
    public NumberEvenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isNumberEven method, of class NumberEven.
     */
    @Test
    public void assertTrue() {
        boolean result = NumberEven.isNumberEven(8);
        Assertions.assertTrue(result);
    }
    @Test
    public void assertFalse() {
        boolean result = NumberEven.isNumberEven(3);
        Assertions.assertFalse(result);
    }
    
}
