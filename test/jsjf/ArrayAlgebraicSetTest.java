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
public class ArrayAlgebraicSetTest {
    
    public ArrayAlgebraicSetTest() {
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
     * Test of union method, of class ArrayAlgebraicSet.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        ArrayAlgebraicSet<String> instance = new ArrayAlgebraicSet();
        instance.add("1");
        instance.add("2");
        ArrayAlgebraicSet<String> other=new ArrayAlgebraicSet();
        other.add("3");
        other.add("4");
        SetADT<String> united=new ArrayAlgebraicSet();
        united=instance.union(other);
        SetADT<String> expected=new ArrayAlgebraicSet();
        expected.add("1");
        expected.add("2");
        expected.add("3");
        expected.add("4");
        boolean result = united.equals(expected);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of intersection method, of class ArrayAlgebraicSet.
     */
    @Test
    public void testIntersection() {
        System.out.println("intersection");
        ArraySet<String> instance = new ArraySet();
        instance.add("1");
        instance.add("2");
        ArraySet<String> otro=new ArraySet();
        otro.add("3");
        otro.add("1");
        ArraySet<String> res=new ArraySet();
        res.add("1");
        SetADT<String> inter=new ArraySet();
        inter=instance.intersection(otro);
        boolean result = instance.intersection(otro).equals(res);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Test of resta method, of class ArrayAlgebraicSet.
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
