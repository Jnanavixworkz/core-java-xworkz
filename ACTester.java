class ACTester{
public static void main(String test[]){
System.out.println("Main Started");
//click on button

boolean connected = AC.onOrOff();
System.out.println("Is AC connected" + connected);
AC.increaseTemp();
AC.increaseTemp();
AC.increaseTemp();
AC.increaseTemp();

AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
boolean connected1 = AC.onOrOff();
System.out.println("Is AC connected" + connected1);




System.out.println("Main Ended");
}
}