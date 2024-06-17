import java.util.*;
import java.util.Scanner;
class FruitStore
{
	String fruits[];
	static Scanner sc = new Scanner(System.in);

	public void storeFruits(String fruits[])
	{
		this.fruits = fruits;
		for(int i=0;i<fruits.length;i++)
		{
			fruits[i] = sc.next();
		}
	}

	public void changeFruit()
	{
		
		System.out.println("Enter the fruit: ");
		String inputFruit = sc.next();

		for(int i = 0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
				System.out.println("Matches");
				System.out.println("Enter new fruit To Update");
				String newFruit = sc.next();
				fruits[i] = newFruit;
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		System.out.println("Enter the fruits: ");
		String fruits[] = new String[size];

		FruitStore f = new FruitStore();
		f.storeFruits(fruits);

		f.displayFruits();
		f.changeFruit();
	}
}