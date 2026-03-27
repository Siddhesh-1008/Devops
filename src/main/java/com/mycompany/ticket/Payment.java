/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticket;

/**
 *
 * @author Siddhesh
 */
public class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        System.out.println("Payment Done: " + amount);
    }
}