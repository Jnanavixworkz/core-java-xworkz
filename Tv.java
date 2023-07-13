class Tv {
  static String name = "LG";
  static  int minSound;
  static int currentSound;
  static  int maxSound = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("TV is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("TV is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseSound
  public static void increaseSound(){
	  System.out.println("Start of increase Sound");
	  if(isConnected == true){
	  if(currentSound<maxSound){
		  currentSound = currentSound + 1;
	  }else{
		  System.out.println("Max Sound reached");
  }
	  }else{
		  System.out.println("Tv connect madu firstu");
  }
  System.out.println("End of increaseSound");
  }
  
  //decrease Sound
  
  public static void decreaseSound(){
	  //logic
	  System.out.println("Invoking decreaseSound()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentSound>minSound){
			  currentSound = currentSound - 1;
		  }else{
			  System.out.println("min Sound reached");
		  }
	  }else{
		  System.out.println("TV connect madu firstu");
	  }
  }
}
  