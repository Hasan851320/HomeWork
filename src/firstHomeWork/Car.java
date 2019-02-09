package firstHomeWork;

public class Car {
	
	String carName;
	String carModel;
	int year;
	double carMilage;
	boolean goodCondition;
	
	public static void main(String [] args) {
	
	
	Car a = new Car();
	Car b = new Car();
	Car c = new Car();
	Car d = new Car();
	Car e = new Car();
	
	a.carName = "toyota";
	a.carModel = "corola";
	a.year = 2018;
	a.carMilage = 18876.87;
	a.goodCondition = true;
	
	System.out.println(" car name: " +a.carName+ " car model: " +a.carModel+ " year: " +a.year+ " car milage: " +a.carMilage+ " good condition: " +a.goodCondition);
	
	b.carName = "ford";
	b.carModel = "expedition";
	b.year = 2019;
	b.carMilage = 19876.97;
	b.goodCondition = false;
	
	System.out.println(" car name: " +b.carName+ " car model: " +b.carModel+ " year: " +b.year+ " car milage: " +b.carMilage+ " good condition: " +b.goodCondition);


	c.carName = "linclon";
	c.carModel = "nevigator";
	c.year = 2017;
	c.carMilage = 12876.39;
	c.goodCondition = true;
	
	System.out.println(" car name: " +c.carName+ " car model: " +c.carModel+ " year: " +c.year+ " car milage: " +c.carMilage+ " good condition: " +c.goodCondition);
	
	d.carName = "infinity";
	d.carModel = "q60";
	d.year = 2016;
	d.carMilage = 11876.50;
	d.goodCondition = false;
	
	System.out.println(" car name: " +d.carName+ " car model: " +d.carModel+ " year: " +d.year+ " car milage: " +d.carMilage+ " good condition: " +d.goodCondition);
	
	e.carName = "ferari";
	e.carModel = "purshea";
	e.year = 2019;
	e.carMilage = 256.87;
	e.goodCondition = true;
	
	System.out.println(" car name: " +e.carName+ " car model: " +e.carModel+ " year: " +e.year+ " car milage: " +e.carMilage+ " good condition: " +e.goodCondition);
	
	
	
	
	}

}
