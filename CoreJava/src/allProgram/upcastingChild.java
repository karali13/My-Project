package allProgram;

public class upcastingChild extends Upcasting{
	public static void classB()
	{
		System.out.println("child class static method");
	}
	
	public  void classA()
	{
		System.out.println("This is upcasting");
	}
	 public static void main(String[] args) {
		Upcasting obj = new upcastingChild();//upcasting
		obj.classA();
		
		Upcasting.classB();
		Upcasting.classC();

	}
}
