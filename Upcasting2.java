class Parent{
}
class Child1 extends Parent{
}
class Child2 extends Parent{
}
class SubChild1 extends Child1{
}
class SubChild2 extends Child2{
}
class SubChild3 extends Child2{
} 

class Upcasting
{ 
	public static void main(String[] args) {
		SubChild1 obj = new SubChild1();
		// SubChild1 ob = new Child1();  //CTE
		Child2 obj1 = new Child2();
		Child2 obj2 = new SubChild2();
		// Child2 obj3 = new SubChild1(); //CTE
		Child2 obj4 = new SubChild3();
		Parent obj5 = new Child1();
		Parent obj6 = new Child2();
		Parent obj7 = new SubChild1();
		Parent obj8 = new SubChild2();
		Parent obj9 = new SubChild3();
	}
}