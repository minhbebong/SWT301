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

/**
 *
 * @author Lenovo
 */
public class DemoTest {

    public DemoTest() {
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
     * Test of isPrimeNumber method, of class Demo.
     */
//    @Test
//    public void testIsPrimeNumber() {
//        System.out.println("isPrimeNumber");
//        int input = 0;
//        Demo instance = new Demo();
//        boolean expResult = false;
//        boolean result = instance.isPrimeNumber(input);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testIsPrimeNumber1() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(-1);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber2() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(0);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber3() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(1);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber4() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(7);
        assertTrue(result);
    }

    @Test
    public void testIsPrimeNumber5() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(9999);
        assertFalse(result);
    }

    @Test
    public void testIsPrimeNumber6() {
        Demo demo1 = new Demo();
        boolean result = demo1.isPrimeNumber(-9999);
        assertFalse(result);
    }

    @Test
    public void testsoHH1() {
        Demo demo1 = new Demo();
        boolean result = demo1.ktraSoHH(6);
        assertTrue(result);
    }

    @Test
    public void testsoHH2() {
        Demo demo1 = new Demo();
        boolean result = demo1.ktraSoHH(-3);
        assertTrue(result);
    }

    @Test
    public void testsoHH3() {
        Demo demo1 = new Demo();
        boolean result = demo1.ktraSoHH('a');
        assertTrue(result);
    }

    @Test
    public void testsoHH4() {
        Demo demo1 = new Demo();
        boolean result = demo1.ktraSoHH(5);
        assertFalse(result);
    }

    @Test
    public void testSum1() {
        Demo demo1 = new Demo();
        assertEquals(demo1.sum(1, 1), 2);
    }

    @Test
    public void testSum2() {
        Demo demo1 = new Demo();
        assertEquals(demo1.sum(1, 1), 3);
    }

    @Test
    public void testSum3() {
        Demo demo1 = new Demo();
        assertEquals(demo1.sum(1, 2), 3);
    }

    @Test
    public void testMin1() {
        Demo demo1 = new Demo();
        assertTrue(demo1.min(4, 5));
    }

    @Test
    public void testMin2() {
        Demo demo1 = new Demo();
        assertTrue(demo1.min(6, 3));
    }

    @Test
    public void testMin3() {
        Demo demo1 = new Demo();
        assertFalse(demo1.min(7, 5));
    }

}
