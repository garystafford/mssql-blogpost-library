/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mysql.entities;

import java.math.BigDecimal;
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
public class FilmTest {
    
    public FilmTest() {
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
     * Test of getFilmId method, of class Film.
     */
    @Test
    public void testGetFilmId() {
        System.out.println("getFilmId");
        Film instance = new Film();
        Short expResult = null;
        Short result = instance.getFilmId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmId method, of class Film.
     */
    @Test
    public void testSetFilmId() {
        System.out.println("setFilmId");
        Short filmId = null;
        Film instance = new Film();
        instance.setFilmId(filmId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Film.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Film instance = new Film();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Film.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Film instance = new Film();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Film.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Film instance = new Film();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Film.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Film instance = new Film();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReleaseYear method, of class Film.
     */
    @Test
    public void testGetReleaseYear() {
        System.out.println("getReleaseYear");
        Film instance = new Film();
        Date expResult = null;
        Date result = instance.getReleaseYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReleaseYear method, of class Film.
     */
    @Test
    public void testSetReleaseYear() {
        System.out.println("setReleaseYear");
        Date releaseYear = null;
        Film instance = new Film();
        instance.setReleaseYear(releaseYear);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentalDuration method, of class Film.
     */
    @Test
    public void testGetRentalDuration() {
        System.out.println("getRentalDuration");
        Film instance = new Film();
        short expResult = 0;
        short result = instance.getRentalDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentalDuration method, of class Film.
     */
    @Test
    public void testSetRentalDuration() {
        System.out.println("setRentalDuration");
        short rentalDuration = 0;
        Film instance = new Film();
        instance.setRentalDuration(rentalDuration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentalRate method, of class Film.
     */
    @Test
    public void testGetRentalRate() {
        System.out.println("getRentalRate");
        Film instance = new Film();
        BigDecimal expResult = null;
        BigDecimal result = instance.getRentalRate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRentalRate method, of class Film.
     */
    @Test
    public void testSetRentalRate() {
        System.out.println("setRentalRate");
        BigDecimal rentalRate = null;
        Film instance = new Film();
        instance.setRentalRate(rentalRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Film.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Film instance = new Film();
        Short expResult = null;
        Short result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Film.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        Short length = null;
        Film instance = new Film();
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReplacementCost method, of class Film.
     */
    @Test
    public void testGetReplacementCost() {
        System.out.println("getReplacementCost");
        Film instance = new Film();
        BigDecimal expResult = null;
        BigDecimal result = instance.getReplacementCost();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReplacementCost method, of class Film.
     */
    @Test
    public void testSetReplacementCost() {
        System.out.println("setReplacementCost");
        BigDecimal replacementCost = null;
        Film instance = new Film();
        instance.setReplacementCost(replacementCost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRating method, of class Film.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        Film instance = new Film();
        String expResult = "";
        String result = instance.getRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRating method, of class Film.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String rating = "";
        Film instance = new Film();
        instance.setRating(rating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecialFeatures method, of class Film.
     */
    @Test
    public void testGetSpecialFeatures() {
        System.out.println("getSpecialFeatures");
        Film instance = new Film();
        String expResult = "";
        String result = instance.getSpecialFeatures();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecialFeatures method, of class Film.
     */
    @Test
    public void testSetSpecialFeatures() {
        System.out.println("setSpecialFeatures");
        String specialFeatures = "";
        Film instance = new Film();
        instance.setSpecialFeatures(specialFeatures);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastUpdate method, of class Film.
     */
    @Test
    public void testGetLastUpdate() {
        System.out.println("getLastUpdate");
        Film instance = new Film();
        Date expResult = null;
        Date result = instance.getLastUpdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastUpdate method, of class Film.
     */
    @Test
    public void testSetLastUpdate() {
        System.out.println("setLastUpdate");
        Date lastUpdate = null;
        Film instance = new Film();
        instance.setLastUpdate(lastUpdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalLanguageId method, of class Film.
     */
    @Test
    public void testGetOriginalLanguageId() {
        System.out.println("getOriginalLanguageId");
        Film instance = new Film();
        Language expResult = null;
        Language result = instance.getOriginalLanguageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOriginalLanguageId method, of class Film.
     */
    @Test
    public void testSetOriginalLanguageId() {
        System.out.println("setOriginalLanguageId");
        Language originalLanguageId = null;
        Film instance = new Film();
        instance.setOriginalLanguageId(originalLanguageId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLanguageId method, of class Film.
     */
    @Test
    public void testGetLanguageId() {
        System.out.println("getLanguageId");
        Film instance = new Film();
        Language expResult = null;
        Language result = instance.getLanguageId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLanguageId method, of class Film.
     */
    @Test
    public void testSetLanguageId() {
        System.out.println("setLanguageId");
        Language languageId = null;
        Film instance = new Film();
        instance.setLanguageId(languageId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmActorCollection method, of class Film.
     */
    @Test
    public void testGetFilmActorCollection() {
        System.out.println("getFilmActorCollection");
        Film instance = new Film();
        Collection expResult = null;
        Collection result = instance.getFilmActorCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmActorCollection method, of class Film.
     */
    @Test
    public void testSetFilmActorCollection() {
        System.out.println("setFilmActorCollection");
        Collection<FilmActor> filmActorCollection = null;
        Film instance = new Film();
        instance.setFilmActorCollection(filmActorCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Film.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Film instance = new Film();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Film.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Film instance = new Film();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Film.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Film instance = new Film();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}