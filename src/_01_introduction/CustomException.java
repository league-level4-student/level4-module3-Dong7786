package _01_introduction;

public class CustomException extends Exception{

	public static void main(String[] args) {
		try {
			testMethod2(-1);
			System.out.println("Try");
		}catch (Exception x){
			System.out.println("Catch");
			
		}
		
	}
	
	static void testMethod2(int x) throws Exception{
		if(x < 0) {
			throw new Exception();
			
		}
	}
	
	void Terminate() {
		System.exit(0);
	}
	
}
