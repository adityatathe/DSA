import java.util.Scanner;

public class ArrayRev {
	
	int[] reversedarray;
	public static int[] arrayReverse(int[] arr) {
	
//		for(int i=0;i<arr.length/2;i++) {
//			int temp=arr[i];
//			arr[i]=arr[arr.length-i-1];
//			arr[arr.length-i-1]=temp;
//			
//			
//		}
		int [] temp=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--) {
			temp[arr.length-i-1]=arr[i];
			
		}
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array");
		size=sc.nextInt();
		int []arr1=new int[size];

	
		
	  System.out.println("Enter the values one by one");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println();
		int [] temp=arrayReverse(arr1);
		
		for(int i:temp) {
			
			System.out.print(i +" \t ");
		}

	}
}
