class Garden {
static String flowers[] = {null,null,null,null,null,null,null};
static int index;
public static boolean addFlower(String flower){
boolean isAdded = false;
if(flowers != null){
flowers[index] = flower;
index++;
isAdded = true;
}else{
System.out.println("Cannot add flowers,as it is a null value");
}
return isAdded;
}
//Method
public static void  getAllFlower(){
System.out.println("Invoking getAllFlower");
for(int flower =0;flower<flowers.length;flower++){
String reference = flowers[flower];
System.out.println("Type of flower " + reference + " at index value " + flower);
}
System.out.println("End of getAllFlower");
}
public static boolean updateFlower(String existingFlower , String updateFlower){
	boolean isUpdated = false;
	for(int flower=0 ; flower < flowers.length ; flower++){
		if(flowers[flower].equals(existingFlower)){
		flowers[flower] = updateFlower;
          isUpdated = true;		
}
	}
	return isUpdated;
}
public static int deleteFlower(String deleteFlower){
	System.out.println("Invoking editFlower");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int flower;
	int noOfElements = flowers.length;
	for (flower=0 ; flower<flowers.length ; flower++){
		if(flowers[flower].equals(deleteflowers)){
		break;
		}
	}
	if(flower<noOfElements){
		noOfElements = noOfElements-1;
		for(int newFlower = flower; newFlower<noOfElements;newFlower++){
			flowers[newFlower]= flowers[newFlower+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllFlowerPostDeletion(int newLength){
	for(int flower = 0; flower< newLength; flower++){
		System.out.println(flowers[flower]);
	}
	
}
}



