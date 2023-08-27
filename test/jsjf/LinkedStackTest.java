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
public class LinkedStackTest {
    StackADT<Integer> pila;
    
    public LinkedStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pila=new LinkedStack<>();
    }
    
    @After
    public void tearDown() {
        pila.clear();
    }


    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        boolean expResult=true;
        boolean result=pila.isEmpty();
        assertEquals(expResult,result);
        pila.push(5);
        assertFalse(pila.isEmpty());
        pila.pop();
        assertTrue(pila.isEmpty());
        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of clear method, of class LinkedStack.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        pila.add(1);
        pila.clear();
        assertTrue(pila.isEmpty());
        LinkedStack instance = new LinkedStack();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class LinkedStack.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        LinkedStack instance = new LinkedStack();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        LinkedStack instance = new LinkedStack();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        pila.add(1);
        pila.add(4);
        int expResult=4;
        int result = pila.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        pila.add(1);
        pila.add(4);
        int expResult=4;
        int result=pila.peek();
        assertEquals(expResult, result);
        pila.pop();
        assertEquals(1,(int)pila.peek());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
