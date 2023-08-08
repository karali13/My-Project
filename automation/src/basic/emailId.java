package basic;

public class emailId {
	
	public static void main(String[] args) {
		String a = "karalibaviskar@abc";
		int b = a.length();
		int i =0;
	
	for(i=0; i<b;i++)
		
	{

		if(a.charAt(i)== '@')
		{
			
			
			break;
		}
		System.out.print(a.charAt(i));

		
	}
	}

}
