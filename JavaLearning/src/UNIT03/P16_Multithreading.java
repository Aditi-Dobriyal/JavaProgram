// MultihTreading pre-requisite
//1.Multiprocessing:
//        Sequential Multiprocessing
//        parallel Multiprocessing
//        concurrent Multiprocessing----uses JVM--task should be independent

//2.Multitasking
  //      Sequential Multitasking
//        parallel Multitasking
//        concurrent Multitasking


//MultiThreading is a process of doing more than one task at a same time.
//Thread-->Unit of a process
package UNIT03;
import java.util.Scanner;

public class P16_Multithreading {
	public static void main(String[] args)
	{
		
//		MultiThreadingInJava obj = new MultiThreadingInJava();
//		obj.threadConcept();
//		obj.threadSynchronization();
//		obj.interThreadCommunication();
//		obj.ProducerConsumerProblems();
//		obj.Wait_And_Notify();
//		
		
//		C1 obj1=new C1();
//		C2 obj2=new C2();
//		obj1.show1();
//		obj2.show2();
		Thread t1=new Thread(new T1(), "T1");
		Thread t2=new Thread(new T2(), "T2");
		Thread t3=new Thread(new T3(), "T3");

		t1.start();
		t2.start();
		t3.start();

	}
}

class MultiThreadingInJava
{
void threadConcept()
{
	
}

void threadSynchronization()
{
	
}

void interThreadCommunication()
{
	
}

void ProducerConsumerProblems()
{
	
}

void Wait_And_Notify()
{
	
}
}

class C1{
	void show1() {
		System.out.println("show1");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(r);
	}
}
class C2{
	void show2() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey");
		}
	}
}


class T1 extends Thread{
	public void run() {                            //public mode is necessary
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(r);
	}
}
class T2 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey_2");
		
			}
		}
	}
class T3 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey-3");
		}
	}
}
