package javaPractice;

public class RemoveSpaces {
public static void main(String[] args) {
	String str="all spaces need to be removed";
	String[] arr=str.split(" ");
	for(int i=0; i<arr.length-1;i++) {
		System.out.print(arr[i]);
	}
}
}
