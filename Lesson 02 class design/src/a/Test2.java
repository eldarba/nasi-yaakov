package a;

public class Test2 {

	public static void main(String[] args) {

		// static reference (using the class name)
		System.out.println(Book.getNumberOfBooksCreated());

		Book book1 = new Book(101);
		Book book2 = new Book(102);
		Book book3 = new Book(103);

		System.out.println(Book.getNumberOfBooksCreated());

//		Book.numberOfBooksCreated = 1000;

		// dynamic reference (using an instance reference)
		book1.setPrice(50);

	}

}
