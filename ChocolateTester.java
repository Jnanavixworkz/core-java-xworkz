class ChocolateTester{

public static void main(String args[]){
Chocolate chocolate = new Chocolate();
chocolate.name = "Silk";
chocolate.flavor = "Fruite and nuts";
chocolate.price = 250;
chocolate.expDate = "12-3-2001";
chocolate.mgfDate = "13-4-2002";
chocolate.toGetCalories();
System.out.println("Create 1st copy of the Chocolate");
System.out.println(chocolate.name + " " + chocolate.flavor + " " + chocolate.price + " " + chocolate.expDate + " " + chocolate.mgfDate);


Chocolate chocolate1 = new Chocolate();
chocolate1.name = "Crispel";
chocolate1.flavor = "Strawberry";
chocolate1.price = 50;
chocolate1.expDate = "10-10-2010";
chocolate1.mgfDate = "11-11-2011";
chocolate1.toGetCalories();
System.out.println("Create 2nd copy of the Chocolate");
System.out.println(chocolate1.name + " " + chocolate1.flavor + " " + chocolate1.price + " " + chocolate1.expDate + " " + chocolate1.mgfDate);


Chocolate chocolate2 = new Chocolate();
chocolate2.name = "Kitkat";
chocolate2.flavor = "Normal";
chocolate2.price = 25;
chocolate2.expDate = "18-06-2017";
chocolate2.mgfDate = "18-12-2017";
chocolate2.toGetCalories();
System.out.println("Create 3rd copy of the Chocolate");
System.out.println(chocolate2.name + " " + chocolate2.flavor + " " + chocolate2.price + " " + chocolate2.expDate + " " + chocolate2.mgfDate);

Chocolate chocolate3 = new Chocolate();
chocolate3.name = "DairyMilk";
chocolate3.flavor = "Chocolate";
chocolate3.price = 200;
chocolate3.expDate = "27-07-2023";
chocolate3.mgfDate = "31-09-2023";
chocolate3.toGetCalories();
System.out.println("Create 4th copy of the Chocolate");
System.out.println(chocolate3.name + " " + chocolate3.flavor + " " + chocolate3.price + " " + chocolate3.expDate + " " + chocolate3.mgfDate);


Chocolate chocolate4 = new Chocolate();
chocolate4.name = "MilkyBar";
chocolate4.flavor = "Milk";
chocolate4.price = 350;
chocolate4.expDate = "29-10-2016";
chocolate4.mgfDate = "30-08-2016";
chocolate4.toGetCalories();
System.out.println("Create 5th copy of the Chocolate");
System.out.println(chocolate4.name + " " + chocolate4.flavor + " " + chocolate4.price + " " + chocolate4.expDate + " " + chocolate4.mgfDate);


Chocolate chocolate5 = new Chocolate();
chocolate5.name = "Ferrero";
chocolate5.flavor = "coco";
chocolate5.price = 500;
chocolate5.expDate = "28-08-2010";
chocolate5.mgfDate = "24-06-2010";
chocolate5.toGetCalories();
System.out.println("Create 6th copy of the Chocolate");
System.out.println(chocolate5.name + " " + chocolate5.flavor + " " + chocolate5.price + " " + chocolate5.expDate + " " + chocolate5.mgfDate);


Chocolate chocolate6 = new Chocolate();
chocolate6.name = "HarshisKisses";
chocolate6.flavor = "white";
chocolate6.price =250;
chocolate6.expDate ="15-06-2009";
chocolate6.mgfDate ="5-08-2009";
chocolate6.toGetCalories();
System.out.println("Create 7th copy of the Chocolate");
System.out.println(chocolate6.name + " " + chocolate6.flavor + " " + chocolate6.price + " " + chocolate6.expDate + " " + chocolate6.mgfDate);


Chocolate chocolate7 = new Chocolate();
chocolate7.name = "KinderJoy";
chocolate7.flavor = "bitterSweet";
chocolate7.price = 60;
chocolate7.expDate = "21-07-2021";
chocolate7.mgfDate = "28-08-2021";
chocolate7.toGetCalories();
System.out.println("Create 8th copy of the Chocolate");
System.out.println(chocolate7.name + " " + chocolate7.flavor + " " + chocolate7.price + " " + chocolate7.expDate + " " + chocolate7.mgfDate);


Chocolate chocolate8 = new Chocolate();
chocolate8.name = "5star";
chocolate8.flavor = "semisweet";
chocolate8.price = 45;
chocolate8.expDate = "30-05-2023";
chocolate8.mgfDate = "30-07-2023";
chocolate8.toGetCalories();
System.out.println("Create 9th copy of the Chocolate");
System.out.println(chocolate8.name + " " + chocolate8.flavor + " " + chocolate8.price + " " + chocolate8.expDate + " " + chocolate8.mgfDate);


Chocolate chocolate9 = new Chocolate();
chocolate9.name = "Polo";
chocolate9.flavor = "chocolate";
chocolate9.price = 15;
chocolate9.expDate = "24-03-2004";
chocolate9.mgfDate = "24-04-2004";
chocolate9.toGetCalories();
System.out.println("Create 10th copy of the Chocolate");
System.out.println(chocolate9.name + " " + chocolate9.flavor + " " + chocolate9.price + " " + chocolate9.expDate + " " + chocolate9.mgfDate);
}
}