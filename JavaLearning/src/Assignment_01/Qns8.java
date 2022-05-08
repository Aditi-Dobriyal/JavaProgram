package Assignment_01;

public class Qns8 {

	public static void main(String[] args) {
		int arr[]= { 1,2,3,4,5,6,7,8,9};
		Delete obj = new Delete();
		System.out.println("Array before deletion of index=3 is =");
		obj.print(arr);
		obj.del(arr);
		System.out.println("Array after deletion of index=3 is =");
		obj.print(arr);
		

	}

}
class Delete {
	
	 void del(int arr[]) {
		 int n=arr.length;
		 int i;
		 for(i=3;i<n-1;i++) {
			 arr[i]=arr[i+1];
		 }
		 arr[n-1]=0;
		
	 }
	 void print(int arr[]) {
		 int n=arr.length;
		
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		
	}
	 }
}