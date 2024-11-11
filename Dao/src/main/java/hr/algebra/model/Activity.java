/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author marko
 */
public final class Activity {
    private static DateTimeFormatter DATE_TIME = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
 
    private int id;
    private String name;
    private LocalDateTime date;
    private double price;

    public Activity(int id, String name, LocalDateTime date, double price) {
        this(name, date, price);
        setId(id);
    }

    public Activity(String name, LocalDateTime date, double price) {
        setName(name);
        setDate(date);
        setPrice(price);
    }

    public static DateTimeFormatter getDATE_TIME() {
        return DATE_TIME;
    }

    public static void setDATE_TIME(DateTimeFormatter DATE_TIME) {
        Activity.DATE_TIME = DATE_TIME;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Activity{" + "id=" + id + ", name=" + name + ", date=" + date + ", price=" + price + '}';
    }
}
