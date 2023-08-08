package homework;

public class array_4 {
 public static void main(String[] args) {
	int a[]= {20, 40, 30, 10};
	int b= a.length-1;
	int max=0;
	for(int i=0; i<=b; i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
	
}
}
