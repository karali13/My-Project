package karali_loopsPrg;

public class prime_number {

	public static void main(String[] args) {
		int a=12;
		int b=2;
		int count =0;
		
		while(a>b) {
			if(a%b==0) {
				count++;
			}
			b++;
		}
		if(count==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
		
		
	}
	
}
