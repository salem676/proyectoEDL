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
public class DequeueDNTest {
    
    public DequeueDNTest() {
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
     * Test of clear method, of class DequeueDN.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DequeueDN instance = new DequeueDN();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class DequeueDN.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DequeueDN instance = new DequeueDN();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class DequeueDN.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DequeueDN instance = new DequeueDN();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addFirst method, of class DequeueDN.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object element = null;
        DequeueDN instance = new DequeueDN();
        instance.addFirst(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addLast method, of class DequeueDN.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        DequeueDN instance = new DequeueDN();
        instance.addLast(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeLast method, of class DequeueDN.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DequeueDN instance = new DequeueDN();
        instance.addFirst("1");
        Object expResult = "1";
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeFirst method, of class DequeueDN.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DequeueDN instance = new DequeueDN();
        instance.addLast("1");
        instance.addFirst("4");
        Object expResult = "4";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class DequeueDN.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object element = "1";
        DequeueDN instance = new DequeueDN();
        instance.addFirst(element);
        Object expResult = "1";
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
