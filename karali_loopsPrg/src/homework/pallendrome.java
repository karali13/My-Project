package homework;

public class pallendrome {
	 public static void main(String[] args) {
		String a= "mom";
		String c ="";
		int b = a.length();
		for(int i= b-1; i>=0; i-- ) {
			System.out.print(a.charAt(i));
			c=c.concat(""+a.charAt(i));
		}
		
		if(a.equals(c))
			System.out.println(" String  is palindrom");
		else
			
			System.out.println(" Not a palindrom");
		if(a==c)
			System.out.println(" String  is palindrom");
		else
			System.out.println(" Not a palindrom");
	}
}
