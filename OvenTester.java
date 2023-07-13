class OvenTester{
public static void main(String test[]){
System.out.println("Main Started");
//click on button

boolean connected = Oven.onOrOff();
System.out.println("Is TV connected" + connected);
Oven.increaseHeat();
Oven.increaseHeat();
Oven.increaseHeat();
Oven.increaseHeat();

Oven.decreaseHeat();
Oven.decreaseHeat();
Oven.decreaseHeat();
Oven.decreaseHeat();
boolean connected1 = Oven.onOrOff();
System.out.println("Is Oven connected" + connected1);




System.out.println("Main Ended");
}
}