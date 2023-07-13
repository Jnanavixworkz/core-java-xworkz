class Zomato1{
public static double search(String foodName){

if( "Pizza" == foodName){
System.out.println("Searched food name is " + foodName);
return 99.00;
}
if("Biryani" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00;
}
if("Burger" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("Sandwiche" == foodName){
System.out.println("Searched food name is"+foodName);
return 200.00;
}
if("Kabab" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00;
}
if("Shavarma" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("Noodles" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00;
}
if("Cake" == foodName){
System.out.println("Searched food name is"+foodName);
return 399.00;
}
if("Chickenlolipop" == foodName){
System.out.println("Searched food name is"+foodName);
return 239.00;
}
if("KFC" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("VegPalav" == foodName){
System.out.println("Searched food name is"+foodName);
return 899.00;
}
if("ChillyChicken" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("Chicken65" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("MasalaDosa" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("Parota" == foodName){
System.out.println("Searched food name is"+foodName);
return 35.00;
}
if("ChickenButterMasala" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("Chicken" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("IceCream" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("GobiManchuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("PaniPuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
if("BelPuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00;
}
return 0.0;
}
public static double search(String foodName,int quantity){
if( "Pizza" == foodName){
System.out.println("Searched food name is " + foodName);
return 99.00 * quantity;
}
if("Biryani" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00 * quantity;
}
if("Burger" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("Sandwiche" == foodName){
System.out.println("Searched food name is"+foodName);
return 200.00 * quantity;
}
if("Kabab" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00 * quantity;
}
if("Shavarma" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("Noodles" == foodName){
System.out.println("Searched food name is"+foodName);
return 150.00 * quantity;
}
if("Cake" == foodName){
System.out.println("Searched food name is"+foodName);
return 399.00 * quantity;
}
if("Chickenlolipop" == foodName){
System.out.println("Searched food name is"+foodName);
return 239.00 * quantity;
}
if("KFC" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("VegPalav" == foodName){
System.out.println("Searched food name is"+foodName);
return 899.00 * quantity;
}
if("ChillyChicken" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("Chicken65" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("MasalaDosa" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("Parota" == foodName){
System.out.println("Searched food name is"+foodName);
return 35.00 * quantity;
}
if("ChickenButterMasala" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("Chicken" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("IceCream" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("GobiManchuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("PaniPuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
if("BelPuri" == foodName){
System.out.println("Searched food name is"+foodName);
return 199.00 * quantity;
}
return quantity;
}
}