package Assignment_01;
import java.util.Scanner;

public class Qns1 {

	public static void main(String[] args) {
	
			    
				Scanner sc=new Scanner(System.in);
				Scanner obj=new Scanner(System.in);
				student arr[]=new student[6];
				for(int i=0;i<6;i++)
				{
				    System.out.println("Enter the name of "+(i+1)+" student");
				    String s=obj.nextLine();
				    System.out.println("Enter the Age of "+(i+1)+" student");
				    int a=sc.nextInt();
				    System.out.println("Enter the Section of "+(i+1)+" student");
				    char c=sc.next().charAt(0);
				    System.out.println("Enter the Percentage of "+(i+1)+" student");
				    float f=sc.nextFloat();
				    arr[i]=new student(s,a,c,f);
				}
				float avg=0;
				for(int i=0;i<6;i++)
				avg=avg+arr[i].per;
				System.out.println(avg/6);
				sc.close();
				obj.close();
	}
}
		class student
		{
		    String name;
		    int age;
		    char sec;
		    float per;
		    student(String s,int a,char c,float d)
		    {
		        name=s;
		        age=a;
		        sec=c;
		        per=d;
		    }
		}