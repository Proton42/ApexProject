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
     * Test of addTour method, of class ShoppingCart.
     */
    @Test
    public void testAddTour() {
        System.out.println("addTour");
        int[] tourID = {1,2,3};
        int[] adults = {1,2,3};
        int[] children = {1,2,3};
        boolean[] hotelPickupRequested = {true,false,true};
        String[] hotelLocation = {"1","2","3"};
        ShoppingCart instance = shoppingCart;
        for(int i = 0;i<3;i++){
            instance.addTour(tourID[i],adults[i],children[i],hotelPickupRequested[i],hotelLocation[i]);
        }
        assertArrayEquals(tourID,instance.chosenTours);
        assertArrayEquals(adults,instance.nrOfAdults);
        assertArrayEquals(children,instance.nrOfChildren);
        assertArrayEquals(hotelPickupRequested,instance.hotelPickupRequested);
        assertArrayEquals(hotelLocation,instance.hotelLocation);

    }

    @Test
    public void testRemoveTour() {
        int[] tourID = {1,2,3,4};
        int[] adults = {1,2,3,4};
        int[] children = {1,2,3,4};
        boolean[] hotelPickupRequested = {true,false,true,false};
        String[] hotelLocation = {"1","2","3","4"};
        ShoppingCart instance = shoppingCart;
        for(int i = 0;i<4;i++){
            instance.addTour(tourID[i],adults[i],children[i],hotelPickupRequested[i],hotelLocation[i]);
        }

        System.out.println("removeTour");
        int tour1 = 3;
        int tour2 = 1;
        assertArrayEquals(new int[]{1,2,3,4},instance.chosenTours);
        instance.removeTour(tour1);

        instance.removeTour(tour2);
        
        assertArrayEquals(new int[]{2,4},instance.chosenTours);
        assertArrayEquals(new int[]{2,4},instance.nrOfAdults);
        assertArrayEquals(new int[]{2,4},instance.nrOfChildren);
        assertArrayEquals(new boolean[]{false,false},instance.hotelPickupRequested);
        assertArrayEquals(new String[]{"2","4"},instance.hotelLocation);
    }


}
