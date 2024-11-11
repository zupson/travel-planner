/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

import hr.algebra.utilities.PasswordUtils;

/**
 *
 * @author marko
 */
public final class Person {
    
    private int id ;
    private String firstName;
    private String lastName;
    private String email;
    private String  username;
    private String password;//mora se hashirati!! NAPRAVI UTILITI I ISKORITI GA
    private int roleID;

    public Person(int id, String firstName, String lastName, String email, String username, String password, int roleID) {
        this(firstName, lastName, email, username, password, roleID);
        setId(id);
    }

    public Person(String firstName, String lastName, String email, String username, String password, int roleID) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUsername(username);
        setPassword(password);
        setRoleID(roleID);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordUtils.hashPassword(password);
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username=" + username + ", password=" + password + ", roleID=" + roleID + '}';
    }
}
