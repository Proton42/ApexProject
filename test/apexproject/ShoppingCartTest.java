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
public class ShoppingCartTest {
    DayTours dayTour1;
    DayTours dayTour2;
    DayTours dayTour3;
    DayTours[] dayTours;
    ShoppingCart shoppingCart;
    public ShoppingCartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart();
        
        dayTours = new DayTours[3];
        
        dayTours[0] = new DayTours("Gönguferð", "Skemmtileg gönguferð", 14300,
        0, "0600", "0600-0800", "mon,wed,fri",true,0.8, "11-06-2015", 4.8, "SV", 0);
        
        dayTours[1] = new DayTours("Fjallganga", "Skemmtileg fjallganga", 10000,
        1, "0800", "0800-1200", "mon,wed,fri",true,0.5, "13-06-2015", 4.0, "N", 1);
        
        dayTours[2] = new DayTours("Gullfoss og Geysir", "Skemmtileg gullhringsferð", 150000,
        -1, "1000", "1000-1400", "mon,wed,fri",false,0.7, "20-07-2015", 4.8, "SV", 2);
        
    }
    
    @After
    public void tearDown() {
        dayTours = null;
    }

    /**
     * Test of getChosenTours method, of class ShoppingCart.
     */
    @Test
    public void testGetChosenTours() {
        System.out.println("getChosenTours");
        ShoppingCart instance = new ShoppingCart();
        DayTours[] expResult = dayTours;
        DayTours[] result = instance.getChosenTours();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTour method, of class ShoppingCart.
     */
    @Test
    public void testAddTour() {
        System.out.println("addTour");
        int tourID = 0;
        int adults = 0;
        int children = 0;
        boolean hotelPickupRequested = false;
        String hotelLocation = "";
        ShoppingCart instance = new ShoppingCart();
        instance.addTour(tourID, adults, children, hotelPickupRequested, hotelLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTour method, of class ShoppingCart.
     */
    @Test
    public void testRemoveTour() {
        System.out.println("removeTour");
        int tour = 0;
        ShoppingCart instance = new ShoppingCart();
        instance.removeTour(tour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPrice method, of class ShoppingCart.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        ShoppingCart instance = new ShoppingCart();
        int expResult = 0;
        int result = instance.getTotalPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPrice method, of class ShoppingCart.
     */
    @Test
    public void testSetTotalPrice() {
        System.out.println("setTotalPrice");
        int totalPrice = 0;
        ShoppingCart instance = new ShoppingCart();
        instance.setTotalPrice(totalPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payForTours method, of class ShoppingCart.
     */
    @Test
    public void testPayForTours() {
        System.out.println("payForTours");
        String buyerName = "";
        ShoppingCart instance = new ShoppingCart();
        Reservation[] expResult = null;
        Reservation[] result = instance.payForTours(buyerName);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
