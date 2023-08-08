package basic;

public class childclass extends openbrowser {
	
	public static void classB()
	{
		System.out.println("child class");
	}
	
	
	public static void main(String[] args) {
		openbrowser abc = new childclass();
		System.out.println(abc);
		
	}

}
