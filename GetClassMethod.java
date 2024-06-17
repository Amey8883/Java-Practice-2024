class GetClassMethod{
	public static void main(String[] args) {
		Student obj1 = new Student("RAMESH","PUNE","MCA");
		System.out.println(obj1.getClass());
		
		String str = new String();
		System.out.println(str.getClass());
		// Linkedlist obj = new Linkedlist("RAMESH","PUNE","MCA");
		// System.out.println(obj.getClass());
	}
}