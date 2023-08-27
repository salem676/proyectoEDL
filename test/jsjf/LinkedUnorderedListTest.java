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
public class LinkedUnorderedListTest {
    
    public LinkedUnorderedListTest() {
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
     * Test of addAfter method, of class LinkedUnorderedList.
     */
    @Test
    public void testAddAfter() {
        System.out.println("addAfter");
        Object target = "4";
        Object element = "6";
        LinkedUnorderedList instance = new LinkedUnorderedList();
        instance.add("1");
        instance.add("2");
        instance.add("3");
        instance.add("4");
        instance.add("5");
        System.out.println(instance.toString());
        instance.addAfter(target, element);
        System.out.println(instance.toString());
        assertTrue(instance.contains("6"));
    }
    
}
