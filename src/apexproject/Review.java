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
public class Review {
    private String legend;
    private String owner;
    private String content;
    private float stars;
    private String date;

    /**
     * @return the legend
     */
    
    public Review(){}
    
    public String getLegend() {
        return legend;
    }

    /**
     * @param legend the legend to set
     */
    public void setLegend(String legend) {
        this.legend = legend;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
    
}
