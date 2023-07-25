class Patients{


 //patientId,patientName , age , bloddGroup , gender , adress , contactNo , wardNo , attenderName , diseaseName , consultant , hospitalName , fees
	   
	   private int patientId;
	   private String patientName;
	   private int age;
	   private String bloddGroup;
	   private String gender;
	   private String adress;
	   private long contactNo;
	   private int wardNo;
	   private String attenderName;
	   private String diseaseName;
	   private String consultant;
	   private String hospitalName;
	   private double fees;
	   
	   //getter and setter
	   
	   //Setter
	   public void setPatientId(int patientId ){ 
		  this.patientId = patientId;
	   }
	   public void setPatientName(String patientName){
		  this.patientName = patientName;
	   }
	   
	   public void setAge(int age){
		  this.age = age;
	   }
	   public void setBloodGroup(String bloddGroup){
		  this.bloddGroup = bloddGroup;
	   }
	   public void setGender(String gender){
		  this.gender = gender;
	   }
	   public void setAdress(String adress){
		  this.adress = adress;
	   }
	   public void setContactNo(long contactNo){
		  this.contactNo = contactNo;
	   }
	   public void setWardNo(int wardNo){
		  this.wardNo = wardNo;
	   }
	   public void setAttenderName(String attenderName){
		  this.attenderName = attenderName;
	   }
	   public void setDiseaseName(String diseaseName){
		  this.diseaseName = diseaseName;
	   }
	   public void setConsultant(String consultant){
		  this.consultant = consultant;
	   }
	   public void setHospitalName(String hospitalName){
		  this.hospitalName = hospitalName;
	   }
	   public void setFees(double fees){
		  this.fees = fees;
		  }
	   
	   //getter
	   public int getPatientId(){
		   return patientId;
	   }
	   public String getPatientName(){
		   return patientName;
	   }
	   public int getAge(){
		   return age;
	   }
	   public String getBloodGroup(){
		   return bloddGroup;
	   }
	   public String getGender(){
		   return gender;
	   }
	   public String getAdress(){
		   return adress;
	   }
	   public long getContactNo(){
		   return contactNo;
	   }
	   public int getWardNo(){
		   return wardNo;
	   }
	   public String getAttenderName(){
		   return attenderName;
	   }
	   public String getDiseaseName(){
		   return diseaseName;
	   }
	   public String getConsultant(){
		   return consultant;
	   }
	   public String getHospitalName(){
		   return hospitalName;
	   }
	   public double getFees(){
		   return fees;
	   }
}




BANK - bankId , bankName , branch , branchCode , Adress , helplineNo , branchManager , ifscCode , miscCode , noOfLockers , noOfEmployees , timings , webSiteDetails
indianRupee - repeeId , rupeename , printDate , color , serialNo , static noOfLanguages , backSidePlaceName , location
ticketBooking - bookingId , noOfSeats , source , destination , date , timimgs , pnr , price , class , bookingType , transportName 
passportApplication	   