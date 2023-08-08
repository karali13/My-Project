package allProgram;

public class ReverseSring {
	
	public static void main(String[] args) {
		String a = "karali";
		int b= a.length();
		String result="";
		for(int i=b-1; i>=0; i--)
		{
			result=result+a.charAt(i);
			
		}
			System.out.println(result);
		}
	}

