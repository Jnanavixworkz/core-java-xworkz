class KarnatakaTester{
public static void main(String args[]){

Karnataka.addCityName("Mandya");
Karnataka.addCityName("Mysure");
Karnataka.addCityName("Bangalore");
Karnataka.addCityName("Maddur");
Karnataka.addCityName("Chennapattana");
Karnataka.addCityName("Ramanagara");

Karnataka.getAllCityNames();
boolean isUpdated=Karnataka.updateCityName("Bangalore","asdfgh");
System.out.println("Is city name updated"+ isUpdated);
Karnataka.getAllCityNames();

int  newLength = Karnataka.deletecityNames("Maddur");
 System.out.println("Calling getAllCityNamesPostDeletion");
 Karnataka.getAllCityNamesPostDeletion(newLength);
}
}