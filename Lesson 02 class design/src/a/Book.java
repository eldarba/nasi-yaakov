package a;

public class Book {

	/*
	 * public, private (access modifier)
	 * 
	 * static (a modifier that relates a member to the class rather than instance)
	 * 
	 * final (a modifier that fixes the value of a variable after initialization)
	 * 
	 * static + final (constants)
	 * 
	 * this. (a reference to the current instance)
	 * 
	 * ==== NOT seen yet
	 * 
	 * super.
	 * 
	 * this()
	 * 
	 * super()
	 * 
	 * abstract
	 * 
	 * other uses of final
	 * 
	 * extends
	 * 
	 * implements
	 * 
	 */

	public static final double MAX_PRICE = 200D; // constant (static + final)

	// class variables (static)
	private static int numberOfBooksCreated;

	// class methods
	public static int getNumberOfBooksCreated() {
		return numberOfBooksCreated;
	}

	// attributes - usually private (encapsulation)
	// instance variables
	private final int id; // a final field
	private String title;
	private String author;
	private double price;

	// CTORs
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id; // the word 'this' is a reference to the current instance
		this.title = title;
		this.author = author;
		setPrice(price);
		numberOfBooksCreated++;
	}

	public Book(int id) {
		super();
		this.id = id;
		numberOfBooksCreated++;
	}

	// instance methods
	// get / set methods
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0 && price <= MAX_PRICE) {
			this.price = price;
		}
	}

}
