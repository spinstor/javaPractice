package javaPractice;

public class DuplicatesString {
	public static void main(String[] args) {
		String str = "java practice programing";

		for (int i = 0; i <= str.length() - 1; i++) {
			int count = 0;
			for (int j = 0; j <= str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(str.charAt(i));
			}

		}
	}
}
