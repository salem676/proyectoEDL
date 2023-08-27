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

/**
 *
 * @author Zuriel
 */
public class LinkedOrderedListTest {
    
    public LinkedOrderedListTest() {
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
     * Test of add method, of class LinkedOrderedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Alumno a1 = new Alumno("Luis");
        Alumno a2 = new Alumno("Hugo");
        Alumno a3 = new Alumno("Paco");
        Alumno a4 = new Alumno("Pancho");
        Alumno a5 = new Alumno("Juan");
        LinkedOrderedList instance = new LinkedOrderedList();
        instance.add(a2);
        System.out.println(instance.toString());
        instance.add(a5);
        System.out.println(instance.toString());
        instance.add(a3);
        System.out.println(instance.toString());
        instance.add(a4);
        System.out.println(instance.toString());
        instance.add(a1);
        System.out.println(instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
}
