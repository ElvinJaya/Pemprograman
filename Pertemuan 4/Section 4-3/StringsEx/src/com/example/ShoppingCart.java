/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;

/**
 *
 * @author anshenoy
 */
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String middleName,lastName;
        
        int spaceIdx = custName.indexOf(" ");
        System.out.println("Index od Space character is" +spaceIdx);
        
        // Get the index of the space character (" ") in custName. 
        String firstName = custName.substring(0,5);
        System.out.println("My first name is"+ firstName);

        // Use the substring method parse out the first name and print it.

         firstName = JOptionPane.showInputDialog(null, "Your first name");
        middleName = JOptionPane.showInputDialog(null, "Your midlle name");
        lastName = JOptionPane.showInputDialog(null, "Your last name");
        
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("fullName");

    }

    
}
