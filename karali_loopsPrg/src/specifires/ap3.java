package specifires;

public class ap3 {
	 static int a= 10;
	
	static void demo1() {
		System.out.println("this is a static method");
		System.out.println(a);
	}
	
	void demo2() {
		System.out.println("this is a Non-static method");
		System.out.println(a);

	}
	
	public static void main(String[] args) {
	ap3 obj=new ap3();
	obj.demo2();
	
	ap3.demo1();
		
	}

}
