class MedicalStore1Tester{
public static void main(String args[]){
	
	//create , add , save
MedicalStore1.createMedicineName("Dolo650");
MedicalStore1.createMedicineName("Aspirin");
MedicalStore1.createMedicineName("Citalopram");
MedicalStore1.createMedicineName("Trazodone");
MedicalStore1.createMedicineName("Naproxen");
MedicalStore1.createMedicineName("Azithromycin");
MedicalStore1.createMedicineName("Bilypsa");
MedicalStore1.createMedicineName("Clavam 625");
MedicalStore1.createMedicineName("Doxinate");

//get , read , fetch
MedicalStore1.getAllMedicineName();
//update , edit
boolean isUpdated=MedicalStore1.updateMedicineName("Trazodone","Paracetamol");
System.out.println("Is medicineName name updated"+ isUpdated);
MedicalStore1.getAllMedicineName();
}
}