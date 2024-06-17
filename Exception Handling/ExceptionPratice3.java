class ExceptionPratice3
{
	public static void main(String[] args) {
		System.out.println("Exe starts");
		try
		{
			throw new NullPointerException("NullPointerException thrown explicitly");
		}
		catch(NullPointerException npe)
		{
			npe.printStackTrace();
		}
		System.out.println("Exe ends");
	}
}