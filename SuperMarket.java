class SuperMarket {
 //Show 5 vegatable
/* 
 static String vegatable1 = "Potato";
 static String vegatable2 = "Carrot";
 static String vegatable3 = "Beans";
 static String vegatable4 = "Brinjal";
 static String vegatable5 = "Onion";
 
 //biscuits - 10
 //perfume - 10
 //groceries - 10
 
 
	 

    //Biscuits
 static String biscuit1 = "Unibic";
 static String biscuit2 = "Marri Gold";
 static String biscuit3 = "mom's magic";
 static String biscuit4 = "Sunfist";
 static String biscuit5 = "Orieo";
 static String biscuit6 = "Tiger";
 static String biscuit7 = "Britania";
 static String biscuit8 = "Darkfantasy";
 static String biscuit9 = "Chaska Maska";
 static String biscuit10 = "Marri Light";
 
 
 //perfumes
 
 static String perfume1 = "Fogg";
 static String perfume2 = "Eva";
 static String perfume3 = "axe";
 static String perfume4 = "Set wet";
 static String perfume5 = "Ks";
 static String perfume6 = "Fog googly";
 static String perfume7 = "Engage";
 static String perfume8 = "Bella vita";
 static String perfume9 = "Secret";
 static String perfume10 = "ENVY"; 
 
         //groceries
 
 static String grocerie1 = "Ghee";
 static String grocerie2 = "Toor Dal";
 static String grocerie3 = "Tea";
 static String grocerie4 = "papper";
 static String grocerie5 = "Wheat";
 static String grocerie6 = "Gram Flor";
 static String grocerie7 = "Oil";
 static String grocerie8 = "Ragi";
 static String grocerie9 = "Dry Fruite";
 static String grocerie10 = "Rice";
  public static void main(String args[]){
     System.out.println("Main started");
	 System.out.println("List of Vegatables are:");
	 System.out.println("1st Rack " + vegatable1);
	 System.out.println("2nd Rack " + vegatable2);
	 System.out.println("3rd Rack" + vegatable3);
	 System.out.println("4th Rack" + vegatable4);
	 System.out.println("5th Rack" + vegatable5);


	 System.out.println("List of Biscuits are:");
	 System.out.println("1st Rack" + biscuit1);
	 System.out.println("2nd Rack " + biscuit2);
	 System.out.println("3rd Rack" + biscuit3);
	 System.out.println("4th Rack" + biscuit4);
	 System.out.println("5th Rack" + biscuit5);
	 System.out.println("6th Rack" + biscuit6);
	 System.out.println("7th Rack " + biscuit7);
	 System.out.println("8th Rack" + biscuit8);
	 System.out.println("9th Rack" + biscuit9);
	 System.out.println("10th Rack" + biscuit10);
	 
	 
	System.out.println("List of Perfumes are:");
	System.out.println("1st Rack" + perfume1);
	System.out.println("2nd Rack" + perfume2);
	System.out.println("3rd Rack" + perfume3);
	System.out.println("4th Rack" + perfume4);
	System.out.println("5th Rack" + perfume5);
	System.out.println("6th Rack" + perfume6);
	System.out.println("7th Rack" + perfume7);
	System.out.println("8th Rack" + perfume8);
	System.out.println("9th Rack" + perfume9);
    System.out.println("10th Rack" + perfume10);
	
	System.out.println("List of groceries are:");
	System.out.println("1st Rack" + grocerie1);
	System.out.println("2nd Rack" + grocerie2);
	System.out.println("3rd Rack" + grocerie3);
	System.out.println("4th Rack" + grocerie4);
	System.out.println("5th Rack" + grocerie5);
	System.out.println("6th Rack" + grocerie6);
	System.out.println("7th Rack" + grocerie7);
	System.out.println("8th Rack" + grocerie8);
	System.out.println("9th Rack" + grocerie9);
	System.out.println("10th Rack" + grocerie10);
	System.out.println("Main Ended");
*/	

static String vegetables[]={"Potato","Carrot","Beans","Brinjal","Brinjal","Onion"};
static String biscuits[]={"Unibic","Marri Gold","mom's magic","Sunfist","Orieo", "Tiger","Britania","Darkfantasy","Chaska Maska",
"Marri Light"};
static String perfumes[]={"Fogg","Eva","axe","Set wet","Ks","Fog googly","Engage","Bella vita","Secret","ENVY"};
static String groceries[]={"Ghee","Toor Dal","Tea","papper","Wheat","Gram Flor","Oil","Ragi","Dry Fruit","Rice"};
//static String cosmatics[]={"powder","Cream","Lipstick","EyeLiner","EyeShadow","Foundation","mascara","blurh","Serum","Primer","Lotion","FacePack","FaceWasg","Facepuff","Haircap","HairGel","HairSpray","Stickers","HairBrush","HairCumb","Mirror","LipLiner","NailPolish","Bronzer","Brightener");	
  public static void main(String args[]){
	  System.out.println("Main Started");
	  System.out.println("List of perfumes are");
	  getVegetables();
	  getBiscuits();
	  getPerfumes();
	  getGroceries();
	  
	  //invoking a method
  }
  public static void getPerfumes(){
	  System.out.println("Inside getPerfume");
	  for(String perfume:perfumes){
		  System.out.println(perfume);
	  }
  }
  //read-get , fetch , read
  public static void getVegetables(){
	  System.out.println("Inside getVegetables");
	  for(String vegatable:vegetables){
		  System.out.println(vegatable);
	  }
  }
  public static void getBiscuits(){
	  System.out.println("Inside getBiscuits");
	  for(String biscuit:biscuits){
		  System.out.println(biscuit);
	  }
  }
  public static void getGroceries(){
	  System.out.println("Inside getGroceries");
	  for(String grocerie:groceries){
		  System.out.println(grocerie);
	  }
  }
  
  
  
  
  
  
  
  
  
}


  
	  
	
	  //System.out.println(vegetables[0] +" "+ vegetables[1] +" "+ vegetables[2] +" "+ vegetables[3] +" "+ vegetables[4] +" "+ vegetables[5]);
	  /*System.out.println("List of biscuits are");
	  System.out.println(biscuits[0] + " "+ biscuits[1] + " "+ biscuits[2] + " "+ biscuits[3] + " "+ biscuits[4] + " "+ biscuits[5] + " "+ biscuits[6] + " "+ biscuits[7] + " "+ biscuits[8] + " "+ biscuits[9]);
	  System.out.println("List of perfumes are");
	  
	  System.out.println(perfumes[0] + " "+ perfumes[1] + " "+ perfumes[2] + " "+ perfumes[3] + " "+ perfumes[4] + " "+ perfumes[5] + " "+ perfumes[6] + " "+ perfumes[7] + " "+ perfumes[8] + " "+ perfumes[9]);
	  System.out.println("List of groceries are");
	  System.out.println(groceries[0] + " "+ groceries[1] + " "+ groceries[2] + " "+ groceries[3] + " "+ groceries[4] + " "+ groceries[5] + " "+ groceries[6] + " "+ groceries[7] + " "+ groceries[8] + " "+ groceries[9]);
	  System.out.println("List of cosmatics are");
	  System.out.println(cosmatics[0] + " "+ cosmatics[1] + " "+ cosmatics[2] + " "+ cosmatics[3] + " "+ cosmatics[4] + " "+ cosmatics[5] + " "+ cosmatics[6] + " "+ cosmatics[7] + " "+ cosmatics[8] + " "+ cosmatics[9] + " " +cosmatics[10] + " "+ cosmatics[11] + " "+ cosmatics[12] + " "+ cosmatics[13] + " "+ cosmatics[14] + " "+ cosmatics[15] + " "+ cosmatics[16] + " "+ cosmatics[17] + " "+ cosmatics[18] + " "+ cosmatics[19] + " " +(cosmatics[20] + " "+ cosmatics[21] + " "+ cosmatics[22] + " "+ cosmatics[23] + " "+ cosmatics[24]);
	  System.out.println("Main Ended");*/

  
  


	
   

	

  
	   

	   

