package Assignment_01;

public class Qns7 {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
	    A1 a2 = new A1();
	    A1 a3 = new A1();
	    a1.display();
	    a2.display();
	    a3.display();
	    System.out.println("total number of call for the member function : " +A1.b);
	    System.out.println("total number of object created = "+A1.c);
	}

}

class A1 {
	static int b ;
	static int c=0;
	
	 A1(){
		c++;
	}
	
	 void display ()
	{
		b++;	
		
	}
}