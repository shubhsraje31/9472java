//Write a Java program to sum values of an array.

public class Practical7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int[] arr= {91,56,77,65,86,73};
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
