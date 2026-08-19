

import java.util.Scanner;

public class ElementCount {
	
	public static int count(int[] arr, int target) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
				
			}
			
			
		}
		return count;
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
		
		int target=sc.nextInt();
		
		System.out.println("\t "+count(arr1,target));
		
	
		
	}
}
