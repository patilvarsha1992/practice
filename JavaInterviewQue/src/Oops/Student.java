package Oops;

import java.util.Set;

public class Student extends Person {
	
//	private static final String val = null;
	private int rollNo;
	private String grade;
	
	
	public Student(int id,String fName,String lName,Set<Course> courses){
		super(fName,lName,courses);
	}
	public Student(int id,String fName,String lName,int rollNo,String grade,Set<Course> courses){
		super(fName,lName,courses);
		this.rollNo=rollNo;
		this.grade=grade;
//		this.course=course;
		
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
		
	}
	public String getGrade(){
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade=grade;
		
	}
	
	public String toString(){
		return super.toString()+" " + " "+"RollNo-"+rollNo + " " + "Grade-"+grade+ " "+"Courses-"+ courses;
		
	}
	
	public void  courseEnroll(){
		
		
	}
	
@Override
	
	public boolean equals(Object o){ //o =s2
		if (o == null)  //check is s2 object is null
			return false;
		if (o instanceof Student) {  //check datatype od s1 and s2 object
			Student otherStud = (Student) o;//map stud to other stud
			return this.getFname().equals(otherStud.getFname());
		}
			
		return false;
	}
//	 public String toString() {
//	        return   String.valueOf(val);
//	 }
	
}