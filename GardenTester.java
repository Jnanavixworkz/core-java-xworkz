class GardenTester{
public static void main(String args[]){
Garden.addFlower("Rose");
Garden.addFlower("Lily");
Garden.addFlower("Orchid");
Garden.addFlower("Daisy");
Garden.addFlower("Hibiscus");
Garden.addFlower("Marigold");
Garden.addFlower("Jasmine");

Garden.getAllFlower();
boolean isUpdated=Garden.updateFlower("Hibiscus","Iris");
System.out.println("Is flower name updated"+ isUpdated);
Garden.getAllFlower();

int  newLength = Garden.deleteFlower("Tatadecomo");
 System.out.println("Calling getAllFlowerPostDeletion");
 Garden.getAllFlowerPostDeletion(newLength);
}
}