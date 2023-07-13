class TelecommTester{
public static void main(String args[]){
Telecomm.saveSim("Airtel");
Telecomm.saveSim("Jio");
Telecomm.saveSim("Vodaphone");
Telecomm.saveSim("BSNL");
Telecomm.saveSim("Tatadecomo");

Telecomm.getAllSim();
boolean isUpdated=Telecomm.updateSim("Vodaphone","DualSim");
System.out.println("Is sim name updated"+ isUpdated);
Telecomm.getAllSim();

int  newLength = Telecomm.deletesims("Tatadecomo");
 System.out.println("Calling getAllSimsPostDeletion");
 Telecomm.getAllSimsPostDeletion(newLength);
}
}