package Oops;

import java.util.EnumSet;

public class Test {

	// TODO
	// import cleanup
	// camelCase  
	// spacing
	// new lines after methods
	// enum values on new lines
	public static void main(String[] args) {
//		Set<Course> c1=new HashSet<Course>();
//		c1.add(Course.CS101);
//		c1.add(Course.CS102);
		
		Course cs101 = Course.CS101;
		System.out.println(cs101.name() + cs101.getCourse());
		EnumSet<Course> c1=EnumSet.of(Course.CS101, Course.CS102);
		EnumSet<Course> c2=EnumSet.of(Course.CS102, Course.IS206);
		EnumSet<Course> c3=EnumSet.of(Course.CS101, Course.MIS301);
		
		Student s1=new Student(1, "varsha", "patil",22,"A", c1);
		Student s2=new Student(2, "jd", "chaud",23,"B",c2);
		Student s3=new Student(1, "varsha", "patil",22,"A",c1);
		
		System.out.println(s1.equals(s2));
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		EnumSet<Course> c11=EnumSet.of(Course.CS102, Course.CS103);
		EnumSet<Course> c12=EnumSet.of(Course.CS101, Course.IS206);
		EnumSet<Course> c13=EnumSet.of(Course.CS101, Course.MIS301);
		Instructor i1= new Instructor("Dr.Brayn", "Sue", 10, 7500,JobType.JOBTYPE.FULLTIME,c11);
		Instructor i2= new Instructor("Dr.Andrew", "Choi", 10, 4500, JobType.JOBTYPE.PARTTIME,c12);
	
		System.out.println(i1);
		System.out.println(i2);
	}

}
