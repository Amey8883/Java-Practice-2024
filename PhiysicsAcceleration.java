import java.util.Scanner;
class PhysicsAcceleration{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter a v0: ");
double v0 = sc.nextDouble();
System.out.print("Enter a v1: ");
double v1 = sc.nextDouble();
System.out.print("Enter a time span t: ");
double t= sc.nextDouble();

double acceleration = (v1-v0)/t;
System.out.println(v0+v1+" and t: "+ t +" accelaration "+acceleration);
}
}