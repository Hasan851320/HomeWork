package firstHomeWork;

public class Mobile {

	 
		String type;
		int apps;
		int simSlot;
		boolean goodquality;  
		double price;
		
		public static void main (String [] args) {
		
			Mobile a = new Mobile();
		  
		  a.type = "androide";
		  a.apps = 20;
		  a.simSlot = 2;
		  a.goodquality = true;
		  a.price = 10.00;
		 
		  System.out.println(" mobile type: " +a.type+ " apps: " +a.apps+ " sim slot: " +a.simSlot+ " good quality: " +a.goodquality+   " price : " +a.price);
		  
		  Mobile b = new Mobile();
		  
		  b.type = "ios";
		  b.apps = 21;
		  b.simSlot = 3;
		  b.goodquality = true;
		  b.price = 11.00;
		 
		  System.out.println(" mobile type: " +b.type+ " apps: " +b.apps+ " sim slot: " +b.simSlot+ " good quality: " +b.goodquality+   " price : " +b.price);
		  
          Mobile c = new Mobile();
		  
		  c.type = "windows";
		  c.apps = 22;
		  c.simSlot = 4;
		  c.goodquality = true;
		  c.price = 12.00;
		 
		  System.out.println(" mobile type: " +c.type+ " apps: " +c.apps+ " sim slot: " +c.simSlot+ " good quality: " +c.goodquality+   " price : " +c.price);
		  
          Mobile d = new Mobile();
		  
		  d.type = "ios";
		  d.apps = 23;
		  d.simSlot = 5;
		  d.goodquality = false;
		  d.price = 13.00;
		 
		  System.out.println(" mobile type: " +d.type+ " apps: " +d.apps+ " sim slot: " +d.simSlot+ " good quality: " +d.goodquality+   " price : " +d.price);
		  
		  
          Mobile e = new Mobile();
		  
		  e.type = "androide";
		  e.apps = 24;
		  e.simSlot = 6;
		  e.goodquality = true;
		  e.price = 14.00;
		 
		  System.out.println(" mobile type: " +e.type+ " apps: " +e.apps+ " sim slot: " +e.simSlot+ " good quality: " +e.goodquality+   " price : " +e.price);
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
}
