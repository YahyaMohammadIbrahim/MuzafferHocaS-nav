package Books;

import MuzafferSýnav1.Book;

public class BookProduct extends Book {
	public String Caption;
	public int Price;
	public String AuthorName;
	public int NumberOfPages;
	public String Writer;
	public boolean InternationalSales;
	private String StockCode;
	public int ReleaseDate;
    public String BookName;
	public BookProduct() {
		super();

}
	public BookProduct(String caption, double price, String caption2, int price2, String authorName, int numberOfPages,
			String writer, boolean internationalSales, String stockCode, int releaseDate, String bookName) {
		super(caption, price);
		Caption = caption2;
		Price = price2;
		AuthorName = authorName;
		NumberOfPages = numberOfPages;
		Writer = writer;
		InternationalSales = internationalSales;
		StockCode = stockCode;
		ReleaseDate = releaseDate;
		BookName = bookName;
	}
	public String getCaption() {
		return Caption;
	}
	public void setCaption(String caption) {
		Caption = caption;
	}
	public 
 int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getNumberOfPages() {
		return NumberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		NumberOfPages = numberOfPages;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
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
	public int getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		ReleaseDate = releaseDate;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	
	
	
	
	
}