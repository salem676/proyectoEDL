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
public class LinkedIndexedListTest {
    
    public LinkedIndexedListTest() {
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
     * Test of get method, of class LinkedIndexedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 1;
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("1");
        instance.add("2");
        Object expResult = "2";
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class LinkedIndexedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 1;
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("1");
        instance.add("2");
        Object expResult = "2";
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of set method, of class LinkedIndexedList.
     */
    @Test
    public void testSet_int() {
        System.out.println("set");
        int index = 0;
        String element="1";
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("2");
        instance.set(element,index);
        assertTrue(instance.contains("1"));
        assertFalse(instance.contains("2"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of indexOf method, of class LinkedIndexedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = "3";
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("1");
        instance.add("2");
        instance.add("3");
        instance.add("4");
        int expResult = 2;
        int result = instance.indexOf(element);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class LinkedIndexedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int index = 0;
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("1", index);
        assertTrue(instance.contains("1"));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of set method, of class LinkedIndexedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 3;
        
        LinkedIndexedList instance = new LinkedIndexedList();
        instance.add("1");
        System.out.println(instance.head.getSiguiente().getElement());
        System.out.println(instance.tail.getAnterior().getElement());
        instance.add("2");
        System.out.println(instance.head.getSiguiente().getElement());
        System.out.println(instance.tail.getAnterior().getElement());
        instance.add("3");
        System.out.println(instance.head.getSiguiente().getElement());
        System.out.println(instance.tail.getAnterior().getElement());
        instance.add("4");
        System.out.println(instance.head.getSiguiente().getElement());
        System.out.println(instance.tail.getAnterior().getElement());
        instance.add("5");
        System.out.println(instance.head.getSiguiente().getElement());
        System.out.println(instance.tail.getAnterior().getElement());


        instance.set("8", index);
        System.out.println(instance.indexOf("8"));
        assertTrue(instance.indexOf("8")==index);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
