package homework;

public class array_2 {
	public static void main(String[] args) {
		String [] s= {"akash", "harshada", "kajal"};
	
		for(int i=0; i<=s.length-1; i++)
		{
			String a =s[i];
			String c="";
			for(int j= a.length()-1; j>=0;j--)
			{
				c= c+(a.charAt(j) );
				
			}
			
			System.out.println(c.toUpperCase());
			}
		}
}
