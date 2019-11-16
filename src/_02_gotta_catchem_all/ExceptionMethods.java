package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static void main(String[] args) {
		
		System.out.println(reverseString("Hello"));
		
	}
	
	static double divide(double x, double y)throws IllegalArgumentException {
		if(y == 0) {
			throw new IllegalArgumentException();
			
		}
		return x/ y;
	}
	static String reverseString(String str) throws IllegalStateException{
		if(str.equals("")) {
			throw new IllegalStateException();
			
		}
	String reverse = "";
		for(int i = str.length() -1; i >= 0; i --	) {
			reverse += str.charAt(i);
			
		}
		return reverse;
	}
	
}
