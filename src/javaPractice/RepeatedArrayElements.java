package javaPractice;

public class RepeatedArrayElements {
	public static void main(String[] args) {
		int[] arr = { 12, 4, 56, 53, 12, 56, 22, 22, 7, 77 };
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == x) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
