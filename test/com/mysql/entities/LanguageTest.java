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
public class LanguageTest {
    
    public LanguageTest() {
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
     * Test of getLanguageId method, of class Language.
     */
    @Test
    public void testGetLanguageId() {
        System.out.println("getLanguageId");
        Language instance = new Language();
        Short expResult = null;
        Short result = instance.getLanguageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLanguageId method, of class Language.
     */
    @Test
    public void testSetLanguageId() {
        System.out.println("setLanguageId");
        Short languageId = null;
        Language instance = new Language();
        instance.setLanguageId(languageId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Language.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Language instance = new Language();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Language.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Language instance = new Language();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdate method, of class Language.
     */
    @Test
    public void testGetLastUpdate() {
        System.out.println("getLastUpdate");
        Language instance = new Language();
        Date expResult = null;
        Date result = instance.getLastUpdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdate method, of class Language.
     */
    @Test
    public void testSetLastUpdate() {
        System.out.println("setLastUpdate");
        Date lastUpdate = null;
        Language instance = new Language();
        instance.setLastUpdate(lastUpdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmCollection method, of class Language.
     */
    @Test
    public void testGetFilmCollection() {
        System.out.println("getFilmCollection");
        Language instance = new Language();
        Collection expResult = null;
        Collection result = instance.getFilmCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmCollection method, of class Language.
     */
    @Test
    public void testSetFilmCollection() {
        System.out.println("setFilmCollection");
        Collection<Film> filmCollection = null;
        Language instance = new Language();
        instance.setFilmCollection(filmCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmCollection1 method, of class Language.
     */
    @Test
    public void testGetFilmCollection1() {
        System.out.println("getFilmCollection1");
        Language instance = new Language();
        Collection expResult = null;
        Collection result = instance.getFilmCollection1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmCollection1 method, of class Language.
     */
    @Test
    public void testSetFilmCollection1() {
        System.out.println("setFilmCollection1");
        Collection<Film> filmCollection1 = null;
        Language instance = new Language();
        instance.setFilmCollection1(filmCollection1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Language.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Language instance = new Language();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Language.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Language instance = new Language();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Language.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Language instance = new Language();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}