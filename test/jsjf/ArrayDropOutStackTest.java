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
public class ArrayDropOutStackTest {
    
    public ArrayDropOutStackTest() {
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
     * Test of add method, of class ArrayDropOutStack.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "1";
        ArrayDropOutStack instance = new ArrayDropOutStack();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isFull method, of class ArrayDropOutStack.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ArrayDropOutStack instance = new ArrayDropOutStack();
        instance.add("1");
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of push method, of class ArrayDropOutStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = "1";
        ArrayDropOutStack instance = new ArrayDropOutStack();
        instance.push(element);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
