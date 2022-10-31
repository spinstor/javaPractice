package javaPractice;

public class SeparateIntPrint3rdHighest {
	public static void main(String[] args) {
		String str = "My 7phone8 number9 is 123456543";
		StringBuffer num = new StringBuffer();
		String sortedString = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i));
			}
		}
		// convert stringBuffer to String
		String numonly = num.toString();
		char[] chArr = numonly.toCharArray();
		int temp;
		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr.length; j++) {
				if (chArr[i] > chArr[j]) {
					temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = (char) temp;
				}
			}
		}
		for (int k = 0; k < chArr.length; k++) {
			sortedString = sortedString + chArr[k];
		}
		System.out.println(sortedString);
		System.out.println("Third largest number " + sortedString.charAt(2));
	}
}
