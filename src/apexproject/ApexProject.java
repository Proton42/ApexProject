/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apexproject;

import apexproject.data.DataBaseHandler;

/**
 *
 * @author Orn
 */
public class ApexProject {
    private static DayTours[] searchResults;
    private static Search searchClass = new Search();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        searchResults = searchClass.searchDayTours( "16:00" );
        System.out.println("Hér koma niðurstöður:");
        if(searchResults != null){
            for(int i = 0; i < searchResults.length; i++){
                System.out.println(searchResults[i].getName());
        }
        }

    }
    
}
