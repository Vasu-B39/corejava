class BadmintonRunner{
	public static void main(String[] info)
	{
		System.out.println("Running the Badminton ");
		Badminton badminton=new Badminton();
		
		badminton.type="Hard";
		badminton.cost  =6678;
		badminton.player="yashwanth";
	    badminton.court  ="big coat";
        badminton.place ="Mysuru";
		
		System.out.println(badminton.type);
		System.out.println(badminton.cost);
		System.out.println(badminton.player );
		System.out.println(badminton.court   );
		System.out.println(badminton.place  );
		
		
		
		System.out.println("====================================");
		
		
		Badminton badminton1=new Badminton();
		
		badminton1.type="Hard";
		badminton1.cost  =6678;
		badminton1.player="yashwanth";
	    badminton1.court  ="big coat";
        badminton1.place ="Mysuru";
		
		
		
		
		System.out.println(badminton1.type   );
		System.out.println(badminton1.cost   );
		System.out.println(badminton1.player );
		System.out.println(badminton1.court   );
		System.out.println(badminton1.place  );
	}
}