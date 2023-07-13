class Karnataka{
static String cityNames[] = {null , null , null , null , null , null};
static int index;
public static boolean addCityName(String city){
boolean isAdded = false;
if(cityNames.length > index){
if(cityNames!= null ){
cityNames[index] = city;
index++;
isAdded = true;
System.out.println("City Added"+isAdded);
}else{
System.out.println("cannot add city,as it is a null value");
}
}else{
	System.out.println("Size is full , cannot add city anymore");
}
return isAdded;
}
//Method 
public static void getAllCityNames(){
System.out.println("Invoking getAllCityNames");
for(int city=0 ; city < cityNames.length; city++){
String reference=cityNames[city];
System.out.println(" Type of city " + reference + " at index value " + city);
}
System.out.println("End of getAllCityNames");
}
public static boolean updateCityName(String existingCityName , String updateCityName){
	boolean isUpdated = false;
	for(int city=0 ; city < cityNames.length ; city++){
		if(cityNames[city].equals(existingCityName)){
		cityNames[city] = updateCityName;
		isUpdated = true;		
}
	}
	return isUpdated;
}
public static int deletecityNames(String deletecityNames){
	System.out.println("Invoking editCityNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int city;
	int noOfElements = cityNames.length;
	for (city=0; city<cityNames.length;city++){
		if(cityNames[city].equals(deletecityNames)){
		break;
		}
	}
	if(city<noOfElements){
		noOfElements = noOfElements-1;
		for(int newcity = city; newcity<noOfElements;newcity++){
			cityNames[newcity]= cityNames[newcity+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllCityNamesPostDeletion(int newLength){
	for(int city = 0; city< newLength; city++){
		System.out.println(cityNames[city]);
	}
	public staticString searchCityNamesByName(String cityName){
		System.out.println("Invoking getCityNamesByName");
		System.out.println("No of parameter : 1,type String);
		String cName=null;
		for(String name : cityNames){
			if(name.equals(cityName)){
				cName = name;
				System.out.println("city name found");
}
}
return cName;
	}
