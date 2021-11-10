package com.travel.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name="destinationDetails")
@Entity(name="destinationDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationDetails extends Destination{
    @Column(name = "activities")
    private String activities;

    @Column(name = "cuisine")
    private String cuisine;

    @Column(name="places")
    private String places;

    @Column(name="weather")
    private String weather;

    @Column(name="info")
    private String info;

    @Column(name="transportation")
    private String transportation;

    @Column(name="culture")
    private String culture;

    @Column(name="money")
    private String money;

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}


