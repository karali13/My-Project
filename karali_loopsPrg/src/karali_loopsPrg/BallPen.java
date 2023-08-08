package karali_loopsPrg;

public class BallPen{
	
	String brand;  //GLobal Variable
	int price;
	String ink;
	static String company="CELLO";
	
	public BallPen() {
		
	}
	
	

	public BallPen(String brand, int price, String ink) {
		super();
		this.brand = brand;
		this.price = price;
		this.ink = ink;
	}



	public String penFunction()
	{
		
		return "brand is "+brand+" price is "+price+" Ink Color is "+ink ;
	}	
	
	public static void pencil()
	{
		System.out.println("this is pen class");
	}
	
	public static void main(String[] args) {
		BallPen ballpen = new BallPen();
		ballpen.brand="Finegrip";
		ballpen.price=10;
		ballpen.ink="Blue";
	    BallPen.pencil();
		System.out.println(BallPen.company);
		System.out.println(ballpen.penFunction());
		
		BallPen ballpen2= new BallPen("Gripper",20,"Red");
		
		System.out.println(ballpen2.penFunction());
		System.out.println(ballpen);
		System.out.println(ballpen2);
		
	}
}
