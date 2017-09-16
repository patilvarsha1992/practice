
public class Comparision {

	public static void main(String[] args) {
		Num n1=new Num();
		Num n2=new Num();
//		n2.val = 2;
		System.out.println("n1-"+n1);
		System.out.println("n2-"+n2);
		System.out.println(n1.val == n2.val);
		System.out.println(n1 == n2);
//		System.out.println(n1.val.equals(n2.val));
		System.out.println(n2.equals(n1));
//		System.out.println(n1.word == n2.word);
//		System.out.println(n1.word.equals(n2.word));
//		System.out.println(n1.equals(n2));
		
	}

}
class Num{
	int val=100;
	String word="hello";
	
	
	@Override
	
	public boolean equals(Object o){
		if (o == null)
			return false;
		if (o instanceof Num) {
			Num otherNum = (Num) o;
			return this.val == otherNum.val;
		}
			
		return false;
	}
	 public String toString() {
	        return   String.valueOf(val);
	 }
}