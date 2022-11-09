package javaPractice;

public class StringPalindrome {
public static void main(String[] args) {
	String str="kayak";
	String rev="";
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	if(str.equals(rev)) {
		System.out.println("The String is a palindrome");
	}
	else {
		System.out.println("The String is not a palindrome");
	}
}
}
