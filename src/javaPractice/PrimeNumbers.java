package javaPractice;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num;
		for (num = 1; num <= 100; num++) {
			int count = 0;
			if (num == 1) {
			} else {
				for (int i = 2; i <= num - 1; i++) {
					if (num % i == 0) {
						count = count + 1;
					}
				}
				if (count == 0) {
					System.out.println(num + " is a prime number");
				}
			}
		}
	}
}
