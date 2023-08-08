package homework;

public class primeNumber {
	public static void main(String[] args) {
		for(int a=2; a<=100;a++) {
			int count =0;
			for(int j=2;j<a;j++) {
				if(a%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(a);
			}
			
		}
	}

}
