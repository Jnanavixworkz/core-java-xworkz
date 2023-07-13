class IceCream2Tester{
public static void main(String flovors[]){
 IceCream2.addFlavor("STRABERRY");
 IceCream2.addFlavor("BUTTER PECAN");
 IceCream2.addFlavor("ROCKY ROAD");
 IceCream2.addFlavor("VANILLA");
 IceCream2.addFlavor("MINT CHOCOLATE");
 IceCream2.addFlavor("COOKIES CREAM");
 IceCream2.addFlavor("PURPLE CREAM");
 IceCream2.getAllFlavorsNames();
 boolean isUpdated= IceCream2.updateFlavorsNames("PURPLE CREAM","YELLOW MINT");
 System.out.println("Is flavor name updated" + isUpdated);
 IceCream2.getAllFlavorsNames();
 
 int  newLength = IceCream2.deleteFlavorsNames("VANILLA");
 System.out.println("Calling getAllFlavorsNamesPostDeletion");
 IceCream2.getAllFlavorsNamesPostDeletion(newLength);
}
}