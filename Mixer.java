class Mixer {
  static String name = "Samsung";
  static  int minSpeed;
  static int currentSpeed;
  static  int maxSpeed = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("Mixer is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("Mixer is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseSpeed
  public static void increaseSpeed(){
	  System.out.println("Start of increaseSpeed");
	  if(isConnected == true){
	  if(currentSpeed < maxSpeed){
		  currentSpeed = currentSpeed + 1;
	  }else{
		  System.out.println("Max Speed reached");
  }
	  }else{
		  System.out.println("Mixer is connected");
  }
  System.out.println("End of increaseSpeed");
  }
  
  //decreaseSpeed
  
  public static void decreaseSpeed(){
	  //logic
	  System.out.println("Invoking decreaseSpeed()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentSpeed>minSpeed){
			  currentSpeed = currentSpeed - 1;
		  }else{
			  System.out.println("min Speed reached");
		  }
	  }else{
		  System.out.println("Mixer is connected");
	  }
  }
}
  