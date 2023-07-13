class IceCream2{
static String flavorsNames[]= {null,null,null,null,null,null,null};
static int index;
public static boolean addFlavor(String flavor){
boolean isAdded = false;
if(flavorsNames!= null){
		flavorsNames[index] = flavor;
		index++;
		isAdded = true;
		}else{
		System.out.println("Cannot add the data at null value");
		}
		return isAdded;
		}
		
		//method
	   public static void getAllFlavorsNames(){
	   System.out.println("Invoking getAllFlovorsNames");
	   for (int flavor= 0; flavor< flavorsNames.length;flavor++){
	   String reference = flavorsNames[flavor];  
	   System.out.println("type of flavor " + reference +" at index value " + flavor);
	   }
	   System.out.println("End of getAllFlavorsNames");
	   }
public static boolean updateFlavorsNames(String exisitingFlavorsNames, String updateFlavorsNames){
		   boolean isUpdated = false;
		   for(int flavorIndex = 0; flavorIndex< flavorsNames.length ;flavorIndex++){
			   if(flavorsNames[flavorIndex].equals(exisitingFlavorsNames)){
				   flavorsNames[flavorIndex]= updateFlavorsNames;
				   isUpdated = true; 
}
}
return isUpdated;
}
public static int deleteFlavorsNames(String deleteFlavorsNames){
	System.out.println("Invoking editFlavorsNames");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int flavorIndex;
	int noOfElements = flavorsNames.length;
	for (flavorIndex = 0; flavorIndex<flavorsNames.length;flavorIndex++){
		if(flavorsNames[flavorIndex].equals(deleteFlavorsNames)){
		break;
		}
	}
	if(flavorIndex<noOfElements){
		noOfElements = noOfElements-1;
		for(int newFlavorIndex = flavorIndex; newFlavorIndex<noOfElements;newFlavorIndex++){
			flavorsNames[newFlavorIndex]= flavorsNames[newFlavorIndex+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllFlavorsNamesPostDeletion(int newLength){
	for(int flavorIndex = 0; flavorIndex< newLength; flavorIndex++){
		System.out.println(flavorsNames[flavorIndex]);
	}
	
}
}