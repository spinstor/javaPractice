package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
public class SeparateIntPrint3rdHighest2ndMethod {
	public static void main(String[] args) {
		String str = "My 7phone8 number9 is 123456543";
		ArrayList<Character> arrint = new ArrayList<>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i))) {
				arrint.add(str.charAt(i));
			}
		}
		Collections.sort(arrint, Collections.reverseOrder());
		System.out.println(arrint + " The 3rd largest int is " + arrint.get(2));
}
}
