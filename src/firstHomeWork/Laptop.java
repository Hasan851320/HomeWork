package firstHomeWork;

public class Laptop {

  String laptopName;
  String laptopModel;
  int year;
  int apps;
  boolean goodQuality;
  
   public static void main (String [] args) {
  
	   Laptop a = new Laptop();
       Laptop b = new Laptop();
       Laptop c = new Laptop();
       Laptop df = new Laptop();
       Laptop ek = new Laptop();
       
       a.laptopName = "dell";
       a.laptopModel = "unknown";
       a.year = 2019;
       a.apps = 40;
       a.goodQuality = true;
       
       System.out.println(" name: " +a.laptopName+ " model: " +a.laptopModel+ " year: " +a.year+ " apps: " +a.apps+ " good quality: " + a.goodQuality);

       
       b.laptopName = "hp";
       b.laptopModel = "pavillion";
       b.year = 2018;
       b.apps = 49;
       b.goodQuality = false;
       
       System.out.println(" name: " +b.laptopName+ " model: " +b.laptopModel+ " year: " +b.year+ " apps: " +b.apps+ " good quality: " + b.goodQuality);

       c.laptopName = "apple";
       c.laptopModel = "mac book";
       c.year = 2019;
       c.apps = 80;
       c.goodQuality = true;
       
       System.out.println(" name: " +c.laptopName+ " model: " +c.laptopModel+ " year: " +c.year+ " apps: " +c.apps+ " good quality: " + c.goodQuality);

       df.laptopName = "hp";
       df.laptopModel = "value";
       df.year = 2017;
       df.apps = 97;
       df.goodQuality = false;
       
       
       System.out.println(" name: " +df.laptopName+ " model: " +df.laptopModel+ " year: " +df.year+ " apps: " +df.apps+ " good quality: " + df.goodQuality);

       ek.laptopName = "apple";
       ek.laptopModel = "mac book air";
       ek.year = 2019;
       ek.apps = 64;
       ek.goodQuality = true;
       
       
       System.out.println(" name: " +ek.laptopName+ " model: " +ek.laptopModel+ " year: " +ek.year+ " apps: " +ek.apps+ " good quality: " + ek.goodQuality);




   }


}
