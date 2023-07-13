class MetroTester{
public static void main(String args[]){
Metro.addStationName("Rajajinagar");
Metro.addStationName("Vijaynagar");
Metro.addStationName("Rajarajeshwarinagar");
Metro.addStationName("Yashwanthpura");
Metro.addStationName("Bhalagangadaranatha Station");
Metro.addStationName("JaiNagar");
Metro.addStationName("Kengeri");

Metro.getAllStationName();
boolean isUpdated=Metro.updateStationName("JaiNagar","Maleshwaram");
System.out.println("Is stationName name updated"+ isUpdated);
Metro.getAllStationName();

int  newLength = Metro.deleteStationNames("JaiNagar");
 System.out.println("Calling getAllStationNamePostDeletion");
 Metro.getAllStationNamePostDeletion(newLength);
}
}