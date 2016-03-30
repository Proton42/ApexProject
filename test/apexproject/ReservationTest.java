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
public class ReservationTest {
    private DayTours dayTour;
    private Reservation resVation;
    public ReservationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        DayTours dayTour = new DayTours("Gönguferð", "Skemmtileg gönguferð", 14300,
        0, "0600", "0600-0800", "mon,wed,fri",true,0.8, "11-06-2015", 4.8, "SV", 0);
        
        resVation = new Reservation(dayTour, "Árni", 2, 1, true, "Tungubakki 16");
        
    }
    
    @After
    public void tearDown() {
        dayTour = null;
        resVation = null;
    }

    /**
     * Test of getBuyerName method, of class Reservation.
     */
    @Test
    public void testGetBuyerName() {
        System.out.println("getBuyerName");
        Reservation instance = resVation;
        String expResult = "Árni";
        String result = instance.getBuyerName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Reservation.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String buyerName = "Árni";
        Reservation instance = resVation;
        instance.setName(buyerName);
        
    }

    /**
     * Test of getNrOfAdults method, of class Reservation.
     */
    @Test
    public void testGetNrOfAdults() {
        System.out.println("getNrOfAdults");
        Reservation instance = resVation;
        int expResult = 2;
        int result = instance.getNrOfAdults();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNrOfAdults method, of class Reservation.
     */
    @Test
    public void testSetNrOfAdults() {
        System.out.println("setNrOfAdults");
        int nrOfAdults = 2;
        Reservation instance = resVation;
        instance.setNrOfAdults(nrOfAdults);
        
    }

    /**
     * Test of getNrOfChildren method, of class Reservation.
     */
    @Test
    public void testGetNrOfChildren() {
        System.out.println("getNrOfChildren");
        Reservation instance = resVation;
        int expResult = 1;
        int result = instance.getNrOfChildren();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNrOfChildren method, of class Reservation.
     */
    @Test
    public void testSetNrOfChildren() {
        System.out.println("setNrOfChildren");
        int nrOfChildren = 1;
        Reservation instance = resVation;
        instance.setNrOfChildren(nrOfChildren);
        
    }

    /**
     * Test of getNameOfTour method, of class Reservation.
     */
    @Test
    public void testGetNameOfTour() {
        System.out.println("getNameOfTour");
        Reservation instance = resVation;
        String expResult = "Gönguferð";
        String result = instance.getNameOfTour();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNameOfTour method, of class Reservation.
     */
    @Test
    public void testSetNameOfTour() {
        System.out.println("setNameOfTour");
        String nameOfTour = "Gönguferð";
        Reservation instance = resVation;
        instance.setNameOfTour(nameOfTour);
    }

    /**
     * Test of isHotelPickupRequested method, of class Reservation.
     */
    @Test
    public void testIsHotelPickupRequested() {
        System.out.println("isHotelPickupRequested");
        Reservation instance = resVation;
        boolean expResult = true;
        boolean result = instance.isHotelPickupRequested();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHotelPickupRequested method, of class Reservation.
     */
    @Test
    public void testSetHotelPickupRequested() {
        System.out.println("setHotelPickupRequested");
        boolean hotelPickupRequested = true;
        Reservation instance = resVation;
        instance.setHotelPickupRequested(hotelPickupRequested);
    }

    /**
     * Test of getHotelLocation method, of class Reservation.
     */
    @Test
    public void testGetHotelLocation() {
        System.out.println("getHotelLocation");
        Reservation instance = resVation;
        String expResult = "Tungubakki 16";
        String result = instance.getHotelLocation();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHotelLocation method, of class Reservation.
     */
    @Test
    public void testSetHotelLocation() {
        System.out.println("setHotelLocation");
        String hotelLocation = "Tungubakki 16";
        Reservation instance = resVation;
        instance.setHotelLocation(hotelLocation);
        
    }
    
}
