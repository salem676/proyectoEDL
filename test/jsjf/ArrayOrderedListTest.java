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
public class ArrayOrderedListTest {
    
    public ArrayOrderedListTest() {
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
     * Test of add method, of class ArrayOrderedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "1";
        ArrayOrderedList instance = new ArrayOrderedList();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of add2 method, of class ArrayOrderedList.
     */
    @Test
    public void testAdd2() {
        System.out.println("add2");
        Object element = "1";
        ArrayOrderedList instance = new ArrayOrderedList();
        instance.add2(element);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
