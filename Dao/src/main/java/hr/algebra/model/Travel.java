/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author marko
 */
public final class Travel {
    
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    
    private int id;
    private String title;
    private LocalDateTime departureDate;
    private LocalDateTime returnDate;
    private LocalDateTime publishedDate;
    private double price;
    private int destioantionID;
    private int personID;
    private int transportID;
    private String picturePath;
    private String link;  

    //za azuriranje postojeceg
    public Travel(int id, String title, LocalDateTime departureDate, LocalDateTime returnDate, LocalDateTime publishedDate, double price, int destioantionID, int personID, int transportID, String picturePath, String link) {
        this(title, departureDate, returnDate, publishedDate, price, destioantionID, personID, transportID, picturePath, link);
        setId(id);
    }
    
    //za kreiranje novog objeka u klasi tablica
    public Travel(String title, LocalDateTime departureDate, LocalDateTime returnDate, LocalDateTime publishedDate, double price, int destioantionID, int personID, int transportID, String picturePath, String link) {
        setTitle(title);
        setDepartureDate(departureDate);
        setReturnDate(returnDate);
        setPublishedDate(publishedDate);
        setPrice(price);
        setDestioantionID(destioantionID);
        setPersonID(personID);
        setTransportID(transportID);
        setPicturePath(picturePath);
        setLink(link);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDestioantionID() {
        return destioantionID;
    }

    public void setDestioantionID(int destioantionID) {
        this.destioantionID = destioantionID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getTransportID() {
        return transportID;
    }

    public void setTransportID(int transportID) {
        this.transportID = transportID;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Travel{" + "id=" + id + ", title=" + title + ", departureDate=" + departureDate + ", returnDate=" + returnDate + ", publishedDate=" + publishedDate + ", price=" + price + ", destioantionID=" + destioantionID + ", personID=" + personID + ", transportID=" + transportID + ", picturePath=" + picturePath + ", link=" + link + '}';
    }
}
