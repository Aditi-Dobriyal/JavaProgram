package UNIT03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args) throws Exception {
		ABC obj=new ABC();
		obj.basicException();
		obj.handleException();
        obj.multipleCatch();
        obj.inputMismatchException();
        obj.stackOverFlowError(1);
        obj.indexOutOfBoundException();
        obj.nullPointerException();
        obj.useOfThrow(17);
        obj.useOfThrowAndFinally();
	}

}

class ABC{
	
	private String s;

	//Compiler can not catch this exception at compile time
	void basicException(){
		int b=0;
		int a=100/b;
		System.out.println(a);
	}
	
	void handleException(){
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		//rest of the code
		System.out.println("Done!");
	}
	
	void multipleCatch() {
		//Child Class is written first then the parent class is written
		try {
			int b=0;
			int a=100/b;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage()+ "Arithmetic Exception");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void inputMismatchException() {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number: ");	
		   int num=sc.nextInt();
			System.out.println("You have entered: " +num);
			sc.close();
			}
		catch(InputMismatchException e) {
			System.out.println(e+"Resolved");
		}
	}
	
   void stackOverFlowError(int i) {
		try {
			while(i>0) {
				i++;
				stackOverFlowError(i);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Done!");
	}
   
   void indexOutOfBoundException() {
		
	   int[] arr= {1,2,3};
	   System.out.println(arr[10]);
	}
   
	void nullPointerException() {
		try {
			s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void useOfThrow(int age) throws Exception{
		if(age<18) {
			throw new Exception();
		}else {
			System.out.println("You are allowed to enter!!");
		}
	}
	
	void useOfThrowAndFinally() {
	 try {
		 useOfThrow(16);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
     finally {
    	 System.out.println("Hello!!");
     }
	}
	
	void checkedAndUncheckedException() {
		try {
			useOfThrow(12);
		}
		catch(Exception e) {
			System.out.println("checked Exception");
		}
		try {
			int b=0;
			int a=5/b;
			System.out.println("5/0=" +a);
			//unchecked Exception
		}
		catch(ArithmeticException e) {
			System.out.println("Done!!");
		}
	}
}