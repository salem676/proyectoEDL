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
public class AbstractArrayLinearCollectionIterableTest {
    
    public AbstractArrayLinearCollectionIterableTest() {
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
     * Test of size method, of class AbstractArrayLinearCollectionIterable.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractArrayLinearCollectionIterable instance = new AbstractArrayLinearCollectionIterableImpl();
        int expResult = 2;
        instance.add("!");
        instance.add("2");
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class AbstractArrayLinearCollectionIterable.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AbstractArrayLinearCollectionIterable instance = new AbstractArrayLinearCollectionIterableImpl();
        instance.add("1");
        instance.add("2");
        instance.add("3");
        String expResult = "1 2 3 ";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of indexOf method, of class AbstractArrayLinearCollectionIterable.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object element = "1";
        AbstractArrayLinearCollectionIterable instance = new AbstractArrayLinearCollectionIterableImpl();
        instance.add("!");
        instance.add("1");
        int expResult = 1;
        int result = instance.indexOf(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class AbstractArrayLinearCollectionIterable.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = "1";
        AbstractArrayLinearCollectionIterable instance = new AbstractArrayLinearCollectionIterableImpl();
        instance.add("3t");
        instance.add("1");
        boolean expResult = true;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iterator method, of class AbstractArrayLinearCollectionIterable.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        AbstractArrayLinearCollectionIterable instance = new AbstractArrayLinearCollectionIterableImpl();
        Iterator expResult = instance.iterator();
        Iterator result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class AbstractArrayLinearCollectionIterableImpl extends AbstractArrayLinearCollectionIterable {
    }
    
}
