package specifires;

public class nonpremitive {

	public static void main(String[] args) {
		String s = "Arise";
		String a = "arise";
		
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		boolean result = s.contains("rise");
		System.out.println(result);
		System.out.println(s.equals(a));
		System.out.println(s.toUpperCase());
	}
}
