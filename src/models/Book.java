package models;

import com.main.collections.ArraySet;

public class Book extends ArraySet{

	public int bookid;
	public String bookname;
	public int price;
	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int goru) {
		this.bookid = goru;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "bookname = "+getBookname()+" bookprice = "+getPrice()+" bookid = "+getBookid();
	}
}
