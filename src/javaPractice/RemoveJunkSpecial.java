package javaPractice;

public class RemoveJunkSpecial {
public static void main(String[] args) {
	String str="ab@c#d$e%123$%^&*(";
	StringBuffer alpha=new StringBuffer();
	StringBuffer num=new StringBuffer();
	for(int i=0; i<str.length();i++) {
	if(Character.isAlphabetic(str.charAt(i)))
			alpha.append(str.charAt(i));
	else if
		(Character.isDigit(str.charAt(i)))
	num.append(str.charAt(i));
		
	}
	System.out.print(alpha);
	System.out.print(num);
}
}
