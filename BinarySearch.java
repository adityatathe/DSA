import java.util.Scanner;

public class BinarySearch {

	public static int Binary(int[] arr, int t) {

		int low = arr[0];
		int high = arr[arr.length-1];
		int mid=0;
		while (low <= high) {
			 mid = low + (high - low) / 2;

			if (arr[mid] == t) {
				System.out.println("Target found at index : " + mid);
				return mid;
			}
			if (t < arr[mid]) {
				high = mid - 1;

			}
			if (t > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1 ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int size = sc.nextInt();

		System.out.println("Enter the values one by one");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Target: ");
		int target = sc.nextInt();
		
		int found=Binary(arr, target);
		
	}
}
