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
    //Search by hotelPickupAvailable
    public DayTours[] search(boolean hotelPickupAvailable){
        return mainSearch.searchDayTours(hotelPickupAvailable);
    }
    //Search by price and ageRestriction
    public DayTours[] search(int param1, int param2, int ageRestriction){
        Search newSearch = new Search(mainSearch.searchDayTours("price", param1, param2));
        return newSearch.searchDayTours("age", ageRestriction);
    }
    
    public void bookDayTours(DayTours dayTour, int adults, int children, String hotelLocation){
        shoppingCart.addTour(dayTour.getID(), adults, children, true, hotelLocation );
    }
    
    public void bookDayTours(DayTours dayTour, int adults, int children){
        shoppingCart.addTour(dayTour.getID(), adults, children, false, "N/A" );
    }
    
}
