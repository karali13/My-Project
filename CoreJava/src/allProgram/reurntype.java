package allProgram;

public class reurntype {
	
	int a=10,b=20,c;
	
	
	public int test()
	{
		c=a+b;
		
		System.out.println(c);
		return c;
		}
		
	
	public static reurntype test1()
	{
		reurntype obj =new reurntype();
		return obj;
	}
	
	public static void main(String[] args) {
		reurntype obj=test1();
		
		
		obj.test();
	}
	
}
