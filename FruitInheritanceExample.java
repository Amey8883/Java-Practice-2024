import java.util.Arrays;

class Fruit {
    String name;
    String color;
    int weight;
    String origin;
    double price;
    String season;

    Fruit(String name, String color, int weight, String origin, double price, String season) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
        this.price = price;
        this.season = season;
    }

    public void displayFruit() {
        System.out.println("****Fruit Details****");
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight + " grams");
        System.out.println("Origin: " + this.origin);
        System.out.println("Price: $" + this.price);
        System.out.println("Season: " + this.season);
    }
}

class Apple extends Fruit {
    String[] types;
    boolean isOrganic;

    Apple(String[] types, boolean isOrganic, String name, String color, int weight, String origin, double price, String season) {
        super(name, color, weight, origin, price, season);
        this.types = types;
        this.isOrganic = isOrganic;
    }

    public void displayApple() {
        System.out.println("****Apple Details****");
        System.out.println("Is it Organic? " + this.isOrganic);
        System.out.println("Types of Apples: " + Arrays.toString(this.types));
    }
}

public class FruitInheritanceExample {
    public static void main(String[] args) {
        String[] types = {"Gala", "Fuji", "Granny Smith"};
        Apple apple = new Apple(types, true, "Apple", "Red", 150, "USA", 1.5, "Fall");
        apple.displayFruit();
        apple.displayApple();
    }
}
