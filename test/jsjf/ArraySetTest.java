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
 * @author zgarciag
 */
public class ArraySetTest {
    
    public ArraySetTest() {
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
     * Test of remove method, of class ArraySet.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        ArraySet instance = new ArraySet();
        Object expResult = "2";
        instance.array[0]="2";
        instance.nextLast++;
        Object result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remove method, of class ArraySet.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object element = "3";
        ArraySet instance = new ArraySet();
        instance.array[0]="2";
        instance.nextLast++;
        instance.array[1]="3";
        instance.nextLast++;
        instance.array[2]="4";
        instance.nextLast++;
        Object expResult = "3";
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of contains method, of class ArraySet.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object element = "1";
        ArraySet instance = new ArraySet();
        instance.add("1");
        boolean expResult = true;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of size method, of class ArraySet.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArraySet instance = new ArraySet();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of add method, of class ArraySet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object element = "1";
        ArraySet instance = new ArraySet();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of find method, of class ArraySet.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object element = "2";
        ArraySet instance = new ArraySet();
        instance.array[0]=element;
        instance.nextLast++;
        instance.array[1]="3";
        instance.nextLast++;
        int expResult = 0;
        int result = instance.find(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of union method, of class ArraySet.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        ArraySet instance = new ArraySet();
        instance.add("!");
        instance.add("1");
        ArraySet otro=new ArraySet();
        SetADT<String> unido=instance.union(otro);
        ArraySet nuevo=new ArraySet();
        nuevo.add("!");
        nuevo.add("1");
        boolean result=unido.equals(nuevo);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of intersection method, of class ArraySet.
     */
    @Test
    public void testIntersection() {
        System.out.println("intersection");
        ArraySet<String> instance = new ArraySet();
        instance.add("1");
        instance.add("2");
        ArraySet<String> otro=new ArraySet();
        otro.add("1");
        otro.add("3");
        ArraySet<String> res=new ArraySet();
        res.add("1");
        SetADT<String> inter=new ArraySet();
        inter=instance.intersection(otro);
        boolean result = instance.intersection(otro).equals(res);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of equals method, of class ArraySet.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        ArraySet<String> instance = new ArraySet();
        instance.add("1");
        instance.add("2");
        ArraySet<String> otro=new ArraySet();
        otro.add("1");
        otro.add("2");
        boolean result = instance.equals(otro);
        System.out.println(instance.equals(otro));
//        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of iterator method, of class ArraySet.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        ArraySet instance = new ArraySet();
        Iterator expResult =instance.iterator();
        Iterator result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of resta method, of class ArraySet.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        ArraySet instance = new ArraySet();
        instance.add("!");
        instance.add("1");
        ArraySet restante=new ArraySet();
        restante.add("1");
        ArraySet nuevo=new ArraySet();
        nuevo.add("!");
        SetADT result = instance.resta(restante);
        boolean res=nuevo.equals(result);
        assertTrue(res);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
