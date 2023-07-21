class ParkRunner{
	
	public static void main(String[] args)
	{
		System.out.println("invoke main in park runner");
		
		Park park=new Park();
		Park park1=new Park("Freedom park");
		Park park2=new Park("Freedom park", 50);
		Park park3=new Park("Freedom park", 50, 45.56);
		Park park4=new Park("Freedom park", 50, 45.56, 20);
		Park park4=new Park("Freedom park", 50, 45.56, 20, 100);
		Park park4=new Park("Freedom park", 50, 45.56, 20, 100, 8);
		Park park4=new Park("Freedom park", 50, 45.56, 20, 100, 8, "gobi");
		Park park4=new Park("Freedom park", 50, 45.56, 20, 100, 8, "gobi", 4);
		Park park4=new Park("Freedom park", 50, 45.56, 20, 100, 8, "gobi", 4, false);
		
		
	}
}
