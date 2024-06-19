class ASCIIValueWithAsciiChar{
	public static void main(String[] args) {
		// int asciiValue = 65;
		for(char ch = 'A'; ch<='Z';ch++)
		{
			// System.out.print((ch+0)+"->"+ch+" ");
			// System.out.print(asciiValue++ +"->"+ ch+" ");
			System.out.print((int)ch+ "->"+ch+" ");
		}
	}
}