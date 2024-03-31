class TechNumber
{
	public static void main(String[] args) {
		int num = 2025;
		int dup = num;
		int length = 0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		if(length%2==0){
			int div =1;
			for(int i=1;i<=length/2;i++)
			{
				div*=10;
			}
			int firsthalf = dup/div;
			int lasthalf = dup%div;
			int sum = firsthalf+lasthalf;
			int sqr = sum * sum;
			System.out.println(dup == sqr?dup +"tech Number":dup+" not a tech number");
		}else
		{
			System.out.println("Not a tech number");
		}
	}
}