class TvTester{
public static void main(String test[]){
System.out.println("Main Started");
//click on button

boolean connected = Tv.onOrOff();
System.out.println("Is TV connected" + connected);
Tv.increaseSound();
Tv.increaseSound();
Tv.increaseSound();
Tv.increaseSound();

Tv.decreaseSound();
Tv.decreaseSound();
Tv.decreaseSound();
Tv.decreaseSound();
boolean connected1 = Tv.onOrOff();
System.out.println("Is TV connected" + connected1);




System.out.println("Main Ended");
}
}