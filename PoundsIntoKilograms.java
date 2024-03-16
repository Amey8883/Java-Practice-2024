import java.util.Scanner;
class PoundsIntoKilograms{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter pounds: ");
double pounds = sc.nextDouble();
double kiloGrams = pounds * 0.454;
System.out.println(pounds+" is "+kiloGrams+" kilograms");
}
}