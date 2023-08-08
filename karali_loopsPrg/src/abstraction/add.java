package abstraction;
import java.util.Scanner;
public class add {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter name");
		String name = scan.nextLine();
		
		
		System.out.println("enter your age");
		int age = scan.nextInt();
		System.out.println(name);
		System.out.println(age);
	}

}
