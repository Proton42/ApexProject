/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class ShoppingCart {
    private DayTours[] chosenTours;
    private int[] nrOfAdults;
    private int[] nrOfChildren;
    private int totalPrice;
    private int index;
    private String buyerName;
    private boolean[] hotelPickupRequested;
    private String[] hotelLocation;
    private Reservation[] shoppingCart;
    
    
    public ShoppingCart(){
        index = 0;
    }

    /**
     * @return the chosenTours
     */
    public DayTours[] getChosenTours() {
        return chosenTours;
    }

    public void addTour(int tourID, int adults, int children, boolean hotelPickupRequested, String hotelLocation){
        ArrayUtils.add(this.chosenTours, chosenTours.length, tourID);
        ArrayUtils.add(this.nrOfAdults, adults);
        ArrayUtils.add(this.nrOfChildren, children);
        ArrayUtils.add(this.nrOfChildren, children);
        ArrayUtils.add(this.hotelPickupRequested, hotelPickupRequested);
        ArrayUtils.add(this.hotelLocation, hotelLocation);
        
        
    }
    
    public void removeTour(int tour){
        index = ArrayUtils.indexOf(chosenTours, tour);
        if(index>=0){
            ArrayUtils.remove(chosenTours, index);
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
    
    public Reservation[] payForTours(String buyerName){
        
        for(int i = 0; i <= chosenTours.length; i++){
            
            shoppingCart[i] = new Reservation(chosenTours[i], buyerName, nrOfAdults[i],nrOfChildren[i],hotelPickupRequested[i],hotelLocation[i]);
        }
        return shoppingCart;
    }
}
