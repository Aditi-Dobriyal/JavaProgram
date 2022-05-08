package Assignment_01;
 import java.util.Scanner;
public class Qns5 {

	public static void main(String[] args) {
	    Employee arr[]= new Employee[8];
	    Scanner obj1 = new  Scanner(System.in);
	    Scanner obj2 = new Scanner(System.in) ;
	    
	    for(int i=0;i<8;i++) {
	    	System.out.println("Enter name =");
	    	String s2 = obj1.nextLine();
	    	System.out.println("Enter department =");
	    	String s3 = obj1.nextLine();
	    	System.out.println("Enter age =");
	    	int A = obj2.nextInt();
	    	System.out.println("Enter salary =");
	    	int A2 = obj2.nextInt();
	    	
	    	arr[i]= new Employee(s2,A,s3,A2);
	    }
	    int sum1=0,sum2=0,sum3=0,sum4=0;
	    for(int i=0;i<8;i++) {
	    	
	    	if(arr[i].salary>30000) {
	    		arr[i].salary=25000;
	    	}
	    	
	    	if(arr[i].dept.equals("A")) {
	    		sum1=sum1+arr[i].salary;
	    	}
	    	else if(arr[i].dept.equals("B")) {
	    		sum2=sum2+arr[i].salary;
	    	}
	    	else if(arr[i].dept.equals("C")) {
	    		sum3=sum3+arr[i].salary;
	    	}
	    	else {
	    		sum4=sum4+arr[i].salary;
	    	}
	    }
	    System.out.println("Total salary to be paid in department A "+sum1);
	    System.out.println("Total salary to be paid in department B "+sum2);
	    System.out.println("Total salary to be paid in department C "+sum3);
	    System.out.println("Total salary to be paid in department D "+sum4);
	    

	}

}
 class Employee {
	  String name;
	  int age;
	  String dept;
	  int salary;
	  
	  Employee(String s , int a , String d , int sa){
		  this.name=s;
		  this.age=a;
		  this.dept=d;
		  this.salary=sa;
	  }
 }