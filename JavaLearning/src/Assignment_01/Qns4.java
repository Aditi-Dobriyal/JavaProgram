package Assignment_01;

public class Qns4 {
	public static void main(String[] args) {
		Three obj = new Three();
		Three obj1 = new Three(1,2);
		
		
		
	}

}
 class One {
	  One(int q){
		  System.out.println("Number in One is = "+q);
	  }
 }
 class Two extends One {
	 
	 Two(){
		 super(9);
		 System.out.println("You are under default constructor of Two");
	 }
 }
 
 class Three extends Two {
	 
	 Three(){
		 System.out.println("You are under default constructor of Three");
		 
	 }
	 Three(int a, int b){
		 System.out.println("Number in Three is ="+a);
		 System.out.println("Number in Three is =" +b);
		 
	 }
 }