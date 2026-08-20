

import java.util.Scanner;

public class Move0ToLast {

	public static int[] movzerotoLast(int[] arr) {
		// TODO Auto-generated method stub

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
			
		}
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		return arr;
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

		int[] temp = movzerotoLast(arr1);
		for (int i : temp) {

			System.out.print(i + " \t ");
		}
	}

}
