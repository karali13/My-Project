package specifires;

public class ap2 {
	 int a= 1;
	 public int b= 2;
	 private int c= 3;
	 protected int d= 4;
	
		 public static void test() {
			 System.out.println("test is public method");
			 
		 }
		 
		 void test2() {
			 System.out.println("test 2 is default method");
			
		 }
		 
		 private void test3() {
			 System.out.println("test3 is private method");
		 }
		 
		 protected static void test4() {
			 System.out.println("test4 is protected method");
			 ap2 v= new ap2();
			 System.out.println(v.d);
			
		 }
			
			 
		 
		 public static void main(String[] args) {
			//ap2 obj1= new ap2();
			//obj1.test();
			ap2 obj2= new ap2();
			obj2.test2();
			System.out.println(obj2.a);
			
			ap2 obj3= new ap2();
			obj3.test3();
			
			ap2.test4();
			
			
		}
}
