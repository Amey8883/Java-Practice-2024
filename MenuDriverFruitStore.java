import java.util.*;
class MenuDriverFruitStore
{
    static Scanner sc = new Scanner(System.in);
    String fruits[];

    public static void main(String[] args) 
    {
        MenuDriverFruitStore m = new MenuDriverFruitStore();

        System.out.print("Enter the Size: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume the newline

        System.out.println("Enter Fruit elements: ");
        String fruits[] = new String[size];

        m.storeFruits(fruits);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display Fruits");
            System.out.println("2. Change Fruit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    m.displayFruits();
                    break;
                case 2:
                    m.changeFruit();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void storeFruits(String fruits[])
    {
        this.fruits = fruits;
        for (int i = 0 ; i < fruits.length ; i++)
        {
            fruits[i] = sc.next();
        }
    }

    public void displayFruits()
    {
        System.out.println(Arrays.toString(fruits));
    }

    public void changeFruit()
    {
        System.out.println("Enter the fruit to update: ");
        String inputFruit = sc.next();
        for (int i = 0 ; i < fruits.length ; i++)
        {
            if (inputFruit.equals(fruits[i]))
            {
                System.out.println("Enter new fruit: ");
                String updateFruit = sc.next();
                fruits[i] = updateFruit;
                break;
            }
        }
    }    
}
