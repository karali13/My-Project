package karali_loopsPrg;

public class karali {

	int a=5;
	int b=10;
	int c;
	//static method
	public static void addition() {
			System.out.println("c");
			
	}
	//non static
	public void substraction() {
		System.out.println(b);
	}
	
	//access specifier
	public void one() {
		System.out.println("this is public access specifier");
	}
	
	void two() {
		
		System.out.println("default");
	}
	 protected void three() {
		 System.out.println("protected");
	 }
	private void four() {
		System.out.println("private");
	}
	
	public static void main(String[] args) {
		karali.addition();
		karali obj =new karali();
		obj.substraction();
		
		karali obj1 = new karali();
		obj1.one();
		
		karali obj3 = new karali();
		obj3.two();
		
		karali obj2 = new karali();
		obj2.three();
		
		karali obj4 = new karali();
		obj4.four();
	}
}
