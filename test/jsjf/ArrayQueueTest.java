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
 * @author ZGARCIAG
 */
public class ArrayQueueTest {
    
    public ArrayQueueTest() {
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
     * Test of clear method, of class ArrayQueue.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        ArrayQueue instance = new ArrayQueue();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of isEmpty method, of class ArrayQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayQueue instance = new ArrayQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of isFull method, of class ArrayQueue.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ArrayQueue instance = new ArrayQueue();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of first method, of class ArrayQueue.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        ArrayQueue instance = new ArrayQueue();
        instance.enqueue("1");
        instance.enqueue("2");
        Object expResult = "1";
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of enqueue method, of class ArrayQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object element = "1";
        ArrayQueue instance = new ArrayQueue();
        instance.enqueue(element);
        Object result=instance.dequeue();
        Object expResult="1";
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of dequeue method, of class ArrayQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ArrayQueue instance = new ArrayQueue();
        instance.enqueue("1");
        Object expResult = "1";
        Object result = instance.dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of remove method, of class ArrayQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        ArrayQueue instance = new ArrayQueue();
        instance.enqueue("2");
        Object expResult = "2";
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class ArrayQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        ArrayQueue instance = new ArrayQueue();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
