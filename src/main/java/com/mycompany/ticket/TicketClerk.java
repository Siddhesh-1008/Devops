/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticket;

/**
 *
 * @author Siddhesh
 */
public class TicketClerk {

    String name;
    String location;

    public TicketClerk(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void reserveTicket() {
        System.out.println("Ticket reserved by clerk");
    }
}
