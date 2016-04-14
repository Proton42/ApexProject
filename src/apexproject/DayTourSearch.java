/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

/**
 *
 * @author Orn
 */
public class DayTourSearch {
    Search mainSearch = new Search();
    DayTours[] searchResults;
    ShoppingCart shoppingCart = new ShoppingCart();
    public DayTourSearch(){
        
    }
    
    //Search by price
    public DayTours[] search(int param1, int param2){
        return mainSearch.searchDayTours("price", param1, param2);
    }
    //Search by ageRestriction
    public DayTours[] search(String sortBy, int ageRestriction){
        return mainSearch.searchDayTours("ageRestriction", ageRestriction);
    }
    //Search by location
    public DayTours[] search(String something, String location){
        return mainSearch.searchDayTours(something, location);
    }
    //Search by stars
    public DayTours[] search(double stars){
        return mainSearch.searchDayTours(stars);
    }
    //Search by departure time
    public DayTours[] search(String departureTime){
        return mainSearch.searchDayTours(departureTime);
    }
    //Search by seats available
    public DayTours[] search(int seatsAvailable){
        return mainSearch.searchDayTours(seatsAvailable);
    }
    //Search by seats available
    public DayTours[] search(boolean[] daysOfWeek){
        return mainSearch.searchDayTours(daysOfWeek);
    }
    //Search by price and ageRestriction
    public DayTours[] search(int lowPrice, int highPrice, int ageRestriction){
        Search newSearch = new Search(mainSearch.searchDayTours("price", lowPrice, highPrice));
        return newSearch.searchDayTours("age", ageRestriction);
    }
    
    //Book a tour with hotel pickup
    public void bookDayTour(DayTours dayTour, int adults, int children, String hotelLocation){
        shoppingCart.addTour(dayTour, adults, children, true, hotelLocation );
    }
    //Book a tour without hotel pickup
    public void bookDayTour(DayTours dayTour, int adults, int children){
        shoppingCart.addTour(dayTour, adults, children, false, "N/A" );
    }
    //Submitting all bookings
    public void confirmBookings(String buyerName){
        shoppingCart.payForTours(buyerName);
    }
    
}
