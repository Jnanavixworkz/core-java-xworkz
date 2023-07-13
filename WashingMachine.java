class WashingMachine {
  static String name = "Samsung";
  static  int minTime;
  static int currentTime;
  static  int maxTime = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("WashingMachine is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("WashingMachine is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseTime
  public static void increaseTime(){
	  System.out.println("Start of increase Time");
	  if(isConnected == true){
	  if(currentTime<maxTime){
		  currentTime = currentTime + 1;
	  }else{
		  System.out.println("Max Time reached");
  }
	  }else{
		  System.out.println("WashingMachine connect madu firstu");
  }
  System.out.println("End of increaseTime");
  }
  
  //decreaseTime
  
  public static void decreaseTime(){
	  //logic
	  System.out.println("Invoking decreaseTime()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentTime>minTime){
			  currentTime = currentTime - 1;
		  }else{
			  System.out.println("min Time reached");
		  }
	  }else{
		  System.out.println("WashingMachine connect madu firstu");
	  }
  }
}
  