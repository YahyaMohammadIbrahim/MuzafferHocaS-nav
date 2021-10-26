package MuzafferSýnav1;

public class Book {
	private String caption;
	public double price;
	public double discoundRate;
	
	public int getPrice() {
		return (int) (price*(100-this.discoundRate)/100);
	}
	public double getDiscoundRate() {
		return discoundRate;
	}
	
	public String getCaption() {
		return caption;
	}
	
	public double getprice() {
		return price;
	
		

	}
	public Book(String caption, double price) {
		super();
		this.caption = caption;
		this.price = price;
		
	}

	public Book() {
		super();
	}

	
	
	
	}
	

	
	
	
	
	
	
	


