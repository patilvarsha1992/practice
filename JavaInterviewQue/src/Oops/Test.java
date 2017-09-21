package Oops;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	// TODO
	// import cleanup
	// camelCase  
	// spacing
	// new lines after methods
	// enum values on new lines
	public static void main(String[] args) {
		Course cs101 = Course.CS101;
		//		System.out.println(cs101.name() + cs101.getCourse());
//		EnumSet<Course> c1=EnumSet.of(Course.CS101, Course.CS102);
//		EnumSet<Course> c2=EnumSet.of(Course.CS102, Course.IS206,Course.MIS303);
//		EnumSet<Course> c3=EnumSet.of(Course.CS101, Course.MIS301);
//				
		System.out.println("Select Person Type:");
		System.out.println("1. Student");
		System.out.println("2. Instructor");
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.print("Enter Person Type:");
		int n = reader.nextInt(); 
		System.out.print("Enter Student First Name:");
		String firstName = reader.next(); 
		System.out.print("Enter Student Last Name:");
		String lastName = reader.next(); 
		System.out.print("Enter Student Roll No:");
		int rollNo = reader.nextInt(); 
		System.out.print("Enter Student Grades:");
		String grade = reader.next(); 
		System.out.print("Select Courses");
		Set<Course> c111=new HashSet<>();
		for(Course c:Course.values()){
			System.out.println(c);
			System.out.print("Enter Y or N:");
			String yesNo = reader.next();
			if (yesNo.equalsIgnoreCase("y")){
				c111.add(c);
//				EnumSet<Course> c2=EnumSet.of(Course.CS102, Course.IS206,Course.MIS303);
//				EnumSet<Course> c3=EnumSet.of(Course.CS101, Course.MIS301);
						
			}
			
		}
		
		
//		String course = reader.next(); 
		
		if (n ==1){
//		System.out.println(n);
//		Set<Course> c1=new HashSet<Course>();
//		c1.add(Course.CS101);
//		c1.add(Course.CS102);
		
			
			
			
			Student s1=new Student(1, firstName, lastName,rollNo,grade, c111);
//			Student s2=new Student(2, "jd", "chaud",23,"B",c2);
//			Student s3=new Student(1, "varsha", "patil",22,"A",c1);
//			Student s4=new Student(3, "jaime", "snow",32,"B",c3);
			
//			System.out.println(s1.equals(s2));
			
			
			System.out.println(s1);
//			System.out.println(s2);
//			System.out.println(s3);
//			System.out.println(s4);
		
		}else{
			
			EnumSet<Course> c11=EnumSet.of(Course.CS102, Course.CS103);
			EnumSet<Course> c12=EnumSet.of(Course.CS101, Course.IS206);
			EnumSet<Course> c13=EnumSet.of(Course.CS101, Course.MIS301);
			Instructor i1= new Instructor("Dr.Brayn", "Sue", 10, 7500,JobType.JOBTYPE.FULLTIME,c11);
			Instructor i2= new Instructor("Dr.Andrew", "Choi", 10, 4500, JobType.JOBTYPE.PARTTIME,c12);
		
			System.out.println(i1);
			System.out.println(i2);
	}
	}

}
