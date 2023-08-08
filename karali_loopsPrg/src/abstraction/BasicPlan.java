package abstraction;

public interface BasicPlan {
	
	int a = 10; // variable is static, public and final
	
	void one();
	
	public static void two() {
		System.out.println("this is static and complete method");
		System.out.println(a);

	}
	
	 public static void main(String[] args) {
		 two();
		 System.out.println(a);
		 
	}
}

