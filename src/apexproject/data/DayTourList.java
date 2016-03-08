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
public class DayTourList {
    private DayTours[] dayTourList;
    private int index;
    
    public DayTourList(){
        index = 0;
    }
    
    public DayTours[] getDayTours(){
        return dayTourList;
    }
    
    public void addDayTour(DayTours dayTour){
        ArrayUtils.add(dayTourList, dayTourList.length, dayTour);
    }
    
    public void removeDayTour(DayTours dayTour){
        index = ArrayUtils.indexOf(dayTourList, dayTour);
        if(index>=0){
            ArrayUtils.remove(dayTourList, index);
        }
    }
    
    public int getNumberOfDayTours(){
        return dayTourList.length;
    }
    
    public DayTours getTourWithID(int ID){
        for(int i = 0; i< dayTourList.length; i++){
            if(dayTourList[i].getID() == ID){
                return dayTourList[i];
            }
        }
        return null;
    }
}
