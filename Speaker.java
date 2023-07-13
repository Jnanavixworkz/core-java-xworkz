class Speaker {
  static String name = "JB1";
  static  int minVolume;
  static int currentVolume;
  static  int maxVolume = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("Speaker is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("Speaker is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseVolume
  public static void increaseVolume(){
	  System.out.println("Start of increaseVolume");
	  if(isConnected == true){
	  if(currentVolume<maxVolume){
		  currentVolume = currentVolume + 1;
	  }else{
		  System.out.println("Max volume reached");
  }
	  }else{
		  System.out.println("Gubee...speaker connect madu firstu");
  }
  System.out.println("End of increaseVolume");
  }
  
  //decrease volume
  
  public static void decreaseVolume(){
	  //logic
	  System.out.println("Invoking decreaseVolume()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentVolume>minVolume){
			  currentVolume = currentVolume - 1;
		  }else{
			  System.out.println("min volume reached");
		  }
	  }else{
		  System.out.println("Gubee...Speaker connect madu firstu");
	  }
  }
}
  