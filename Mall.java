class Mall{
  
     String name;
	 int brand;
	 int rate;
	 int employs;
	 long income;
	 double visitors;
	 String owner;
	 
	 Mall()
	 {
		System.out.println("invoking no arguments constructor in Mall");
		
	 }
	 
	 Mall(String name)
	 {
		System.out.println("invoking String  constructor in Mall");
		this.name=name;
		
	 }
	 
	 Mall(String name, int brand)
	 {
		this(name);
		System.out.println("invoking String, int  constructor in Mall");
		this.brand=brand;
		
	 }
	 
	  Mall(String name, int brand, int rate)
	 {
		this(name, brand);
		System.out.println("invoking String, int's  constructor in Mall");
		this.rate=rate;
		
	 }
	 
	  Mall(String name, int brand, int rate, int employs)
	 {
		this(name, brand, rate);
		System.out.println("invoking String, int's  constructor in Mall");
		this.employs=employs;
		
	 }
	 
	  Mall(String name, int brand, int rate, int employs, long income)
	 {
		this(name, brand, rate, employs);
		System.out.println("invoking String, int's, long  constructor in Mall");
		this.income=income;
		
	 }
	 
	  Mall(String name, int brand, int rate, int employs, long income, double visitors)
	 {
		this(name, brand, rate, employs, income);
		System.out.println("invoking String, int's, long and double  constructor in Mall");
		this.visitors=visitors;
		
	 }
	 
	 Mall(String name, int brand, int rate, int employs, long income, double visitors, String owner)
	 {
		this(name, brand, rate, employs, income, visitors);
		System.out.println("invoking String, int's, long and double  constructor in Mall");
		this.owner=owner;
		
	 }
  
}