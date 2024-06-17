class Bank{
	String accountHolderName;
	private int psw;
	String branch;
	String address;
	private double balance;
	String ifsc;

	Bank(String accountHolderName,int psw,String branch,String address,double balance,String ifsc)
	{
		this.accountHolderName=accountHolderName;
		this.psw=psw;
		this.branch=branch;
		this.address=address;
		this.balance=balance;
		this.ifsc=ifsc;
	}

	public String getaccountHolderName()
	{
		return accountHolderName;
	}

	public int getpsw()
	{
		return psw;
	}

	public String getbranch()
	{
		return branch;
	}

	public String getaddress()
	{
		return address;
	}

	public double getbalance()
	{
		return balance;
	}

	public String
	 getifsc()
	{
		return ifsc; 
	}



	public void setaccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}

	public void setpsw(int psw)
	{
		this.psw=psw;
	}

	public void setbranch(String branch)
	{
		this.branch=branch;
	}

	public void setaddress(String address)
	{
		this.address=address;
	}

	public void setbalance(double balance)
	{
		this.balance=balance;
	}

	public void setifsc(String ifsc)
	{
		this.ifsc=ifsc;
	}

	public void PrintDetails()
	{
	System.out.println(accountHolderName);
	System.out.println(psw);
	System.out.println(branch);
	System.out.println(address);
	System.out.println(balance);
	System.out.println(ifsc);		
	}
}
class BankDriver{
	public static void main(String[] args) {
		Bank obj = new Bank("Amey",143,"Mangal grah","Andheri nagar aur shamshan ke samne",0.5,"icici023");
	}
}