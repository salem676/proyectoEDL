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
public class ArrayFIFOTest {
    
    public ArrayFIFOTest() {
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
     * Test of first method, of class ArrayFIFO.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        ArrayFIFO instance = new ArrayFIFO();
        instance.add("!");
        Object expResult = "!";
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of enqueue method, of class ArrayFIFO.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = "1";
        ArrayFIFO instance = new ArrayFIFO();
        instance.enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of dequeue method, of class ArrayFIFO.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ArrayFIFO instance = new ArrayFIFO();
        instance.add("!");
        Object expResult = "!";
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayFIFO.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ArrayFIFO instance = new ArrayFIFO();
        instance.enqueue("1");
        Object expResult = "1";
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
