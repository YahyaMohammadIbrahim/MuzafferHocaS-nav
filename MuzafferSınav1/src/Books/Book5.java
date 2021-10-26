package Books;

import MuzafferSýnav1.Book;

public class Book5 extends Book{
	
	public String Caption;
	public int Price;
	public String Writer;
	public int Pages;
	public int ReleaseDate;
	public boolean InternationalSales;
	public String StockCode;
	public String BookName;
	public Book5() {
		super();
	}
	public Book5(String caption, double price, String caption2, int price2, String writer, int pages, int releaseDate,
			boolean internationalSales, String stockCode, String bookName) {
		super(caption, price);
		Caption = caption2;
		Price = price2;
		Writer = writer;
		Pages = pages;
		ReleaseDate = releaseDate;
		InternationalSales = internationalSales;
		StockCode = stockCode;
		BookName = bookName;
	}
	public String getCaption() {
		return Caption;
	}
	public void setCaption(String caption) {
		Caption = caption;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public int getPages() {
		return Pages;
	}
	public void setPages(int pages) {
		Pages = pages;
	}
	public int getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		ReleaseDate = releaseDate;
	}
	public boolean isInternationalSales() {
		return InternationalSales;
	}
	public void setInternationalSales(boolean internationalSales) {
		InternationalSales = internationalSales;
	}
	public String getStockCode() {
		return StockCode;
	}
	public void setStockCode(String stockCode) {
		StockCode = stockCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	

}
