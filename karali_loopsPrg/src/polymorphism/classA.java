package polymorphism;

public class classA {
	
	public void father()
	{
		System.out.println("I am parent");
		
	}
	
	public void father(int a)
	{
		System.out.println("I am children no 1");

	}
	public void father(int a, int b)
	{
		System.out.println("I am children no 2");

	}
	
	public static void main(String[] args) {
		classA obj= new classA();
		//obj.father();
		obj.father();
		obj.father(2, 0);
	}
}
