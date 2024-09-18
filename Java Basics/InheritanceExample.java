// This java file will help you understand the concept of Inheritance
// I used a simple and logical example of a parent class called 
// Vehicle, and its 2 child classes Car and Bike



// Here are the OOP concepts covered by the below code:

// Inheritance
// Polymorphism
// Method Overriding
// Super Keyword
// Constructors
// Encapsulation
// Class and Object
// Abstraction (Partial - Generalization through Vehicle)

// Detailed Explanation is provided at the end of the code


    
class Vehicle{

    int speed;
    String brand;

    // IMP: Constructors cannot have a 
    // return type (like void, int, String)

    public Vehicle(int s, String b){
        this.speed = s;
        this.brand = b;
    }

    public void displayDetails(){
        System.out.println("Speed of Vehicle is: " + speed + "km/hr");
        System.out.println("The brand of the car is: " + brand);
    }

    public void start(){
        System.out.println("Vehicle has been started!");
    }
}

class Car extends Vehicle{

    int numOfDoors;

    public Car(int n, int s, String b){
        // Super call must be the first
        // statement in a constructor
        super(s, b);
        this.numOfDoors = n;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numOfDoors);
    }
    
    // Overriding the start method of Vehicle class
    @Override
    public void start() {
        System.out.println("The car is starting with a key ignition.");
    }

}


class Bike extends Vehicle{

    boolean hasCarrier;

    public Bike(boolean hc, int s, String b){
        super(s,b);
        this.hasCarrier = hc;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Carrier: " + hasCarrier);
    }
    
    // Overriding the start method of Vehicle class
    @Override
    public void start() {
        System.out.println("The bike is starting with a kick.");
    }

}
    

public class InheritanceExample {
    public static void main(String[] args) {

        // Creating a Car object
        Car myCar = new Car(4, 180, "Toyota");
        System.out.println("Car Details:");
        myCar.displayDetails();  // Calls the Car's version of displayDetails
        myCar.start();  // Calls the overridden start method of Car
        
        System.out.println();
        
        // Creating a Bike object
        Bike myBike = new Bike(true, 120, "Yamaha");
        System.out.println("Bike Details:");
        myBike.displayDetails();  // Calls the Bike's version of displayDetails
        myBike.start();  // Calls the overridden start method of Bike
    }
}



// Detailed Explanation

// Inheritance:
// The Car and Bike classes inherit from the Vehicle class, gaining access
// to its properties and methods.

// Polymorphism:
// The start() method is overridden in both Car and Bike, allowing the 
// same method to behave differently depending on the object type.

// Method Overriding:
// Both Car and Bike classes override the start() method of the Vehicle class 
// to provide their specific implementations.

// Super Keyword:
// The super() call in the constructors of Car and Bike invokes the constructor 
// of the Vehicle class to initialize shared properties like speed and brand.

// Constructors:
// Each class has its constructor to initialize the properties of the objects 
// when they are created, ensuring proper setup of class-specific attributes.

// Encapsulation:
// The attributes speed, brand, and methods like start() are bundled within 
// the Vehicle class, keeping related data and functionality together.

// Class and Object:
// Vehicle, Car, and Bike are classes, while myCar and myBike are objects 
// created from those classes, demonstrating object instantiation.

// Abstraction (Partial - Generalization through Vehicle):
// The Vehicle class defines common properties and methods shared by 
// all vehicles (like speed, brand, and start()), while leaving the 
// specific details (e.g., car ignition, bike kick start) to be implemented 
// in the Car and Bike subclasses. This provides a generalized blueprint 
// without needing to define how every type of vehicle behaves.
