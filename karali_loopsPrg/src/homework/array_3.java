package homework;

public class array_3 {
	public static void main(String[] args) {
		int [] a = {70, 20, 90, 40};
		int b= a.length-1;
		//for(int i=0; i<=b; i++)
		
			//System.out.println(a[i]);
			if(a[0]>a[1] && a[0]>a[2] && a[0]>a[3] )
			{
				System.out.println(a[0]+" is max");
			}
			else if(a[1]>a[2] && a[1]>a[3])
			{
				System.out.println(a[1]+" is max");
			}
			else if(a[2]>a[3])
			{
				System.out.println(a[2]+" is max");
			}
			else {
				System.out.println(a[3]+" is max");
			}
			
		
	}

}

