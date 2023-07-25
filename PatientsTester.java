class PatientsTester{
  
    public static void main(String args[]){
	  Patients patients = new Patients();
	    
		
		patients.setPatientId(1);
		patients.setPatientName("Monisha");
		patients.setAge(21);
		patients.setBloodGroup("O+");
		patients.setGender("Female");
		patients.setAdress("SR Patna");
		patients.setContactNo(99006032);
		patients.setWardNo(10);
		patients.setAttenderName("Chithra");
		patients.setDiseaseName("Fever");
		patients.setConsultant("Meghana");
		patients.setHospitalName("Appolo Hospital");
		patients.setFees(18000.45);
		
		
		System.out.println(patients.getPatientId() + " " + patients.getPatientName() + " " +  patients.getAge() + " " + patients.getBloodGroup() + " " + patients.getGender() + " " + patients.getAdress() + " " + patients.getContactNo() + " " + patients.getWardNo + " " + patients.getAttenderName() + " " + patients.getDiseaseName() + " " + patients.getConsultant()+ " " + patients.getHospitalName() + " " + patients.getFees()); 

}
}		