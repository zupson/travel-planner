/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.utilities;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author marko
 */
public class PasswordUtils {

    public PasswordUtils() {
    }
    
    public static String hashPassword(String password){
        return BCrypt.withDefaults().hashToString(12, password.toCharArray());
    }
    
//    public static boolean checkPassword(String password, String hashedPassword){
//        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
//        return result.verified;
//    }  PROVJERI DI ISKORITITI OVU METODU!
}