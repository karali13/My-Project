package polymorphism;

public class classB extends classA {
	
	public void father() {
		System.out.println("Father");
	}
	
	public static void main(String[] args) {
		classB obj1 = new classB();
		obj1.father();
	}
	

}
