package javaPractice;

public class MultiplyArrayElements {
public static void main(String[] args) {
	int[] arr= {2,3,6};
	int fact=1;
	for(int i=0; i<arr.length;i++)
	{
		fact=fact*arr[i];
	}
	System.out.println(fact);
	}
}

