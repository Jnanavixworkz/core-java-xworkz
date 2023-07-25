class TicketBooking{

//ticketBooking - bookingId , noOfSeats , source , destination , date , timimgs ,price , class , bookingType , transportName 

   private int bookingId;
   private int noOfSeats;
   private String source;
   private String destination;
   private int date;
   private String timimgs;
   private int price;
   private String classs;
   private String bookingType;
   private String transportName;
   
   
   public void setBookingId(int bookingId){
   this.bookingId = bookingId;
   }
   public void setNoOfSeats(int noOfSeats){
	   this.noOfSeats = noOfSeats;
   }
   public void setSource(String source){
	   this.source = source;
   }
   public void setDestination(String destination){
	   this.destination = destination;
   }
   public void setDate(int date){
	   this.date = date;
   }
   public void setTimings(String timimgs){
	   this.timimgs = timimgs;
   }
   public void setPrice(int price){
	   this.price = price;
   }
   public void setClasss(String classs){
	   this.classs = classs;
   }
   public void setBookingType(String bookingType){
	   this.bookingType = bookingType;
   }
   public void setTransportName(String transportName){
	   this.transportName = transportName;
   }
   
   public int getBookingId(){
	   return bookingId;
   }
   public int getNoOfSeats(){
	   return noOfSeats;
   }
   public String getSource(){
	   return source;
   }
   public String getDestination(){
	   return destination;
   }
   public int getDate(){
	   return date;
   }
   public String getTimings(){
	   return timimgs;
   }
   public int getPrice(){
	   return price;
   }
   public String getClasss(){
	   return classs;
   }
   public String getBookingType(){
	   return bookingType;
   }
   public String getTransportName(){
	   return transportName;
   }
}