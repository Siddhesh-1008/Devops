/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticket;

/**
 *
 * @author Siddhesh
 */
public class MainApp {

    public static void main(String[] args) {

        Passenger p = new Passenger("Siddhesh", 22, "Mumbai");
        Train t = new Train("Express", 101);
        Ticket ticket = new Ticket(1, "Mumbai", "Pune", "Siddhesh");
        Payment pay = new Payment(500);

        p.searchTrains();
        p.reserveSeat();

        pay.makePayment();

        System.out.println("Ticket Booked Successfully!");
    }
}
