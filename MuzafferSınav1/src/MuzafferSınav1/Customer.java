package MuzafferSýnav1;



public class Customer  extends Book {
	private String Name;
	private String Email;
	private int PhoneNumber;
	private int Age;
	public String Gender;
	public int Money;
	private String Adress;
	public int HowMuchMoneyDoesCustomerHaveAfterBuying5Books;
	private boolean IsCustomerBuyingaBook;
	public Customer() {
		super();
		
	}
	public Customer(String caption, double price, String name, String email, int phoneNumber, int age, String gender,
			int money, String adress, int howMuchMoneyDoesCustomerHaveAfterBuying5Books,
			boolean isCustomerBuyingaBook) {
		super(caption, price);
		Name = name;
		Email = email;
		PhoneNumber = phoneNumber;
		Age = age;
		Gender = gender;
		Money = money;
		Adress = adress;
		HowMuchMoneyDoesCustomerHaveAfterBuying5Books = howMuchMoneyDoesCustomerHaveAfterBuying5Books;
		IsCustomerBuyingaBook = isCustomerBuyingaBook;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getHowMuchMoneyDoesCustomerHaveAfterBuying5Books() {
		return HowMuchMoneyDoesCustomerHaveAfterBuying5Books;
	}
	public void setHowMuchMoneyDoesCustomerHaveAfterBuying5Books(int howMuchMoneyDoesCustomerHaveAfterBuying5Books) {
		HowMuchMoneyDoesCustomerHaveAfterBuying5Books = howMuchMoneyDoesCustomerHaveAfterBuying5Books;
	}
	public boolean isIsCustomerBuyingaBook() {
		return IsCustomerBuyingaBook;
	}
	public void setIsCustomerBuyingaBook(boolean isCustomerBuyingaBook) {
		IsCustomerBuyingaBook = isCustomerBuyingaBook;
	}
	
	
	
	
	
	
	
	}
			
		
		 

		
	


