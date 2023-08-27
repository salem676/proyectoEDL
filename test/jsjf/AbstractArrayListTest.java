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
public class AbstractArrayListTest {
    
    public AbstractArrayListTest() {
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
     * Test of first method, of class AbstractArrayList.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "!";
        instance.add("!");
        Object result = instance.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of last method, of class AbstractArrayList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "!";
        instance.add("1");
        instance.add("!");
        Object result = instance.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeFirst method, of class AbstractArrayList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "1";
        instance.add("1");
        instance.add("·");
        Object result = instance.removeFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of removeLast method, of class AbstractArrayList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "2";
        instance.add("1");
        instance.add("2");
        Object result = instance.removeLast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class AbstractArrayList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "!";
        instance.add("!");
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class AbstractArrayList.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object element = "1";
        AbstractArrayList instance = new AbstractArrayListImpl();
        Object expResult = "1";
        instance.add("4");
        instance.add("1");
        instance.add("3");
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class AbstractArrayListImpl extends AbstractArrayList {
    }
    
}
