package com.cogni;

interface Ticket
{
	public float bookTicket(String source, String destination);
}

public class LamExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket = (source,destination)->{
			System.out.println("Train Ticket Booked from "+source+" To "+destination);
			float price_of_tkt = 500;
			return price_of_tkt;
		};
		System.out.println(ticket.bookTicket("BBSR","Bangaluru"));
		
	}

}
