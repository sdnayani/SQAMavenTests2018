package week3.day3.classes;

public class BicycleDemoConstructors {

	public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();  //bike1 is firstInstance.
        Bicycle bike4 = new Bicycle();   //bike2 is secondInstance
        //Bicycle bike2 = new Bicycle();   //bike2 is secondInstance
        //Invoiking Constructors.
       BicycleUsingConstructors myBike = new BicycleUsingConstructors(30, 0, 8);
       BicycleUsingConstructors myBike1 = new BicycleUsingConstructors();
       myBike.printStates();
       myBike1.printStates();
       
       
}

}
