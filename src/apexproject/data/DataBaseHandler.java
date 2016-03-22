/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject.data;

import apexproject.DayTours;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Orn
 */
public class DataBaseHandler {
    private DayTours[] dayTours;
    private DayTours dayTour;
    private int index;
    
    public DataBaseHandler(){
        index = 0;
    }
    
    public DayTours[] getDayTours(){
        return dayTours;
    }
    
    public void addDayTour(String name, String description, int price,
        int ageRestriction, String departureTime, String duration, String daysOfWeek,
        boolean hotelPickupAvailable,float ratioOfSeatsSold, String date, float stars,
        String location){
        dayTour = new DayTours(name,description,price, ageRestriction, departureTime, duration,
                daysOfWeek, hotelPickupAvailable, ratioOfSeatsSold, date, stars, location);
        ArrayUtils.add(dayTours, dayTours.length, dayTour);
    }
    
    public void removeDayTour(DayTours dayTour){
        index = ArrayUtils.indexOf(dayTours, dayTour);
        if(index>=0){
            ArrayUtils.remove(dayTours, index);
        }
    }
    
    public int getNumberOfDayTours(){
        return dayTours.length;
    }
    
    public DayTours getTourWithID(int ID){
        for(int i = 0; i< dayTours.length; i++){
            if(dayTours[i].getID() == ID){
                return dayTours[i];
            }
        }
        return null;
    }
}
