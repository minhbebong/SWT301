/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lenovo
 */
public class PheptoanTest {
    Pheptoan pt;
    
    public PheptoanTest() {
        pt = new Pheptoan();
    }

    @Test
    public void testSomeMethod() {
        int kq = pt.Nhan(4, 5);
        int kquamongdoi = 20;
        assertEquals(kq, kquamongdoi);
    }
    
     @Test
    public void testSomeMethod1() {
        int kq = pt.Cong(4, 5);
        int kquamongdoi = 9;
        assertEquals(kq, kquamongdoi);
    }
}
