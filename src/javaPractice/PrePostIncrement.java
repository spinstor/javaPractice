package javaPractice;

public class PrePostIncrement {
	public static void main(String[] args) {
		//pre and post increment works only when we use this operator along other
		//operators in the same statement, it does not work with flow control
		//statements like if() or for() loops
		int i = 1;
		int result = 5 + ++i;
		int result2 = 5 + i++;
		System.out.println(result);
		System.out.println(result2);
	}
}