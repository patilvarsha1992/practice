package OverridingExam;

public class Bike extends Car{
	
		@Override
		public void run(){
			super.run();//call parent class method
			System.out.println("bike is running");
	}
	public static void main(String[] args) {
		Bike obj= new Bike();
		obj.run();
		

	}

}
