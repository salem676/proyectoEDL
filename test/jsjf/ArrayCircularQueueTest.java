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
public class ArrayCircularQueueTest {
    
    public ArrayCircularQueueTest() {
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
     * Test of clear method, of class ArrayCircularQueue.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.enqueue("!");
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class ArrayCircularQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isFull method, of class ArrayCircularQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of first method, of class ArrayCircularQueue.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.add("1");
        Object expResult = "1";
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of enqueue method, of class ArrayCircularQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = "1";
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of dequeue method, of class ArrayCircularQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.enqueue("!");
        Object expResult = "!";
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayCircularQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.enqueue("1");
        Object expResult = "1";
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class ArrayCircularQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "!";
        ArrayCircularQueue instance = new ArrayCircularQueue();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
