package homework;

public class find_space {
	public static void main(String[] args) {
		String y ="ab cd ef gh ij";
		int count=0;
		int z= y.length();
		for(int i=0; i<z; i++) 
		{
		 if(y.charAt(i)== ' ')
		 {
			 count++;
		 }
		
		
		}
		System.out.println(count);
}
}
