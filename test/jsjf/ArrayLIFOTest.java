/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zuriel
 */
public class ArrayLIFOTest {
    
    public ArrayLIFOTest() {
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
     * Test of peek method, of class ArrayLIFO.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayLIFO instance = new ArrayLIFO();
        instance.add("!");
        Object expResult = "!";
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class ArrayLIFO.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayLIFO instance = new ArrayLIFO();
        instance.add("!");
        Object expResult = "!";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class ArrayLIFO.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ArrayLIFO instance = new ArrayLIFO();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of push method, of class ArrayLIFO.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = "!";
        ArrayLIFO instance = new ArrayLIFO();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayLIFO.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ArrayLIFO instance = new ArrayLIFO();
        Object expResult = "!";
        instance.add("!");
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
