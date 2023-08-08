package abstraction;

public class keyword extends abstractclass {
	
	final int a = 10;  // final is used for variable, method, class
		
	final public static void classA() {// this final method can not be override 
		System.out.println("this is final method");
	}
	
	static void test1()
	{
		System.out.println("this is super method");
	}
	
	public void test3()
	{
		System.out.println("this");
		
	}
	
	public void test2()
	{
		//System.out.println("this is  method");
		//super.test1();
		this.test3();
	}
	
	public static void main(String[] args) {
		keyword obj = new keyword();
		//obj.a = 20;
		System.out.println(obj.a);
		classA();
		obj.test2();
	}

	@Override
	void temp() {
		// TODO Auto-generated method stub
		
	}

}
