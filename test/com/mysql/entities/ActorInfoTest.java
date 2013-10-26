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
public class ActorInfoTest {
    
    public ActorInfoTest() {
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
     * Test of getActorId method, of class ActorInfo.
     */
    @Test
    public void testGetActorId() {
        System.out.println("getActorId");
        ActorInfo instance = new ActorInfo();
        short expResult = 0;
        short result = instance.getActorId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActorId method, of class ActorInfo.
     */
    @Test
    public void testSetActorId() {
        System.out.println("setActorId");
        short actorId = 0;
        ActorInfo instance = new ActorInfo();
        instance.setActorId(actorId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class ActorInfo.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        ActorInfo instance = new ActorInfo();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class ActorInfo.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        ActorInfo instance = new ActorInfo();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class ActorInfo.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        ActorInfo instance = new ActorInfo();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class ActorInfo.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        ActorInfo instance = new ActorInfo();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmInfo method, of class ActorInfo.
     */
    @Test
    public void testGetFilmInfo() {
        System.out.println("getFilmInfo");
        ActorInfo instance = new ActorInfo();
        String expResult = "";
        String result = instance.getFilmInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmInfo method, of class ActorInfo.
     */
    @Test
    public void testSetFilmInfo() {
        System.out.println("setFilmInfo");
        String filmInfo = "";
        ActorInfo instance = new ActorInfo();
        instance.setFilmInfo(filmInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}