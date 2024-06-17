abstract class RBI
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositeLimit();
}
	abstract class SBI extends RBI{
		String accountType;
		String userName;
		SBI(String accountType,String userName)
		{
			super();
			this.accountType=accountType;
			this.userName=userName;
		}

		public void displayDetails()
		{
			System.out.println("Account Type: "+this.accountType);
			System.out.println("Account Holder Name: "+this.userName);
		}
	} 

	abstract class Saving extends RBI{
		abstract void rateOfInterest();
		abstract void withdrawLimit();
		abstract void depositeLimit();

		RBI()
	}

	abstract class Current extends RBI{
		abstract void rateOfInterest();
	    abstract void withdrawLimit();
	    abstract void depositeLimit();
	}

class DemoExample1{
    Saving obj = new Saving();
    Current obj1 
}