import java.util.Scanner;
class FindNumbersOfYears{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a minutes: ");
long minutes = sc.nextLong();
long years = minutes / (60*24*365);
long days = (minutes % (60*24*365))/(60*24);
System.out.println(minutes+" is "+years+" years "+" and "+days+" days");
}
}