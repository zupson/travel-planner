/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

/**
 *
 * @author marko
 */
public final class Destination {
    
    private int id;
    private String name;
    private String description;
    private int activityID;
    private int CityID;

    public Destination(int id, String name, String description, int activityID, int CityID) {
        this(name, description, activityID, CityID);
        setId(id);
    }

    public Destination(String name, String description, int activityID, int CityID) {
        setName(name);
        setDescription(description);
        setActivityID(activityID);
        setCityID(CityID);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int activityID) {
        this.activityID = activityID;
    }

    public int getCityID() {
        return CityID;
    }

    public void setCityID(int CityID) {
        this.CityID = CityID;
    }

    @Override
    public String toString() {
        return "Destination{" + "id=" + id + ", name=" + name + ", description=" + description + ", activityID=" + activityID + ", CityID=" + CityID + '}';
    }

}
