package b;

public class ScopeDemo {

	public static void main(String[] args) {

		{
			int x = 5;
			System.out.println(x);
		}

		System.out.println("first x is no longer in memory");

		{
			int x = 10;
			System.out.println(x);
		}

	}

}
