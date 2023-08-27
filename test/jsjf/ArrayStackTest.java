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
 * @author zgarciag
 */
public class ArrayStackTest {
    
    public ArrayStackTest() {
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
     * Test of clear method, of class ArrayStack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayStack instance = new ArrayStack();
        instance.add("1");
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class ArrayStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayStack instance = new ArrayStack();
        boolean expResult = false;
        instance.add("!");
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class ArrayStack.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ArrayStack instance = new ArrayStack();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of push method, of class ArrayStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = "1";
        ArrayStack instance = new ArrayStack();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of expandCapacity method, of class ArrayStack.
     */
    @Test
    public void testExpandCapacity() {
        System.out.println("expandCapacity");
        ArrayStack instance = new ArrayStack();
        instance.expandCapacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of peek method, of class ArrayStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayStack instance = new ArrayStack();
        instance.add("!");
        instance.add("1");
        Object expResult = "1";
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class ArrayStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayStack instance = new ArrayStack();
        Object expResult = "1";
        instance.add("2");
        instance.add("1");
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
