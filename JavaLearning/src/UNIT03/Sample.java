//Finally always run

package UNIT03;

import java.util.InputMismatchException;

public class Sample {

	public Sample() {
		try {
			int a=100/0;
		}
//if there is no exception finally will always run and if there is exception it will still run
		
		catch(InputMismatchException e) {
//			System.out.println(a);

			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println("Done");
		}
		 finally {
	    	 System.out.println("Hello!!");
	     }
	}

	//if there is exception try block and no appropriate catch block still finally would run

}
