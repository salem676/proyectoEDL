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
public class LinearNodeTest {
    
    public LinearNodeTest() {
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
     * Test of getElement method, of class LinearNode.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        LinearNode instance = new LinearNode();
        Object expResult = null;
        Object result = instance.getElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setElement method, of class LinearNode.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        Object element = null;
        LinearNode instance = new LinearNode();
        instance.setElement(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNext method, of class LinearNode.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        LinearNode instance = new LinearNode();
        LinearNode expResult = null;
        LinearNode result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNext method, of class LinearNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        LinearNode instance = new LinearNode();
        instance.setNext(null);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
