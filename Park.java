class Park{
  
   String name;
   double price;
   float area;
   int employs;
   double visitors;
   int timing;
   String food;
   int gate;
   boolean pool;
   
   Park()
   {
		System.out.println("invoking no arguments constructor in park");
   }
   
    Park(String name)
   {
		System.out.println("invoking string constructor in park");
		this.name=name;
   }
   
   Park(String name, double price)
   {
		this(name);
		System.out.println("invoking string, double constructor in park");
		this.price=price;
   }
   
   Park(String name, double price, float area)
   {
		this(name, price);
		System.out.println("invoking string, double, float constructor in park");
		this.area=area;
   }
   
   Park(String name, double price, float area, int employs)
   {
		this(name, price, area);
		System.out.println("invoking string, double, float, int constructor in park");
		this.employs=employs;
   }
   
   Park(String name, double price, float area, int employs, double visitors)
   {
		this(name, price, area, employs);
		System.out.println("invoking string, double, float, int constructor in park");
		this.visitors=visitors;
   }
   
   Park(String name, double price, float area, int employs, double visitors, int timing)
   {
		this(name, price, area, employs, visitors);
		System.out.println("invoking string, double, float, int constructor in park");
		this.timing=timing;
   }
   
   Park(String name, double price, float area, int employs, double visitors, int timing, String food)
   {
		this(name, price, area, employs, visitors, timing);
		System.out.println("invoking string, double, float, int constructor in park");
		this.food=food;
   }
   
    Park(String name, double price, float area, int employs, double visitors, int timing, String food, int gate)
   {
		this(name, price, area, employs, visitors, timing, food);
		System.out.println("invoking string, double, float, int constructor in park");
		this.gate=gate;
   }
   
   Park(String name, double price, float area, int employs, double visitors, int timing, String food, int gate, boolean pool)
   {
		this(name, price, area, employs, visitors, timing, food, gate);
		System.out.println("invoking string, double, float, int constructor in park");
		this.pool=pool;
   }
}