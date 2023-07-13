class Oven {
  static String name = "LG";
  static  int minHeat;
  static int currentHeat;
  static  int maxHeat = 10;
  static boolean isConnected ;
//method
  public static boolean onOrOff(){
  System.out.println("Invoking onOrOff()");
  System.out.println("Parameter" + 0);
  if(isConnected == false){
  isConnected = true;
  System.out.println("Oven is Turned onnn..Enjoyy");
  }else if(isConnected == true){
  isConnected = false ;
  System.out.println("Oven is Turned off.....");
  }
  return isConnected;
  }
  
  //increaseHeat
  public static void increaseHeat(){
	  System.out.println("Start of increase Heat");
	  if(isConnected == true){
	  if(currentHeat<maxHeat){
		  currentHeat = currentHeat + 1;
	  }else{
		  System.out.println("Max Heat reached");
  }
	  }else{
		  System.out.println("Oven connect madu firstu");
  }
  System.out.println("End of increaseHeat");
  }
  
  //decreaseHeat
  
  public static void decreaseHeat(){
	  //logic
	  System.out.println("Invoking decreaseHeat()");
	  System.out.println("List of parameters " + 2);
	  if(isConnected == true){
		  if(currentHeat>minHeat){
			  currentHeat = currentHeat - 1;
		  }else{
			  System.out.println("min Heat reached");
		  }
	  }else{
		  System.out.println("Oven connect madu firstu");
	  }
  }
}
  