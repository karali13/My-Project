package oops_concept;

public class test1 extends test{
	
	String bhushan;
	
	void displayChild() {
		
		bhushan = "child";
		System.out.println(bhushan);
	}
	
	public static void main(String[] args) {
		
		test1 t1 = new test1();
		t1.displayChild();
		t1.displayParent();
		System.out.println(t1.karali);
	}

}
