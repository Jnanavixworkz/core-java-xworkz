class Modulus {
public static void main(String args[]){
mod(28,6,2);
mod(128,36,8);
mod(68,12,10);
mod(180,28,20);
mod(1000,250,150);
mod(250,100,200);
mod(380,16,38);
mod(2500,18,44);
mod(125,25,55);
mod(168,18,78);
}
public static void mod(int a, int b , int c){
System.out.println(a%b%c);
}
}