package Assignment_01;

public class Qns9 {
	

	public static void main(String[] args) {
		
		
		access a1 = new access();
		a1.display();
		System.out.println("value of variables which are accessible in main is =");
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
	 

	}

}
  class access extends Qns9{
	 
	 int a=10;
	 public int b=20;
	 private int d=40;
	 protected int c =30;
	  
	 void display() {
		 System.out.println("Value of a in class ="+a);
		 System.out.println("Value of b in class ="+b);
		 System.out.println("Value of c in class ="+c);
		 System.out.println("Value of d in class ="+d);
	 }
 }
  