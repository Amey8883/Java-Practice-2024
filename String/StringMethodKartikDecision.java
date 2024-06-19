class karthikGfException extends Exception
{
	String message;
	karthikGfException(String message)
	{
	super(message);
	}
}

class StringMethodKartikDecision
{
	public static void main(String[] args) 
	{
		String karthikGf = "";
		String karthikWife = "katrina";

        if(karthikGf.isEmpty())
        {
        	try{
        		 throw new karthikGfException("kathik does not have any GF");
        	}
        
        catch(Exception e)
        {
        	e.printStackTrace();
        	if(karthikWife.isEmpty())
        	{
        		System.out.println("Karthik does not have wife");
        	}
        	else
        	{
        		System.out.println("Wife name: "+karthikWife);
        	}
        }
        }
	}
}