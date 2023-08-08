package polymorphism;

public class overloading {
	
	public static void test()
	{
		System.out.println("no parameter");
	}
	
	public void test(String a) 
	{
		System.out.println("one parameter");
	}
	public String test(String a, int b) {
		System.out.println("a single parameter");
		return "a";
	}
	
	public static void main(String[] args) {
		overloading obj = new overloading();
		obj.test("ggggg");
		obj.test("hhhh", 0);
		//obj.test();
	}

}
