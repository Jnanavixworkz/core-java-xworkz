class CustomersTester{
  
  
  public static void main(String args[]){
      
	  
	  Customers customers = new Customers();
	    
		
		customers.setCustomerId(1);
		customers.setAdress("Mandya");
		customers.setDob("16-04-2001");
		customers.setEmail("jaanu@gmail.com");
		
		System.out.println(customers.getCustomerId() + " " + customers.getAdress() + " " + customers.getDob() + " " + customers.getEmail());
		
		
}
}