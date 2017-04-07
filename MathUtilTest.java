/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackages;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilTest {
    @Test
    public void testMultiply(){
      
        double a = 5.0;
        double b = 4.0;
        
        double expected = 20.0;
        double result = MathUtil.multiply(a, b);
        
        assertEquals(expected, result, 0.00001);
        
    }
}
