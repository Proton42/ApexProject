
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apexproject.data;

import apexproject.DayTours;

/**
 *
 * @author Jökull Jóhannsson, Háskóli Íslands, jokullj@gmail.com
 */
public class DayTourGogn {
    
  public DayTourGogn () {
        String[][] gogn = {
        {"Northern Lights Tour","See the magic of the northern lights in this excellent evening tour","9900", "-1", "18:30", "6 hours", "Monday,Thursday,Saturday", "TRUE", "-1", "", "-1", "Southwest","50"},
        {"Blue Lagoon Tour", "The most famous tourist attraction in Iceland. Known for its skin healing powers","99000", "-1", "09:20", "4 hours", "Monday,Tuesday,Wednesday,Thursday,Friday,Staurday,Sunday", "TRUE", "-1", "", "-1","Southwest","150"},
        {"The Golden Circle","World famous Geysir and the incredible Gullfoss all in one trip","20000","-1","09:00","4 hours", "Monday,Tuesday,Wednesday,Thursday,Friday,Staurday","TRUE","-1","","-1","Reykjavík","250"},
        {"Reykjavik Walking Tour","Take to the streets of Reykjavík and be amazed","-1","15:00","90 mins","Monday,Tuesday,Wednesday,Thursday,Friday","FALSE","-1","","-1","Reykjavík","25"},
	{"4*4 MonsterTruck Glacier Awesomness","Ride a heavily modified truck on top of a glacier. Nuff said","59900","-1","09:00","10 hours","Monday,Wednesday,Friday","TRUE","-1","","-1","Southwest","12"},
	{"Cave Hopping","The Reykjanes has a lot of little known caves worth exploring","15900","18","09:00","6 hours","Sundays","TRUE","-1","","-1","Southwest","25"},
	{"Sub-bars","Visit the local bars in different suburbs of Reykjavík and experience real icelandic culture. Afterparty optional.","9900","20","17:00","12 hours","Thursday,Friday,Saturday","TRUE","-1","","-1","Reykjavík","230"},
	{"Laugavegurinn - Hiking Trail","Experience the incredible landscape of the icelandic highlands on this epic trail","69900","14","09:00","5 days","Monday,Friday","TRUE","-1","","-1","West","15"},
	{"Whalewatching","The magnificent sight of a Minkeewhale will leave you breathless and astound.","29000","-1","10:00","6 hours","Monday,Wednesday,Friday","TRUE","-1","","-1","Southwest","100"},
	{"Best of the east","Visit Kárahnjúkar, learn about the icelandic Lochness monster{Lagarfljótsormurinn} and visit Seyðisfjörður","14900","-1","10:00","6 hours","Sunday","TRUE","-1","","-1","East","99"},
	{"Kaldi Brewery","Visit the first successful microbrewery in Iceland and get drunk.","15990","20","16:00","6 hours","Wednesday,Thursday,Friday","TRUE","-1","","-1","North","40"},
	{"Strandir Hiking Trail","The landscape at Strandir is one to die for. One of the most remote hiking trail in Iceland.","25900","16","07:30","6 days","Monday","TRUE","-1","","-1","Northwest","25"}
        };
    System.out.println(gogn.length);
  }    
    
    
}
