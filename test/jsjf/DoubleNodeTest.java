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
public class DoubleNodeTest {
    
    public DoubleNodeTest() {
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
     * Test of setElement method, of class DoubleNode.
     */
    @Test
    public void testSetElement() {
        System.out.println("setElement");
        Object element = null;
        DoubleNode instance = new DoubleNode();
        instance.setElement(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getElement method, of class DoubleNode.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        DoubleNode instance = new DoubleNode();
        Object expResult = null;
        Object result = instance.getElement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAnterior method, of class DoubleNode.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        DoubleNode instance = new DoubleNode();
        DoubleNode expResult = null;
        DoubleNode result = instance.getAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   }

    /**
     * Test of setAnterior method, of class DoubleNode.
     */
    @Test
    public void testSetAnterior() {
        System.out.println("setAnterior");
        DoubleNode instance = new DoubleNode();
        instance.setAnterior(null);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSiguiente method, of class DoubleNode.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        DoubleNode instance = new DoubleNode();
        DoubleNode expResult = null;
        DoubleNode result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setSiguiente method, of class DoubleNode.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        DoubleNode instance = new DoubleNode();
        instance.setSiguiente(null);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toStringF method, of class DoubleNode.
     */
    @Test
    public void testToStringF() {
        System.out.println("toStringF");
        DoubleNode instance = new DoubleNode();
        instance.setElement("!");
        String expResult = "!";
        String result = instance.toStringF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class DoubleNode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DoubleNode instance = new DoubleNode();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toStringB method, of class DoubleNode.
     */
    @Test
    public void testToStringB() {
        System.out.println("toStringB");
        DoubleNode instance = new DoubleNode();
        String expResult = "";
        String result = instance.toStringB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
