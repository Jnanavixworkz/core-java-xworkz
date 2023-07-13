class Telecomm{
static String sims[] = {null,null,null,null,null};
static int index;
public static boolean saveSim(String sim){
boolean isSaved = false;
if( sims != null){
sims[index] = sim;
index++;
isSaved = true;
}else{
System.out.println("Cannot add sim,as it is a null value");
}
return isSaved;
}
//Method
public static void getAllSim(){
System.out.println("Invoking getAllSim");
for(int sim = 0 ; sim < sims.length ; sim++){
String reference = sims[sim];
System.out.println("Type of sim " + reference + " at index value " + sim);
}
System.out.println("End of getAllSim");
}
public static boolean updateSim(String existingSim , String updateSim){
	boolean isUpdated = false;
	for(int sim=0 ; sim < sims.length ; sim++){
		if(sims[sim].equals(existingSim)){
		sims[sim] = updateSim;
          isUpdated = true;		
}
	}
	return isUpdated;
}
public static int deletesims(String deletesims){
	System.out.println("Invoking editSims");
	System.out.println("No of Parameters : 2, type of parameter : String, String");
	boolean isDeleted = false;
	int sim;
	int noOfElements = sims.length;
	for (sim=0 ; sim<sims.length ; sim++){
		if(sims[sim].equals(deletesims)){
		break;
		}
	}
	if(sim<noOfElements){
		noOfElements = noOfElements-1;
		for(int newsim = sim; newsim<noOfElements;newsim++){
			sims[newsim]= sims[newsim+1];
		}
	}
	System.out.println(noOfElements);
	return noOfElements;
}
public static void getAllSimsPostDeletion(int newLength){
	for(int sim = 0; sim< newLength; sim++){
		System.out.println(sims[sim]);
	}
	
}
}


