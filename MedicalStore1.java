class MedicalStore1{
static String medicineNames[] = {null,null,null,null,null,null,null,null,null};
static int index;
public static boolean createMedicineName(String medicineName){
boolean isCreated = false ;
if(medicineNames != null){
medicineNames[index] = medicineName;
index++;
isCreated = true;
}else{
System.out.println("Cannot add medicineNames,as it is a null value");
}
return isCreated;
}
//Method
public static void  getAllMedicineName(){
System.out.println("Invoking getAllMedicineName");
for(int medicineName =0;medicineName<medicineNames.length;medicineName++){
String reference = medicineNames[medicineName];
System.out.println("Type of medicineName " + reference + " at index value " + medicineName);
}
System.out.println("End of getAllMedicineName");
}
public static boolean updateMedicineName(String existingMedicineName , String updateMedicineName){
	boolean isUpdated = false;
	for(int medicineName=0 ; medicineName < medicineNames.length ; medicineName++){
		if(medicineNames[medicineName].equals(existingMedicineName)){
		medicineNames[medicineName] = updateMedicineName;
          isUpdated = true;		
}
	}
	return isUpdated;
}
}