/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gstaffor
 */
public class FilmActorPKTest {
    
    public FilmActorPKTest() {
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
     * Test of getActorId method, of class FilmActorPK.
     */
    @Test
    public void testGetActorId() {
        System.out.println("getActorId");
        FilmActorPK instance = new FilmActorPK();
        short expResult = 0;
        short result = instance.getActorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActorId method, of class FilmActorPK.
     */
    @Test
    public void testSetActorId() {
        System.out.println("setActorId");
        short actorId = 0;
        FilmActorPK instance = new FilmActorPK();
        instance.setActorId(actorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmId method, of class FilmActorPK.
     */
    @Test
    public void testGetFilmId() {
        System.out.println("getFilmId");
        FilmActorPK instance = new FilmActorPK();
        short expResult = 0;
        short result = instance.getFilmId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmId method, of class FilmActorPK.
     */
    @Test
    public void testSetFilmId() {
        System.out.println("setFilmId");
        short filmId = 0;
        FilmActorPK instance = new FilmActorPK();
        instance.setFilmId(filmId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class FilmActorPK.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        FilmActorPK instance = new FilmActorPK();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FilmActorPK.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        FilmActorPK instance = new FilmActorPK();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FilmActorPK.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FilmActorPK instance = new FilmActorPK();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}