package Oops;

import java.util.Set;

public class Instructor extends Person{
	private int experience;
	private float salary;
//	private JOBTYPE jobType;
	JobType.JOBTYPE jobType;
	
	
	public Instructor(String fName,String lName,Set<Course> courses){
		super(fName,lName,courses);
	}
	public Instructor(String fName,String lName,int experience,float salary,JobType.JOBTYPE jobType,Set<Course> courses){
		super(fName,lName,courses);
		this.experience=experience;
		this.salary=salary;
		this.jobType=jobType;
//		this.course=course;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public void setExperience(int experience){
		this.experience=experience;
	}
	
	public float getSalary(){
		return salary;
	}
	
	public void setSalary(float salary){
		this.salary=salary;
	}
	
//	public JOBTYPE getJobType(){
//		return jobType;
//	}
//	
//	public void setJobType(JOBTYPE jobType){
//		this.jobType=jobType;
//	}
	
	public String toString(){
		return super.toString()+"Experience-" + experience +  " " + "Salary-" +salary+ " " + "JobType-"+ jobType + " "+ "Course-"+ courses;
	}
}
