class CheckedException1
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=100;i++)
			System.out.println(i+" ");
		Thread.sleep(3000);  //error: unreported exception InterruptedException; must be caught or declared to be thrown
	}
}