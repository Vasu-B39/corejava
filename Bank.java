class Bank
{
	
	
	static int currentBalence = 2000;  
	public static void greetCustomer()
	{
		
	   System.out.println("hello, welcome to the banking application");
	}
	
	public void deposit(int amount)
	{
		
		currentBalence = currentBalence + amount;
		System.out.println("amount is deposit sucessfully");
	}
	
	public static void withdrawel(int amount)
	{
		currentBalence = currentBalence - amount;
		System.out.println("amount is withdrawel sucessfully");
	}
	
	public int getCurrentBalence()
	{
		return currentBalence;
	}
	
	public static void main(String[] args) 
	{
		greetCustomer();
		
	    Bank bank = new Bank();
		System.out.println("bank currentBalence :" +bank.getCurrentBalence());
		bank.deposit(400);
	
		System.out.println("bank currentBalence :" +bank.getCurrentBalence());
		
		
		bank.withdrawel(900);
		System.out.println("bank currentBalence :"+bank.getCurrentBalence());
	}
}