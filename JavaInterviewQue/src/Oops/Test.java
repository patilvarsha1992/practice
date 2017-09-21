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
			}
			
		}
		reader.close();
		if (n ==1){
			Student s1=new Student(1, firstName, lastName,rollNo,grade, c111);
			System.out.println(s1);
		
		}else{
			
			EnumSet<Course> c11=EnumSet.of(Course.CS102, Course.CS103);
			EnumSet<Course> c12=EnumSet.of(Course.CS101, Course.IS206);
			Instructor i1= new Instructor("Dr.Brayn", "Sue", 10, 7500,JobType.JOBTYPE.FULLTIME,c11);
			Instructor i2= new Instructor("Dr.Andrew", "Choi", 10, 4500, JobType.JOBTYPE.PARTTIME,c12);
		
			System.out.println(i1);
			System.out.println(i2);
	}
	}

}
