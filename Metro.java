class Metro{
static String stationNames[] = {null,null,null,null,null,null,null,};
static int index;
public static boolean addStationName(String stationName){
boolean isAdded = false;
if(stationNames != null){
stationNames[index] = stationName;
index++;
isAdded = true;
}else{
System.out.println("Cannot add stationNames,as it is a null value");
}
return isAdded;
}
//Method
public static void  getAllStationName(){
System.out.println("Invoking getAllStationName");
for(int stationName =0;stationName<stationNames.length;stationName++){
String reference = stationNames[stationName];
System.out.println("Type of stationName " + reference + " at index value " + stationName);
}
System.out.println("End of getAllStationName");
}
public static boolean updateStationName(String existingStationName , String updateStationName){
	boolean isUpdated = false;
	for(int stationName=0 ; stationName < stationNames.length ; stationName++){
		if(stationNames[stationName].equals(existingStationName)){
		stationNames[stationName] = updateStationName;
          isUpdated = true;		
}
	}
	return isUpdated;
}
public static int deleteStationNames(String deleteStationNames){
	System.out.println("Invoking editStationNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int stationName ;
	int noOfElements = stationNames.length;
	for (stationName=0 ; stationName < stationNames.length ; stationName++){
		if(stationNames[stationName].equals(deleteStationNames)){
		break;
		}
	}
	if(stationName<noOfElements){
		noOfElements = noOfElements-1;
		for(int newStationName = stationName; newStationName<noOfElements;newStationName++){
			stationNames[newStationName]= stationNames[newStationName+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllStationNamePostDeletion(int newLength){
	for(int stationName = 0; stationName< newLength; stationName++){
		System.out.println(stationNames[stationName]);
	}
	
}
}


