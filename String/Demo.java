class Demo
{
	public static void main(String[] args) 
	{
		String name1 = "kartik";
		String name2 = "kanchana";
		String name3 = "komala";
		String name4 = "";

		String convertedCaps = name1.toUpperCase();
		int length = name3.length();
		char singleCharacter = name1.charAt(2);
		String mergedName = name1.concat(name2);

		String multipleChars = name2.substring(5,8); //ana
		String singleCharacter2 = name3.substring(0,1); //k
		boolean emptyOrNot = name4.isEmpty();

		System.out.println(convertedCaps);
		System.out.println(length);
		System.out.println(singleCharacter);
		System.out.println(mergedName);
		System.out.println(multipleChars);
		System.out.println(singleCharacter2);
		System.out.println(emptyOrNot);
	}
}