/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Orn
 */
public class ReviewTest {
    private Review review;
    public ReviewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        review = new Review("Snilld!", "Karl", "besta ferð allra tíma", 
            5.0, "11-04-2015", 1);
    }
    
    @After
    public void tearDown() {
        review = null;
    }

    /**
     * Test of getLegend method, of class Review.
     */
    @Test
    public void testGetLegend() {
        System.out.println("getLegend");
        Review instance = review;
        String expResult = "Snilld!";
        String result = instance.getLegend();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of setLegend method, of class Review.
     */
    @Test
    public void testSetLegend() {
        System.out.println("setLegend");
        String legend = "Snilld!";
        Review instance = review;
        instance.setLegend(legend);

    }

    /**
     * Test of getOwner method, of class Review.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Review instance = review;
        String expResult = "Karl";
        String result = instance.getOwner();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setOwner method, of class Review.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        String owner = "Karl";
        Review instance = review;
        instance.setOwner(owner);

    }

    /**
     * Test of getContent method, of class Review.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Review instance = review;
        String expResult = "besta ferð allra tíma";
        String result = instance.getContent();
        assertEquals(expResult, result);

    }

    /**
     * Test of setContent method, of class Review.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "besta ferð allra tíma";
        Review instance = review;
        instance.setContent(content);

    }

    /**
     * Test of getStars method, of class Review.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Review instance = review;
        double expResult = 5.0;
        double result = instance.getStars();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setStars method, of class Review.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        double stars = 5.0;
        Review instance = review;
        instance.setStars(stars);
        
    }

    /**
     * Test of getDate method, of class Review.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Review instance = review;
        String expResult = "11-04-2015";
        String result = instance.getDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDate method, of class Review.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "11-04-2015";
        Review instance = review;
        instance.setDate(date);
        
    }

    /**
     * Test of getID method, of class Review.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Review instance = review;
        int expResult = 1;
        int result = instance.getID();
        assertEquals(expResult, result);
        
    }

    
}
