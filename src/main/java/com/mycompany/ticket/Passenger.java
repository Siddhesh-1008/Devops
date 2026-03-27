/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticket;

/**
 *
 * @author Siddhesh
 */
public class Passenger {

    String name;
    int age;
    String address;

    public Passenger(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void searchTrains() {
        System.out.println("Searching trains...");
    }

    public void reserveSeat() {
        System.out.println("Seat reserved");
    }

    public void cancelTicket() {
        System.out.println("Ticket cancelled");
    }
}