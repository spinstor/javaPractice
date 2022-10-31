package javaPractice;

public class LargestArrayNumber {
	public static void main(String[] args) {
	
int[] arr= {20,2,3,10,4,5,6,7};
int largest=arr[0];
for(int i=1;i<arr.length;i++) {
if(largest<arr[i]) {
	largest=arr[i];
}
}
System.out.println(largest);
}
}

