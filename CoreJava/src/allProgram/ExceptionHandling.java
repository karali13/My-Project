package allProgram;

public class ExceptionHandling {
	public void divide(int a,int b)
	{
		String s= "arise";
		
		
		try
		{
			System.out.println(a/b);
			System.out.println(s.charAt(3));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("wrong input");
		
		}
		System.out.println("thank you");
		
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.divide(10,2);
	}
}
