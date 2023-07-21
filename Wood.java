class Wood{
	String type;
	long price;
	int length;
	int breadth;
	int height;
	
	Wood()
	{
		System.out.println("Invoking no-arg constructor in Wood");
	}
	
	Wood(String type)
	{
		System.out.println("Invoking String constructor in Wood");
		this.type=type;
	}
	
	
	Wood(String type,long price)
	{
		this(type);
		System.out.println("Invoking String,double constructor in Wood");
		this.price=price;
	}
	
	Wood(String type,long price,int length)
	{
		this(type,price);
		System.out.println("Invoking String,double,int constructor in Wood");
		this.length=length;
	}
	
	Wood(String type,long price,int length,int breadth)
	{
		this(type,price,length);
		System.out.println("Invoking String,double,int,int constructor in Wood");
		this.breadth=breadth;
	}
	
	Wood(String type,long price,int length,int breadth,int height)
	{
		this(type,price,length,breadth);
		System.out.println("Invoking String,double,int,int,int constructor in Wood");
		this.height=height;
	}
}