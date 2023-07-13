class AC {
  static String name = "Haire";
  static  int minTemp;
  static int currentTemp;
  static  int maxTemp = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("AC is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("AC is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseTemp
  public static void increaseTemp(){
	  System.out.println("Start of increaseTemp");
	  if(isConnected == true){
	  if(currentTemp < maxTemp){
		  currentTemp = currentTemp + 1;
	  }else{
		  System.out.println("Max Temperature reached");
  }
	  }else{
		  System.out.println("Gubee...AC connect madu firstu");
  }
  System.out.println("End of increaseTemp");
  }
  
  //decrease Temp
  
  public static void decreaseTemp(){
	  //logic
	  System.out.println("Invoking decreaseTemp()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentTemp>minTemp){
			  currentTemp = currentTemp - 1;
		  }else{
			  System.out.println("min Temperature reached");
		  }
	  }else{
		  System.out.println("Gubee...AC connect madu firstu");
	  }
  }
}
  