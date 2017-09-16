package Oops;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CourseSet {

	public static void main(String[] args) {
		
		Set<Course> c1=new HashSet<Course>();
		c1.add(Course.CS101);
		c1.add(Course.CS102);
	
		
	
		courseEnroll();
       
	}



public static void courseEnroll(){

	EnumSet<Course> course1=EnumSet.of(Course.CS101, Course.CS102);
	
	Iterator<Course> setIterator = course1.iterator();
	while(setIterator.hasNext()){
	    System.out.println(setIterator.next());
}
}
}
