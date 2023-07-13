class speakerTester{
public static void main(String test[]){
System.out.println("Main Started");
//click on button

boolean connected = Speaker.onOrOff();
System.out.println("Is speaker connected" + connected);
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();

Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
boolean connected1 = Speaker.onOrOff();
System.out.println("Is speaker connected" + connected1);




System.out.println("Main Ended");
}
}