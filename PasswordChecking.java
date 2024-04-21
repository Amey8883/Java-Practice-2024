import java.util.*;
class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException 
	{
	   Scanner sc = new Scanner(System.in);
	   
	   	
	   int attempt = 1;
	   for(; ;){
	   	int storedPin =  123;
	   	int count = 3;
	   	do{
	   		System.out.print("Enter your pin: ");
	   		int userPin = sc.nextInt();
	   		if(userPin == storedPin)
	   		{
	   			System.out.println("Welcome");
	   			break;
	   	}else{
	   		System.out.println("Wrong Pin Attempts left "+(count-1));
	   		System.out.println(count);
	   	}
	   	if(count == 1)
	   	{
	   		Thread.sleep(5000);
	   		System.out.println("YOU CAN TRY TO ENTER YOUR PIN AGAIN");
	   	}
	   	count--;
	   }while(count>=1);

	   if(attempt++ ==2){
	   	break;
	   }
	}
} 
}

