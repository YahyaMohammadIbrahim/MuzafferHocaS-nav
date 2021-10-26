package MuzafferSýnav1;

import Books.Book3;
import Books.Book4;
import Books.BookProduct;
import Books.Book5;
import Books.Book6;


public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		BookProduct book2=new BookProduct();
		
		
		
		book2.setCaption("Anton Çehov Kitap");
		book2.setAuthorName("Anton Çehov");
		book2.setPrice(7);
		book2.setBookName("Altýncý Koðuþ");
		book2.setStockCode("HBV000007NWF8");
		book2.setInternationalSales(false);
		book2.setReleaseDate(2020);
		book2.setNumberOfPages(68);
		System.out.println("-----------");
		System.out.println("Book 1");
		System.out.println("-----------");
		System.out.println("Book Caption?");
		System.out.println(book2.getCaption());
		System.out.println("Book Price?");
		System.out.println(book2.getPrice());
		System.out.println("Who wrote the Book?");
		System.out.println(book2.getAuthorName());
		System.out.println("When was the Book released?");
		System.out.println(book2.getReleaseDate());
		
		Book3 book3=new Book3();
		book3.setBookName("BÝR ÝDAM MAHKÜMUMUM SON GÜNÜ");
		book3.setWriter("Victor Hugo");
		book3.setReleaseDate(2020);
		book3.setPages(130);
		book3.setInternationalSales(false);
		book3.setStockCode("KISBANK09902");
		book3.setCaption("Victor Hugo last days");
		book3.setPrice(17);
		System.out.println("-----------");
		System.out.println("  BOOK 2   ");
		System.out.println("-----------");
		System.out.println("What is the book Called?");
		System.out.println(book3.getBookName());
		System.out.println("Book Caption?");
		System.out.println(book3.getCaption());
		System.out.println("Book Price?");
		System.out.println(book3.getPrice());
		System.out.println("Who wrote the Book?");
		System.out.println(book3.getWriter());
		System.out.println("When was the Book released?");
		System.out.println(book3.getReleaseDate());
		
		
		Book4 book4=new Book4();
		book4.setBookName("Olaðanüstü Bir Gece");
		book4.setPrice(42);
		book4.setPages(80);
		book4.setStockCode("KISBANKASI26090");
		book4.setCaption("In the end, we'll all become stories.");
		book4.setWriter("Stefan Zweig");
		book4.setInternationalSales(false);
		book4.setReleaseDate(2020);
		System.out.println("-----------");
		System.out.println("BOOK 3 ");
		System.out.println("-----------");
		System.out.println("What is the book Called?");
		System.out.println(book4.getBookName());
		System.out.println("Book Caption?");
		System.out.println(book4.getCaption());
		System.out.println("Book Price?");
		System.out.println(book4.getPrice());
		System.out.println("Who wrote the Book?");
		System.out.println(book4.getWriter());
		System.out.println("When was the Book released?");
		System.out.println(book4.getReleaseDate());
		
		Book5 book5=new Book5();
		book5.setBookName("Modern Dünya Klasikleri");
		book5.setPrice(22);
		book5.setPages(814);
		book5.setStockCode("HBV000007SB0C");
		book5.setCaption("Franz Kafka.");
		book5.setWriter("Kolektif");
		book5.setInternationalSales(false);
		book5.setReleaseDate(2017);
		System.out.println("-----------");
		System.out.println("BOOK 4 ");
		System.out.println("-----------");
		System.out.println("What is the book Called?");
		System.out.println(book5.getBookName());
		System.out.println("Book Caption?");
		System.out.println(book5.getCaption());
		System.out.println("Book Price?");
		System.out.println(book5.getPrice());
		System.out.println("Who wrote the Book?");
		System.out.println(book5.getWriter());
		System.out.println("When was the Book released?");
		System.out.println(book5.getReleaseDate());
		
		Book6 book6=new Book6();
		book6.setBookName("Mecburiyet");
		book6.setPrice(10);
		book6.setPages(81);
		book6.setStockCode("HBV0000089ZEG");
		book6.setCaption("Franz Kafka.");
		book6.setWriter("Stefan Zweig");
		book6.setInternationalSales(false);
		book6.setReleaseDate(2017);
		System.out.println("-----------");
		System.out.println("BOOK 5 ");
		System.out.println("-----------");
		System.out.println("What is the book Called?");
		System.out.println(book6.getBookName());
		System.out.println("Book Caption?");
		System.out.println(book6.getCaption());
		System.out.println("Book Price?");
		System.out.println(book6.getPrice());
		System.out.println("Who wrote the Book?");
		System.out.println(book6.getWriter());
		System.out.println("When was the Book released?");
		System.out.println(book6.getReleaseDate());
		
		
		
		
		
		
		Customer customer1=new Customer();
		customer1.setName("Yahya");
        customer1.setAge(16);
        customer1.setGender("Male");
        customer1.setEmail("ytitsmaj@gmail.com");
        customer1.setPhoneNumber(509197495);
        customer1.setAdress("Bahçelivler Sümbül Sokak");
        customer1.setMoney(100);
        customer1.setHowMuchMoneyDoesCustomerHaveAfterBuying5Books(2);
        
        System.out.println("Name : ");
        
        
        System.out.println(customer1.getName());
      
        
        System.out.println("Age :  ");
        System.out.println(customer1.getAge());
        
        System.out.println("How much money did the Customer have before buying the books? :  ");
        System.out.println(customer1.getMoney());
        System.out.println("How much money does the Customer have now after buying the 5 Books? :  ");
        System.out.println(customer1.getHowMuchMoneyDoesCustomerHaveAfterBuying5Books());
        
        
        
        
        
        
        
        
        
        
        
        
        
       
     
		
      
       
       
	}

}
