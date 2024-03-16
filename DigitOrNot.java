import java.util.Scanner;
class DigitOrNot{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the digit: ");
int num = sc.nextInt();
System.out.println( ( (num>=0 && num<=9) )?"Its didgit":"Its not digit");
}
}