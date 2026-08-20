import java.util.Scanner;

public class RemoveDuplicates {
	
	

	
	public static int removeDuplicates(int[] arr) {

	    if(arr.length == 0) {
	        return 0;
	    }

	    int j = 0;

	    for(int i = 1; i < arr.length; i++) {

	        if(arr[i] != arr[j]) {
	            j++;
	            arr[j] = arr[i];
	        }
	    }

	    return j + 1;
	}
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array");
		size = sc.nextInt();
		int[] arr1 = new int[size];

		System.out.println("Enter the values one by one");
		for (int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println(removeDuplicates(arr1));
    }
}
