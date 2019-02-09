package firstHomeWork;

public class Bike {

 String bikeName;
 String bikeModel;
 double bikeMilage;
 boolean brandNew;
 int year;
 
 
 public static void main( String [] args) {

  Bike a = new Bike();
  Bike b = new Bike();
  Bike c = new Bike();
  Bike d = new Bike();
  Bike e = new Bike();
  
  a.bikeName = "yamaha";
  a.bikeModel = "fzs";
  a.bikeMilage = 126.87;
  a.brandNew = false;
  a.year = 2018;
  
  System.out.println(" name: " +a.bikeName+ " model: " +a.bikeModel+ " milage: " +a.bikeMilage+ " brand new " +a.brandNew+ " year: " +a.year);

  b.bikeName = "honda";
  b.bikeModel = "cbr";
  b.bikeMilage = 676.99;
  b.brandNew = true;
  b.year = 2019;
  
  System.out.println(" name: " +b.bikeName+ " model: " +b.bikeModel+ " milage: " +b.bikeMilage+ " brand new " +b.brandNew+ " year: " +b.year);
  
  c.bikeName = "tvs";
  c.bikeModel = "metro";
  c.bikeMilage = 956.85;
  c.brandNew = true;
  c.year = 2017;
  
  System.out.println(" name: " +c.bikeName+ " model: " +c.bikeModel+ " milage: " +c.bikeMilage+ " brand new " +c.brandNew+ " year: " +c.year);
  
  d.bikeName = "walton";
  d.bikeModel = "cruse";
  d.bikeMilage = 898.75;
  d.brandNew = false;
  d.year = 2016;
  
  System.out.println(" name: " +d.bikeName+ " model: " +d.bikeModel+ " milage: " +d.bikeMilage+ " brand new " +d.brandNew+ " year: " +d.year);

  e.bikeName = "bajaj";
  e.bikeModel = "pulser";
  e.bikeMilage = 365.45;
  e.brandNew = false;
  e.year = 2019;
  
  System.out.println(" name: " +e.bikeName+ " model: " +e.bikeModel+ " milage: " +e.bikeMilage+ " brand new " +e.brandNew+ " year: " +e.year);










 }


}
