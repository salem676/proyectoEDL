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
public class ArrayIndexedListTest {
    
    public ArrayIndexedListTest() {
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
     * Test of get method, of class ArrayIndexedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 2;
        ArrayIndexedList instance = new ArrayIndexedList();
        Object expResult = "1";
        instance.add("·", 0);
        instance.add("2", 1);
        instance.add("1", 2);
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of set method, of class ArrayIndexedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object element = "1";
        int index = 0;
        ArrayIndexedList instance = new ArrayIndexedList();
        instance.add("2", 0);
        instance.set(element, index);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of indexOf method, of class ArrayIndexedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = "!";
        ArrayIndexedList instance = new ArrayIndexedList();
        instance.add("1", 0);
        instance.add("2", 0);
        instance.add("3", 0);
        instance.add("4", 0);
        instance.add("!", 4);
        int expResult = 4;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class ArrayIndexedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "!";
        int index = 0;
        ArrayIndexedList instance = new ArrayIndexedList();
        instance.add(element, index);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayIndexedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 2;
        ArrayIndexedList instance = new ArrayIndexedList();
        instance.add("1", 0);
        instance.add("3",1);
        instance.add("!",2);
        Object expResult = "!";
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
