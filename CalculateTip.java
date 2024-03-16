import java.util.Scanner;
class CalculateTip{

public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter subtotal bill: ");
double subTotal = sc.nextDouble();

System.out.println("Enter the tip rate: ");
double tipRate= sc.nextDouble();

double total = subTotal + tipRate*(subTotal/100);
System.out.println("Subtotal is "+subTotal+" and the tip is "+tipRate+"and  "+total+".");
System.out.println("Thank you visit again");
}
}