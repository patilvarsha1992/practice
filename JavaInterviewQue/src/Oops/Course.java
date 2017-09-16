package Oops;

public enum Course {
	
	CS101 ("Theary of Computer Science"),
	CS102 ("Data Structure"),
	CS103 ("Computer Network"),
	IS204 ("Internet Programming"),
	IS205 ("Information System"),
	IS206 ("Artificial Intelligence"),
	MIS303 ("Management Infomation System"),
	MIS302 ("Business Communication"),
	MIS301 ("Information Security");
	
	private String courseName;
	
	Course(String courseName) {
        this.courseName = courseName;
	 }
       
	 public String getCourse() {
	        return courseName;
	    }
	 
	 public String toString() {
	        return this.name() + " - " + this.getCourse();
	    }
}
