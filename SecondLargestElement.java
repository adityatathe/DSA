import java.util.Scanner;

public class SecondLargestElement {

	
	public static int secLargest(int []arr) {
		int largest=arr[0];
		int secLargest=arr[1];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secLargest && arr[i]<largest) {
				secLargest=arr[i];
			}
		}
			
			return secLargest;
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
		
		System.out.println(secLargest(arr1));
		
	}
}
