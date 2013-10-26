/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql.entities;

import java.util.Date;
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
public class FilmActorTest {
    
    public FilmActorTest() {
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
     * Test of getFilmActorPK method, of class FilmActor.
     */
    @Test
    public void testGetFilmActorPK() {
        System.out.println("getFilmActorPK");
        FilmActor instance = new FilmActor();
        FilmActorPK expResult = null;
        FilmActorPK result = instance.getFilmActorPK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmActorPK method, of class FilmActor.
     */
    @Test
    public void testSetFilmActorPK() {
        System.out.println("setFilmActorPK");
        FilmActorPK filmActorPK = null;
        FilmActor instance = new FilmActor();
        instance.setFilmActorPK(filmActorPK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdate method, of class FilmActor.
     */
    @Test
    public void testGetLastUpdate() {
        System.out.println("getLastUpdate");
        FilmActor instance = new FilmActor();
        Date expResult = null;
        Date result = instance.getLastUpdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdate method, of class FilmActor.
     */
    @Test
    public void testSetLastUpdate() {
        System.out.println("setLastUpdate");
        Date lastUpdate = null;
        FilmActor instance = new FilmActor();
        instance.setLastUpdate(lastUpdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilm method, of class FilmActor.
     */
    @Test
    public void testGetFilm() {
        System.out.println("getFilm");
        FilmActor instance = new FilmActor();
        Film expResult = null;
        Film result = instance.getFilm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilm method, of class FilmActor.
     */
    @Test
    public void testSetFilm() {
        System.out.println("setFilm");
        Film film = null;
        FilmActor instance = new FilmActor();
        instance.setFilm(film);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActor method, of class FilmActor.
     */
    @Test
    public void testGetActor() {
        System.out.println("getActor");
        FilmActor instance = new FilmActor();
        Actor expResult = null;
        Actor result = instance.getActor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActor method, of class FilmActor.
     */
    @Test
    public void testSetActor() {
        System.out.println("setActor");
        Actor actor = null;
        FilmActor instance = new FilmActor();
        instance.setActor(actor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class FilmActor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        FilmActor instance = new FilmActor();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class FilmActor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        FilmActor instance = new FilmActor();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FilmActor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FilmActor instance = new FilmActor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}