package a;

public class Demo2Primitives {
	
	public static void main(String[] args) {
		// integer nuberals
		byte n1 = 5; // 8 bit
		short n2 = 5; // 16 bit
		int n3 = 5; // 32 bit
		long n4 = 5; // 64 bit
		long n5 = 9999999999L; // 64 bit
		
		System.out.println(5); // literal integer is of type int
		System.out.println(5D); // literal type can be changed
		System.out.println(5.6); // literal decimal is double
		
		System.out.println(0.3333333333333333333333333333333333333D);
		System.out.println(0.3333333333333333333333333333333333333F);
		
		// decimal numerlas
		float f1 = 5.3F; // 32 bit
		double f2 = 5.3; // 64 bit
		
		// logical - boolean
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 < 100;
		boolean b4 = 10 > 100;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// characters
		char c1 = 'A';
		char c2 = 'à';
		char c3 = '5';
		char c4 = '.';
		char c5 = ' ';
		char c6 = '\n'; // new line character
		char c7 = '\t'; // tab character
		
	}

}
