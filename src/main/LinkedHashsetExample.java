package main;

import java.util.LinkedHashSet;

class Book{
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
}
public class LinkedHashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Book> hs = new LinkedHashSet<>();
		//creating books
		Book b1 = new Book(101, "let us c", "bro what kinda name is that", "vanier college", 8);
		Book b2 = new Book(102, "data communications and bla bla bla", "raiven simbajon", "dawson college", 4);
		Book b3 = new Book(103, "operating system", "joe biden", "dc retirement homes", 6);
		//adding books to hash table
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		//traversing hash table
		for (Book b:hs) {
			System.out.println(b);
		}
	}

}
