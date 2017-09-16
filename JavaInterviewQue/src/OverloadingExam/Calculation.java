package OverloadingExam;

public class Calculation {
//	1.same method name
//	2.diff arrguments
//	3.diff data type
//	4.cannot change return type only 
//	5.polymorphism
	
	public int sum(int x,int y){
		int ans;
		ans=x+y;
		return ans;
		
	}
	
//@Overloading
	public double sum(double d,double e,double f){
		double ans;
		ans=d+e+f;
		return ans;
	}
	
	public double sum(double d,double e){
		double ans;
		ans=d+e;
		return ans;
	}
//	public double sum(int d,int e){   you cannot change return type only give  Compile Time Error: method sum(int,int) is already defined in class calculation
//		double ans;
//		ans=d+e+f;
//		return ans;
//	}

}
