package Assignment_01;
import java.util.Scanner;


interface In1 {
	 void display(int p);
}


public class Qns3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number that you want to check =");
		int p=sc.nextInt();
		
		testClass obj = new testClass();
		obj.display(p);
        sc.close();
	}

}
 class testClass implements In1{
	 public void display(int q) {
		 
		 int c=0,i;
		 for(i=2;i<=q;i++) {
			 if(q%i==0) {
				 c++;
				 break;
			 }
		 }
		 if(c>0) {
			 System.out.println("Number is   prime");
		 }
		 else {
			 System.out.println("Number is not prime");
		 }
		 
	 }
	 
	 
 }