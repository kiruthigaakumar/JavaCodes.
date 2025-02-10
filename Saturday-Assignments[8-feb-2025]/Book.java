package com.celcom.assignments;
import java.util.ArrayList;
class Book1{
	String title;
	String author;
	int ISBN;
	
	Book1(String title,String author,int ISBN)
	{
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public int getISBN()
	{
		return ISBN;
	}
	
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
	    }
}
class BookCollection{
	ArrayList<Book1> books;
	BookCollection()
	{
		books=new ArrayList<>();
	}
	void addBook(Book1 book)
	{
		books.add(book);
		{
			System.out.println(book);
		}
	}
	void removeBook(int ISBN)
	{
		books.removeIf(book -> book.getISBN() == ISBN);
	}
	public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
        } else {
            System.out.println("Books in the collection:");
            for (Book1 book : books) {
                System.out.println(book);
            }
        }
}
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookCollection c=new BookCollection();
		Book1 b=new Book1("A","B",33);
		Book1 b1=new Book1("C","D",34);
		
		c.addBook(b);
		c.addBook(b1);
		c.displayBooks();
		c.removeBook(34);
		c.displayBooks();

	}

}
