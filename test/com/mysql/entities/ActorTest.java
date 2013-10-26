/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql.entities;

import java.util.Collection;
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
public class ActorTest {
    
    public ActorTest() {
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
     * Test of getActorId method, of class Actor.
     */
    @Test
    public void testGetActorId() {
        System.out.println("getActorId");
        Actor instance = new Actor();
        Short expResult = null;
        Short result = instance.getActorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActorId method, of class Actor.
     */
    @Test
    public void testSetActorId() {
        System.out.println("setActorId");
        Short actorId = null;
        Actor instance = new Actor();
        instance.setActorId(actorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Actor.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Actor instance = new Actor();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Actor.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Actor instance = new Actor();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Actor.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Actor instance = new Actor();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Actor.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Actor instance = new Actor();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdate method, of class Actor.
     */
    @Test
    public void testGetLastUpdate() {
        System.out.println("getLastUpdate");
        Actor instance = new Actor();
        Date expResult = null;
        Date result = instance.getLastUpdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdate method, of class Actor.
     */
    @Test
    public void testSetLastUpdate() {
        System.out.println("setLastUpdate");
        Date lastUpdate = null;
        Actor instance = new Actor();
        instance.setLastUpdate(lastUpdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmActorCollection method, of class Actor.
     */
    @Test
    public void testGetFilmActorCollection() {
        System.out.println("getFilmActorCollection");
        Actor instance = new Actor();
        Collection expResult = null;
        Collection result = instance.getFilmActorCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmActorCollection method, of class Actor.
     */
    @Test
    public void testSetFilmActorCollection() {
        System.out.println("setFilmActorCollection");
        Collection<FilmActor> filmActorCollection = null;
        Actor instance = new Actor();
        instance.setFilmActorCollection(filmActorCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Actor.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Actor instance = new Actor();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Actor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Actor instance = new Actor();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Actor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Actor instance = new Actor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}