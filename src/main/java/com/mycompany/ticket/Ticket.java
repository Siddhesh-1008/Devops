/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticket;

/**
 *
 * @author Siddhesh
 */
public class Ticket {

    int ticketNo;
    String start;
    String destination;
    String passengerName;

    public Ticket(int ticketNo, String start, String destination, String passengerName) {
        this.ticketNo = ticketNo;
        this.start = start;
        this.destination = destination;
        this.passengerName = passengerName;
    }

    public void cancelTicket() {
        System.out.println("Ticket Cancelled");
    }
}