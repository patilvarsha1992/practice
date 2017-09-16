package StaticNonStaticExam;

public class Student {

	int rollNo;
	String name;
	static String collegeName ="IIT"; 
	
	public void studInfo(int r,String name){
		collegeName = "PSU";
		System.out.println("roll no-"+r + " "+"name-"+ name+ " "+"collegeName-"+ " " +collegeName);
//		techStudInfo(r, name);//you can call static method from non static method 
	}
	
	public static void techStudInfo(int r,String name){
//		studInfo(2,"jd"); you cannot call non static method from static for tghat you have to create object of class
//		Student s1= new Student();
//		s1.studInfo(2, "jd");
//		System.out.println("teacher id-"+r + " "+"name-"+ name+ " "+"collegeName-"+ " " +collegeName);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studInfo(1, "varsha"); //create obj of non static method
//		techStudInfo(11, "snow");//dont need to create obj of static method
		Student s2 = new Student();
		s2.studInfo(2, "jd"); //create obj of non static method
	

	}

}
