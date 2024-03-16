import java.util.Scanner;
class AlphabetLowerUpper{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the character: ");
char ch = sc.next().charAt(0);

  if ( (ch>='A'&& ch<='Z') || (ch>='a' && ch<='z') )
{
  System.out.println("The character is an alphabet");

   if(ch>='a' && ch<='z'){
   System.out.println("The alphabet is lowercase");
}else{
    System.out.println("The alphabet is uppercase");
}
}
else
{
   System.out.println("The character is not alphabet.");
}
}
}
