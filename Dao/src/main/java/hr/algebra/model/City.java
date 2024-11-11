/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

/**
 *
 * @author marko
 */
public final class City {
    
    private int id;
    private String name;
    private int drzavaID;

    public City(int id, String name, int drzavaID) {
        this(name, drzavaID);
        setId(id);
    }

    public City(String name, int drzavaID) {
        setName(name);
        setDrzavaID(drzavaID);
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

    public int getDrzavaID() {
        return drzavaID;
    }

    public void setDrzavaID(int drzavaID) {
        this.drzavaID = drzavaID;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name=" + name + ", drzavaID=" + drzavaID + '}';
    }
}
