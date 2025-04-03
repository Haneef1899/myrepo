package com.tnsif.Assignment;

public class MovieTicketBooking {
  static int availableTickets=10;
  
  public static void bookTicket(int tickets) {
	  if(tickets>availableTickets) {
		  System.out.println("Sorry tickets are unavailable");
		  
	  }else {
		  availableTickets-=tickets;
		  System.out.println(tickets+"ticket(s) booked successfully");
		  System.out.println("Tickets left:"+availableTickets);
	  }
  }
} 
