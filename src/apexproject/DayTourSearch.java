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
    public DayTourSearch(){
        
    }
    
    public DayTours[] search(int param1, int param2){
        return mainSearch.searchDayTours("price", param1, param2);
    }
    
    public void bookDayTours(DayTours dayTour){
        
    }
    
}
