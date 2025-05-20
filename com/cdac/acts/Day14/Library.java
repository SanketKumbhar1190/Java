package com.cdac.acts.Day14;
import java.util.HashMap;
import java.util.Map.Entry;
/*
1. Use HashMap, LinkedHamap and TreeMap (Create separate tester for
each type of Map)
Book details: title, bookType(enum), price, publishedDate, authorName,
quantity
Unique ID: book title
Get data from user and store Books in HashMap
Menus
1 Add book.
2 Display All books
3 Allot book to student (quantity -1). Find by book title
4 Take book return (quantity +1) Find by book title
5 Remove book
Handle exceptions for duplicate book entries and
BookNotFoundException

 */
import java.util.UUID;
import java.time.LocalDate;

public class Library {

	private static int counter=100;
	private int id;
	private String title;
	private BookType booktype;
	private int price;
	private LocalDate pubDate;
	private String authname;
	private int qty;


	public Library(String title, BookType booktype, int price, LocalDate pubDate, String authname, int qty) {
		this.id = counter++;
		this.title = title;
		this.booktype = booktype;
		this.price = price;
		this.pubDate = pubDate;
		this.authname = authname;
		this.qty = qty;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getBooktype() {
		return booktype;
	}

	public void setBooktype(BookType booktype) {
		this.booktype = booktype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getPubDate() {
		return pubDate;
	}

	public void setPubDate(LocalDate pubDate) {
		this.pubDate = pubDate;
	}

	public String getAuthname() {
		return authname;
	}

	public void setAuthname(String authname) {
		this.authname = authname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return " [title=" + title + ", booktype=" + booktype + ", price=" + price + ", pubDate=" + pubDate
				+ ", authname=" + authname + ", qty=" + qty + "]";
	}
}
