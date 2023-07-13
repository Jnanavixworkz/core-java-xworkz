class WashingMachineTester{
public static void main(String test[]){
System.out.println("Main Started");
//click on button

boolean connected = WashingMachine.onOrOff();
System.out.println("Is WashingMachine connected" + connected);
WashingMachine.increaseTime();
WashingMachine.increaseTime();
WashingMachine.increaseTime();
WashingMachine.increaseTime();

WashingMachine.decreaseTime();
WashingMachine.decreaseTime();
WashingMachine.decreaseTime();
WashingMachine.decreaseTime();
boolean connected1 = WashingMachine.onOrOff();
System.out.println("Is WashingMachine connected" + connected1);




System.out.println("Main Ended");
}
}