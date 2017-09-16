package OverloadingExam;

public class Test {

	public static void main(String[] args) {
		Calculation cal =new Calculation();
		
		
		System.out.println("sum-"+ cal.sum(2, 5));
		System.out.println("sum-"+ cal.sum(10.5,2.5,1.5));
	}

}
