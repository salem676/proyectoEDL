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
public class LinkedQueueTest {
    
    public LinkedQueueTest() {
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
     * Test of enqueue method, of class LinkedQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = "1";
        LinkedQueue instance = new LinkedQueue();
        instance.enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of dequeue method, of class LinkedQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        LinkedQueue instance = new LinkedQueue();
        Object expResult = "1";
        instance.add("1");
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of first method, of class LinkedQueue.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        LinkedQueue instance = new LinkedQueue();
        instance.add("1");
        Object expResult = "1";
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class LinkedQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedQueue instance = new LinkedQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of clear method, of class LinkedQueue.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        LinkedQueue instance = new LinkedQueue();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class LinkedQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "1";
        LinkedQueue instance = new LinkedQueue();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class LinkedQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        LinkedQueue instance = new LinkedQueue();
        Object expResult = "1";
        instance.add("1");
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
