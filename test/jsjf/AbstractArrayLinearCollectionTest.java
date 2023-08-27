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
public class AbstractArrayLinearCollectionTest {
    
    public AbstractArrayLinearCollectionTest() {
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
     * Test of clear method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        instance.add("1");
        instance.clear();
        boolean result=false;
        boolean expResult=true;
        if(instance.isEmpty()){
            result=true;
        }
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isEmpty method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        boolean expResult = false;
        instance.add("!");
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        boolean expResult = false;
        boolean result = instance.isFull();
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
        instance.add("!");
      
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "!";
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of expandCapacity method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testExpandCapacity() {
        System.out.println("expandCapacity");
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        instance.expandCapacity();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of size method, of class AbstractArrayLinearCollection.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractArrayLinearCollection instance = new AbstractArrayLinearCollectionImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class AbstractArrayLinearCollectionImpl extends AbstractArrayLinearCollection {
    }
    
}
