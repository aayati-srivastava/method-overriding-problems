// Parent class
class Vehicle {
    void speed() {
        System.out.println("Vehicle speed");
    }
}

// Car subclass
class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 100 km/h");
    }
}

// Bike subclass
class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike runs at 80 km/h");
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.speed(); // Output: Car runs at 100 km/h
        v2.speed(); // Output: Bike runs at 80 km/h
    }
}
