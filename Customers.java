class Customers{



      private int customerId;
      private String firstName;
	  private String middleName;
	  private String lastName;
	  private String email;
	  private long phoneNumber;
	  private String dob;
	  private String adress;
	  
	  
	 //getter and setter
        
		
		// setter for customerId
		public void setAdress(String adress){
			this.adress = adress;
		}
		 
		 //getter for customerId
		public String getAdress(){
			return adress;
		}
		
		public void setDob(String dob){
			this.dob = dob;
		}
		public String getDob(){
			return dob;
		}
		
		public void setEmail(String email){
			this.email = email;
		}
		public String getEmail(){
			return email;
		}
			
		
		
       public void setCustomerId(int customerId){
      this.customerId = customerId;
	  }
       public int getCustomerId(){
		   return customerId;
		   }
	  }