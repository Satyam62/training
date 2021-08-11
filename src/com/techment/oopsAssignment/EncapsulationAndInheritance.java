package com.techment.oopsAssignment;
class Book{
	
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book{
	
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}


public class EncapsulationAndInheritance {

	public static void main(String[] args) {
		
//		Book book=new Book();
//		book.setBookNo(501);
//		book.setTitle("Satyam Private Limited");
//		book.setAuthor("Satyam Sahu");
//		book.setPrice(1014);
//		System.out.println("booNo() : "+book.getBookNo());
//		System.out.println("bookprice() : "+book.getPrice());
//		System.out.println("booktitle() : "+book.getTitle());
//		System.out.println("bookAuthor() : "+book.getAuthor());
		EngineeringBook engineeringBook=new EngineeringBook();
		engineeringBook.setCategory("Matheatics");
		System.out.println("engineeringBook category : "+engineeringBook.getCategory());
		
		engineeringBook.setBookNo(501);
		engineeringBook.setTitle("Satyam Private Limited");
		engineeringBook.setAuthor("Satyam Sahu");
		engineeringBook.setPrice(1014);
		System.out.println("engineeringBookbooNo() : "+engineeringBook.getBookNo());
		System.out.println("engineeringBookbookprice() : "+engineeringBook.getPrice());
		System.out.println("engineeringBookbooktitle() : "+engineeringBook.getTitle());
		System.out.println("engineeringBookbookAuthor() : "+engineeringBook.getAuthor());
		
	}

}
