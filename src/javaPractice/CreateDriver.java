package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CreateDriver {
	
		
		static void sep(String str) {

			ArrayList<Integer> arrint = new ArrayList<>();

			for (int i = 0; i <= str.length() - 1; i++) {
               if(Character.isDigit(str.charAt(i)))
				arrint.add((int) (str.charAt(i)-48));

			}
			Collections.sort(arrint, Collections.reverseOrder());
			System.out.println(arrint + " The 3rd largest int is " + arrint.get(2));

		}

		public static void main(String[] args) {
			String str = "My 7phone8 number9 is 123456543";
			sep(str);

		}
	
}
