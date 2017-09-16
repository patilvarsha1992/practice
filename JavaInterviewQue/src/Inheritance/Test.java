package Inheritance;

public class Test {

	public static void main(String[] args) {
		SuperClassPhone sup = new SuperClassPhone();
		SubClassMobile sub =new SubClassMobile();
		sup.call();
//		sup.text();  this will give compile error 
		sub.call();
		sub.text();
		sub.videoCall();
	}

}
