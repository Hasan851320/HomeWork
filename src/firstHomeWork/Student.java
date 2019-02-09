package firstHomeWork;

public class Student {
 
	String studentName;
	int age;
	int classroll;
	boolean intelligent;  
	double height;
	
	public static void main (String [] args) {
	 Student a = new Student();
	  
	  a.studentName = "jake";
	  a.age = 20;
	  a.classroll = 2;
	  a.intelligent = true;
	  a.height = 5.7;
	 
	  System.out.println(" name: " +a.studentName+ " age: " +a.age+ " roll: " +a.classroll+ " good student: " +a.intelligent+ " height: " +a.height);
	  
	 Student b = new Student();
	  
	  b.studentName = "paul";
	  b.age = 29;
	  b.classroll = 3;
	  b.intelligent = false;
	  b.height = 5.8;
	   
	 Student c = new Student();
	 
	  c.studentName = "robert";
	  c.age = 23;
	  c.classroll = 4;
	  c.intelligent = true;
	  c.height = 5.9;
	
	  System.out.println(" name: " +c.studentName+ " age: " +c.age+ " roll: " +c.classroll+ " good student: " +c.intelligent+ " height: " +c.height);
			  
     Student d = new Student();
     
      d.studentName = "rob";
	  d.age = 24;
	  d.classroll = 5;
	  d.intelligent = true;
	  d.height = 6.0;
	 
	  System.out.println(" name: " +d.studentName+ " age: " +d.age+ " roll: " +d.classroll+ " good student: " +d.intelligent+ " height: " +d.height);
	  
	  Student e = new Student();
	     
      e.studentName = "smile";
	  e.age = 25;
	  e.classroll = 6;
	  e.intelligent = true;
	  e.height = 6.1;
	 
	  System.out.println(" name: " +e.studentName+ " age: " +e.age+ " roll: " +e.classroll+ " good student: " +e.intelligent+ " height: " +e.height);
	  

	}
}
