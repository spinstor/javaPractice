package javaPractice;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = 1 + random.nextInt(10 - 4);
		System.out.println(nextInt);
	}
}
