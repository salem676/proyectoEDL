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
public class ArrayUnorderedListTest {
    
    public ArrayUnorderedListTest() {
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
     * Test of remove method, of class ArrayUnorderedList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 0;
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("2");
        Object expResult = "2";
        Object result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayUnorderedList.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object element = "1";
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("1");
        Object expResult ="1";
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class ArrayUnorderedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "!";
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add(element);
        Object result=instance.remove();
        Object expResult="!";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class ArrayUnorderedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = "1";
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("2");
        instance.add("1");
        instance.add("3");
        boolean expResult = true;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of get method, of class ArrayUnorderedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("1");
        Object expResult = "1";
        Object result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of indexOf method, of class ArrayUnorderedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = "2";
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("2");
        instance.add("1");
        instance.add("3");
        int expResult = 0;
        int result = instance.indexOf(element);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of set method, of class ArrayUnorderedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 2;
        Object element = "!";
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.set(index, element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class ArrayUnorderedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayUnorderedList instance = new ArrayUnorderedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iterator method, of class ArrayUnorderedList.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ArrayUnorderedList instance = new ArrayUnorderedList();
        Iterator result = instance.iterator();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class ArrayUnorderedList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        ArrayUnorderedList instance = new ArrayUnorderedList();
        instance.add("!");
        Object result = instance.remove();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
