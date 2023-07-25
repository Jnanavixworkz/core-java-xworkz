   class Banks{
   
   
//BANK - bankId , bankName , branch , branchCode , Adress , helplineNo , branchManager , ifscCode , miscCode , noOfLockers , noOfEmployees , timings , webSiteDetails
   
   private int bankId;
   private String bankName;
   private String branch;
   private int branchCode;
   private String adress;
   private long helplineNo;
   private String branchManager;
   private String ifscCode;
   private int noOfLockers;
   private int noOfEmployees;
   private String timings;
   private String webSiteDetails;
   
   public void setBankId(int bankId ){ 
		  this.bankId = bankId;
	   }
	   
	   public void setBankName(String bankName){ 
		  this.bankName = bankName;
	   }
	   
	   public void setBranch(String branch){ 
		  this.branch = branch;
	   }
	   
	   public void setBranchCode(int branchCode){ 
		  this.branchCode = branchCode;
	   }
	   
	   public void setAdress(String adress){ 
		  this.adress = adress;
	   }
	   
	   public void setHelplineNo(long helplineNo){ 
		  this.helplineNo = helplineNo;
	   }
	   
	   public void setBranchManager(String branchManager){ 
		  this.branchManager = branchManager;
	   }
	   
	   public void setIfscCode(String ifscCode){ 
		  this.ifscCode = ifscCode;
	   }
	   
	   public void setNoOfLockers(int noOfLockers){ 
		  this.noOfLockers = noOfLockers;
	   }
	   
	   public void setNoOfEmployees(int noOfEmployees){ 
		  this.noOfEmployees = noOfEmployees;
	   }
	   
	   public void setTimings(String timings){ 
		  this.timings = timings;
	   }
	   
	   public void setWebSiteDetails(String webSiteDetails){ 
		  this.webSiteDetails = webSiteDetails;
	   }
	   
	   //getter
	   
	   
	   public int getBankId(){
		   return bankId;
	   }
	   
	   public String getBankName(){
		   return bankName;
	   }
	   
	   public String getBranch(){
		   return branch;
	   }
	    public int getBranchCode(){
			return branchCode;
		}
		
		public String getAdress(){
			return adress;
		}
		
		public long getHelplineNo(){
			return helplineNo;
		}
		public String getBranchManager(){
			return branchManager;
		}
		
	public String getIfscCode(){
		return ifscCode;
	}
	public int getNoOfLockers(){
		return noOfLockers;
	}
	public int getNoOfEmployees(){
		return noOfEmployees;
	}
	public String getTimings(){
		return timings;
	}
	public String getWebSiteDetails(){
		return webSiteDetails;
	}
   }
	   
	   
	   
	   
	   
	   
	   