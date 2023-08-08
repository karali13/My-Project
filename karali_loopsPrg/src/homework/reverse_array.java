package homework;

public class reverse_array {
	public static void main(String[] args) {
		String [] s= {"akash", "harshada", "kajal"};
		
		
	
		for(int i=0; i<=s.length-1; i++)
		{
			String a =s[i];
			String c="";
			for(int j= a.length()-1; j>=0;j--)
			{
				//System.out.print(a.charAt(j) );
				char b=(a.charAt(j));
				c=c.concat(b+"");
				
				
			}
			
			System.out.println(c.toUpperCase());
			}
		}
	}
