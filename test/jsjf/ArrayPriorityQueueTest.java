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
public class ArrayPriorityQueueTest {
    
    public ArrayPriorityQueueTest() {
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
     * Test of enqueue method, of class ArrayPriorityQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        ArrayPriorityQueue instance = new ArrayPriorityQueue();

        
    }

    /**
     * Test of dequeue method, of class ArrayPriorityQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        ArrayPriorityQueue instance = new ArrayPriorityQueue();
        instance.enqueue("1");
        instance.enqueue("3");
        instance.enqueue("2");
        instance.enqueue("4");
        instance.enqueue("5");
        instance.enqueue("7");
        String temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("7"));
        temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("5"));
        temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("4"));
        temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("3"));
        temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("2"));
        temp=(String)instance.dequeue();
        System.out.println(temp);
        assertTrue(temp.equals("1"));
    }
    
}
