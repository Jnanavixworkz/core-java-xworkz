class IndianRupee{

//indianRupee - rupeeId , rupeename , printDate , color , serialNo , static noOfLanguages , backSidePlaceName , location

        private int rupeeId;
        private String rupeename;
		private int printDate;
		private String color;
		private String serialNo;
		static int noOfLanguages;
		private String backSidePlaceName;
		private String location;
		
		public void setRupeeId(int rupeeId){
		this.rupeeId = rupeeId;
		}
		public void setRupeeName(String rupeename){
		this.rupeename = rupeename;
		}
		public void setPrintDate(int printDate){
		this.printDate = printDate;
		}
		public void setColor(String color){
		this.color = color;
		}
		public void setSerialNo(String serialNo){
		this.serialNo = serialNo;
		}
		public void setNoOfLanguages(int noOfLanguages){
		this.noOfLanguages = noOfLanguages;
		}
		public void setBackSidePlaceName(String backSidePlaceName){
		this.backSidePlaceName = backSidePlaceName;
		}
		public void setLocation(String location){
		this.location = location;
		}
		
		public int getRupeeId(){
		return rupeeId;
		}
		public String getRupeeName(){
		return rupeename;
		}
		public int getPrintDate(){
		return printDate;
		}
		public String getColor(){
		return color;
		}
		public String getSerialNo(){
		return serialNo;
		}
		public int getNoOfLanguages(){
		return noOfLanguages;
		}
		public String getBackSidePlaceName(){
		return backSidePlaceName;
		}
		public String getLocation(){
		return location;
		}
		}
		