package javaPractice;

public class SeparateAlphaIntSpecial {
	public static void main(String[] args) {
		String str="abcd1234%$^";
		StringBuffer alpha=new StringBuffer();
		StringBuffer num=new StringBuffer();
		StringBuffer special=new StringBuffer();
		for(int i=0; i<=str.length()-1; i++) {
		if(Character.isAlphabetic(str.charAt(i)))
			alpha.append(str.charAt(i));
		else if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
		else 
			special.append(str.charAt(i));
		
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(special);
	}
}
