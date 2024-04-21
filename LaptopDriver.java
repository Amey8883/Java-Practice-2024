 class Laptop {
    String brand;
    String modelNumber;
    double price;
    int ram;
    int rom;
    String processor;
    String type;

    public void displayLaptop() {
        System.out.println("*** LAPTOP DETAILS ****");
        System.out.println("Brand " + brand);
        System.out.println("modelNumber " + modelNumber);
        System.out.println("price " + price);
        System.out.println("ram " + ram);
        System.out.println("rom " + rom);
        System.out.println("processor " + processor);
        System.out.println("type " + type);
    }
}

public class LaptopDriver {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand = "HP";
        obj.modelNumber = "HP12341";
        obj.price = 50000;
        obj.ram = 0;
        obj.rom = 512;
        obj.processor = "17";
        obj.type = "Gaming";
        obj.displayLaptop();

        Laptop obj2 = new Laptop();  // Use obj2 instead of obj
        obj2.brand = "HP";
        obj2.modelNumber = "HP12341";
        obj2.price = 70000;
        obj2.ram = 16;
        obj2.rom = 1024;
        obj2.processor = "19";
        obj2.type = "Gaming";
        obj2.displayLaptop();

    }
}
