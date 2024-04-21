class ArmstrongNumber{
	public static void main(String[] args) {
		int num = 153;
		int length = 0;
		int dup = num;
		int dup1 = num;
		int sum = 0;
        
        // 1. 153!=0(true)
        // 2. 15!=0(true)
        // 3. 1!=0(true)
        // 4. 0!=0(false)
		while(num!=0)
		{
			length++;  // 0(1)  1(2)  2(3)
			num/=10;   //1. 153/10 => 15
		}              //2. 15/10 => 1
                       //3. 1/10 => 0
        // length => 3

        //1. 153>0 =>true
        //2. 15>0 =>true
		while(dup>0)
		{
			//1. 3 = 153%10
			//2. 5 = 15%10
			int rem = dup%10;
			int power = 1; //1

			//1. 1=1;    1 <=3   ;
			//2.        2<=3(true);1(2)
			//3.        3<=3(true);2(3)
			//4.        4<=3(false);3(4)


			for(int i=1;i<=length;i++)
			{
				power = power * rem;
				//1. 1*3 => 3
				//2. 3*3 => 9
				//3. 9*3 => 27


				//1. 1*5 => 5
				//2. 5*5 => 25
				//3. 25*5 => 125
			}
			sum += power;
			//1. 0 + 27 => 27
			//2. 27 + 125 => 152
			dup /=10;
			//1. 153/10 => 15
			//2. 15/10 => 1
		}

		// 153 == 153
		if(sum == dup1)
		{
			System.out.println("ARMSTRONG");
		}else{
			System.out.println("NOT ARMSTRONG");
		}
	}
}




