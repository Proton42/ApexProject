/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

import apexproject.data.DataBaseHandler;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class Search {
    DataBaseHandler dataBase = new DataBaseHandler();
    DayTours[] dayTours = dataBase.getDayTours();
    DayTours[] searchResults;
    int numberOfDayTours = dayTours.length;
    
    public Search(){
    }
    
    public Search(DayTours[] dayTours){
        this.dayTours = dayTours;
    }
    //Search by price
    public DayTours[] searchDayTours(String sortBy, int parameter1, int parameter2){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getPrice() >= parameter1 && dayTours[i].getPrice() <= parameter2){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    //Searches by ageRestriction
    public DayTours[] searchDayTours(String sortBy, int ageRestriction){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].getAgeRestriction() <= ageRestriction){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    /*
    public DayTours[] searchDayTours(String startingTime){
        for(int i = 0; i< numberOfDayTours;i++){
            String time = dayTours[i].getDepartureTime();
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3, 5));
            if(dayTours[i].get <= ageRestriction){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
*/
    //Search by if hotelpickup is available
    public DayTours[] searchDayTours(boolean hotelPickupAvailable){
        for(int i = 0; i< numberOfDayTours;i++){
            if(dayTours[i].isHotelPickupAvailable() == hotelPickupAvailable){
                searchResults = ArrayUtils.add(searchResults,dayTours[i]);
            }
        }
        return searchResults;
    }
    
}
