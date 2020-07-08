package a;

public class TestBook {

	public static void main(String[] args) {

		Book b = new Book(101);

		System.out.println(b.getId());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());

		System.out.println("===========");
//		b.setId(101);
		b.setTitle("Java 101");
		b.setAuthor("Eldar B");
		b.setPrice(30);

		System.out.println(b.getId());
		System.out.println(b.getTitle());
		System.out.println(b.getAuthor());
		System.out.println(b.getPrice());

		System.out.println("===========");
		Book b2 = new Book(201, "aaa", "bbb", 555);
		System.out.println(b2.getId());
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());

	}

}
