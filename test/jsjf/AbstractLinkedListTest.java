/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf;

import java.util.Iterator;
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
public class AbstractLinkedListTest {
    
    public AbstractLinkedListTest() {
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
     * Test of clear method, of class AbstractLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        instance.add("2");
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of addFirst method, of class AbstractLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        AbstractLinkedList<String> instance = new AbstractLinkedList();
        instance.addFirst("1");
        instance.addFirst("2");
        instance.addFirst("3");
        assertTrue(instance.contains("3"));
        assertTrue(instance.contains("2"));
        assertTrue(instance.contains("1"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addLast method, of class AbstractLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object element = null;
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.addLast(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeLast method, of class AbstractLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        instance.add("2");
        instance.add("3");
        Object expResult = "3";
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeFirst method, of class AbstractLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        Object expResult="1";
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class AbstractLinkedList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        Object expResult = "1";
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of first method, of class AbstractLinkedList.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        Object expResult = "1";
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of last method, of class AbstractLinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        instance.add("2");
        instance.add("3");
        Object expResult = "3";
        Object result = instance.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class AbstractLinkedList.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object element = "1";
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add(element);
        instance.add("2");
        instance.add("23");
        instance.add("4");
        Object expResult = "23";
        Object result = instance.remove("23");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscaNodo method, of class AbstractLinkedList.
     */
    @Test
    public void testBuscaNodo() {
        System.out.println("buscaNodo");
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add("1");
        DoubleNode result = instance.buscaNodo(instance.head.getSiguiente(),"1");
        assertEquals("1", result.getElement());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class AbstractLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        AbstractLinkedList instance = new AbstractLinkedList();
        DoubleNode nuevo=new DoubleNode("1");
        instance.head.setSiguiente(nuevo);
        assertTrue(instance.contains("1"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class AbstractLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractLinkedList instance = new AbstractLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class AbstractLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractLinkedList instance = new AbstractLinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class AbstractLinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = null;
        AbstractLinkedList instance = new AbstractLinkedList();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toStringF method, of class AbstractLinkedList.
     */
    @Test
    public void testToStringF() {
        System.out.println("toStringF");
        AbstractLinkedList instance = new AbstractLinkedList();
        String expResult = "";
        String result = instance.toStringF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toStringB method, of class AbstractLinkedList.
     */
    @Test
    public void testToStringB() {
        System.out.println("toStringB");
        AbstractLinkedList instance = new AbstractLinkedList();
        String expResult = "";
        String result = instance.toStringB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class AbstractLinkedList.
     */
    @Test
    public void testToString_0args() {
        System.out.println("toString");
        AbstractLinkedList instance = new AbstractLinkedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }



    /**
     * Test of iterator method, of class AbstractLinkedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        AbstractLinkedList instance = new AbstractLinkedList();
        Iterator expResult = instance.iterator();
        Iterator result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
