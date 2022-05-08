package Assignment_01;
import java.util.Scanner;
public class Qns10 {

	public static void main(String[] args) {
		City arr[] = new City[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Enter no. of cars in " +(i+1)+ " city ");
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			int a3 = sc.nextInt();
			int a4 = sc.nextInt();
			 arr[i]=new City(a1,a2,a3,a4);
		}
		int sum1=0,sum2=0,sum3=0,sum4=0;
		for(int i=0;i<4;i++) {
			sum1=sum1+arr[i].Maruti_k10;
			sum2=sum2+arr[i].Zen_Astelo;
			sum3=sum3+arr[i].Wagnor;
			sum4=sum4+arr[i].Maruti_SX4;
		}
		
		System.out.println("Total numbers of cars sold in all 4 cities =");
		System.out.println("Maruti-k10  ="+sum1);
		System.out.println("Zen-Astelo ="+sum2);
		System.out.println("Wagnor = "+sum3);
		System.out.println("Maruti-SX4 ="+sum4);
		
		sc.close();
	}

}
 class City {
	 
	 int Maruti_k10;
	 int Zen_Astelo;
	 int Wagnor;
	 int Maruti_SX4;
	 
	 City(int a, int b, int c, int d){
		 this.Maruti_k10=a;
		 this.Zen_Astelo=b;
		 this.Wagnor=c;
		 this.Maruti_SX4=d;
	 }
	 
	 
 }