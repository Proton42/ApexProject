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
public class DayTours {


private String name;
private String description;
private int seatsAvailable;
private int price;
private int ageRestriction;
private String departureTime;
private String duration;
private String daysOfWeek;
private boolean hotelPickupAvailable;
private float ratioOfSeatsSold;
private String date;
private float stars;
private String location;
private int ID;


    public DayTours(int ID){
        this.ID = ID;
    }

    public DayTours(String name, String description, int price,
        int ageRestriction, String departureTime, String duration, String daysOfWeek,
        boolean hotelPickupAvailable,float ratioOfSeatsSold, String date, float stars,
        String location) {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the ageRestriction
     */
    public int getAgeRestriction() {
        return ageRestriction;
    }

    /**
     * @param ageRestriction the ageRestriction to set
     */
    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the daysOfWeek
     */
    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * @param daysOfWeek the daysOfWeek to set
     */
    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * @return the hotelPickupAvailable
     */
    public boolean isHotelPickupAvailable() {
        return hotelPickupAvailable;
    }

    /**
     * @param hotelPickupAvailable the hotelPickupAvailable to set
     */
    public void setHotelPickupAvailable(boolean hotelPickupAvailable) {
        this.hotelPickupAvailable = hotelPickupAvailable;
    }

    /**
     * @return the ratioOfSeatsSold
     */
    public float getRatioOfSeatsSold() {
        return ratioOfSeatsSold;
    }

    /**
     * @param ratioOfSeatsSold the ratioOfSeatsSold to set
     */
    public void setRatioOfSeatsSold(float ratioOfSeatsSold) {
        this.ratioOfSeatsSold = ratioOfSeatsSold;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the stars
     */
    public float getStars() {
        return stars;
    }

    /**
     * @param stars the stars to set
     */
    public void setStars(float stars) {
        this.stars = stars;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the seatsAvailable
     */
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    /**
     * @param seatsAvailable the seatsAvailable to set
     */
    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

}
