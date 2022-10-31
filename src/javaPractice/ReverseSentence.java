package javaPractice;

public class ReverseSentence {
	public static void main(String[] args) {
String str="Ny name is naveen";
String a[]=str.split(" ");
for(int i=a.length-1; i>=0;i--) {
	System.out.print(a[i]+ " ");
}
	}
}
