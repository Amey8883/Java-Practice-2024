import java.util.Arrays;

class Vehicle {
    String type;
    String category;
    int year;
    String manufacturer;
    double price;
    String model;

    Vehicle(String type, String category, int year, String manufacturer, double price, String model) {
        this.type = type;
        this.category = category;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
        this.model = model;
    }

    public void displayVehicle() {
        System.out.println("****Vehicle Details****");
        System.out.println("Type: " + this.type);
        System.out.println("Category: " + this.category);
        System.out.println("Year: " + this.year);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Price: " + this.price);
        System.out.println("Model: " + this.model);
    }
}

class Car extends Vehicle {
    String[] features;
    boolean isLuxury;

    Car(String[] features, boolean isLuxury, String type, String category, int year, String manufacturer, double price, String model) {
        super(type, category, year, manufacturer, price, model);
        this.features = features;
        this.isLuxury = isLuxury;
    }

    public void displayCar() {
        System.out.println("****Car Details****");
        System.out.println("Is it a Luxury Car? " + this.isLuxury);
        System.out.println("Features of the Car: " + Arrays.toString(this.features));
    }
}

public class SecondSingleInheritanceDriver {
    public static void main(String[] args) {
        String[] features = {"1. Automatic Transmission", "2. GPS Navigation", "3. Advanced Safety Features"};
        Car car = new Car(features, true, "Sedan", "Luxury", 2022, "Mercedes-Benz", 70000.0, "E-Class");
        car.displayVehicle();
        car.displayCar();
    }
}
