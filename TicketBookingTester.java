class TicketBookingTester{

   public static void main(String args[]){
   TicketBooking ticketBooking = new TicketBooking();



     ticketBooking.setBookingId(20);
	 ticketBooking.setNoOfSeats(6);
	 ticketBooking.setSource("Mandya");
	 ticketBooking.setDestination("Bangalore");
	 ticketBooking.setDate(26-07-2023);
	 ticketBooking.setTimings("9AM");
	 ticketBooking.setPrice(450);
	 ticketBooking.setClasss("Sleeper Coach");
	 ticketBooking.setBookingType("Online");
	 ticketBooking.setTransportName("SRS transport");
	 
	 
	 System.out.println(ticketBooking.getBookingId() + " " + ticketBooking.getNoOfSeats() + " " +  ticketBooking.getSource() + " " +
	 ticketBooking.getDestination() + " " + ticketBooking.getDate() + " " + ticketBooking.getTimings() + " " + ticketBooking.getPrice()
	 + " " + ticketBooking.getClasss() + " " + ticketBooking.getBookingType() + " " + ticketBooking.getTransportName());
	 
   }
}
	 
	 