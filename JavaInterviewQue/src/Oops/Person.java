package Oops;
import java.security.PublicKey;
import java.util.Set;

/**
 * 
 * @author vpatil
 *
 */

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	Set<Course> courses;
	static int count=1;
	
	public Person(String fName,String lName,Set<Course> courses){
		this.id=count++;
		this.firstName=fName;
		this.lastName=lName;
		this.courses=courses;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	public String getFname(){
		return firstName;
	}
	
	public void setFname(String fName) {
		this.firstName=fName;
		
	}
	public String getLname(){
		return lastName;
	}
	
	public void setLname(String lName) {
		this.lastName=lName;
	}
	
	public String toString(){
		return "id-"+id + " " + "FirstName-"+firstName+" "+"Lastname-"+lastName;
		
	}
}
