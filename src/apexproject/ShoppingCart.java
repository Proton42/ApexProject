/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

import java.util.Arrays;
import java.util.Scanner;
   
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class ShoppingCart {
    public int[] chosenTours;
    public int[] nrOfAdults;
    public int[] nrOfChildren;
    private int totalPrice;
    private int index;
    private String buyerName;
    public boolean[] hotelPickupRequested;
    public String[] hotelLocation;
    private Reservation[] shoppingCart;
    
    
    public ShoppingCart(){
        index = 0;
    }

    /**
     * @return the chosenTours
     */
    public int[] getChosenToursID() {
        return chosenTours;
    }

    public void addTour(int dayTour, int adults, int children, boolean hotelPickupRequested, String hotelLocation){
        this.chosenTours = ArrayUtils.add(this.chosenTours, dayTour);
        //this.chosenTours[0] = dayTour;
        this.nrOfAdults = ArrayUtils.add(this.nrOfAdults, adults);
        this.nrOfChildren = ArrayUtils.add(this.nrOfChildren, children);
        this.hotelPickupRequested = ArrayUtils.add(this.hotelPickupRequested, hotelPickupRequested);
        this.hotelLocation = ArrayUtils.add(this.hotelLocation, hotelLocation);
    }
    
    public void removeTour(int tour){
        index = ArrayUtils.indexOf(chosenTours, tour);
        if(index>=0){
            this.chosenTours = ArrayUtils.remove(chosenTours, index);
            this.nrOfAdults = ArrayUtils.remove(nrOfAdults, index);
            this.nrOfChildren = ArrayUtils.remove(nrOfChildren, index);
            this.hotelPickupRequested = ArrayUtils.remove(hotelPickupRequested, index);
            this.hotelLocation = ArrayUtils.remove(hotelLocation, index);
        }
        //LAGA ÞETTA
        else if(index < 0){
            System.out.println("Listinn er tómur!");
        }
        else{
            System.out.println("Enginn dayTour með þetta ID");
        }
    }
    
    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    /*
    
    //chosenTours er in en ekki DayTours, þurfum að kalla á fallið getTourWithID í databasehandler með id í chosenTours
    public Reservation[] payForTours(String buyerName){
        
        for(int i = 0; i < chosenTours.length; i++){
            
            shoppingCart[i] = new Reservation(chosenTours[i], buyerName, nrOfAdults[i],nrOfChildren[i],hotelPickupRequested[i],hotelLocation[i]);
        }
        return shoppingCart;
    }
    */
}
