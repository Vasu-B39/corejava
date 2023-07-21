class MallRunner{

	public static void main(String[] args)
	{
		System.out.println("invoke main in Mall runner");
		
		Mall mall=new Mall();
		Mall mall1=new Mall("Max Mall");
		Mall mall2=new Mall("Max Mall", 8);
		Mall mall3=new Mall("Max Mall", 8, 5);
		Mall mall4=new Mall("Max Mall", 8, 5, 20);
		Mall mall5=new Mall("Max Mall", 8, 5, 20, 204500);
		Mall mall6=new Mall("Max Mall", 8, 5, 20, 2045600, 180);
		Mall mall7=new Mall("Max Mall", 8, 5, 20, 2045600, 180, "Ekk groups");
		
		
	}
}