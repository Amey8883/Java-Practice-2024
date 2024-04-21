 class Machine {
    String brand;
    String modelNumber;
    double price;
    String color;
    String buttonType;
    String type;

    public void displayMachine() {
        System.out.println("*** WASHING MACHINE DETAILS ****");
        System.out.println("Brand: " + brand);
        System.out.println("modelNumber: " + modelNumber);
        System.out.println("price: " + price);
        System.out.println("color: " + color);
        System.out.println("buttonType: " + buttonType);
        System.out.println("type: " + type);
    }
}

public class WashingMachine {
    public static void main(String[] args) {
        Machine obj = new Machine();
        obj.brand = "LG";
        obj.modelNumber = "WA12341";
        obj.price = 50000;
        obj.color = "Silver";
        obj.buttonType = "Touch Screen";
        obj.type = "Top Loaded";
        obj.displayMachine();

        Machine obj2 = new Machine();  // Use obj2 instead of obj
        obj2.brand = "SAMSUNG";
        obj2.modelNumber = "SA12341";
        obj2.price = 70000;
        obj2.color = "Black";
        obj2.buttonType = "Normal";
        obj2.type = "Front Loaded";
        obj2.displayMachine();

    }
}
