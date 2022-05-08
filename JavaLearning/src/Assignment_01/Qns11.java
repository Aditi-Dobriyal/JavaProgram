package Assignment_01;

public class Qns11 {
	public static void main(String[] args) {
		operation1 op = new operation1();
		int a=10;
		int b=9;
		 int r1=op.add(a,b);
		 int r2=op.sub(a, b);
		  if(r2<0) {
			  r2=0;
		  }
		 int r=(a>b)?r1:r2;
		 
		 System.out.println("Result is = "+r);
		 

		

		}

	}

	 class operation1 {
		 
		 int add (int a, int b) {
			 int sum=0;
			 sum = a+b;
		return sum;
		
		 }
		 
		 int sub(int a, int b) {
			 
			 int s;
			s=a-b;
			return s;
		 }
	 }