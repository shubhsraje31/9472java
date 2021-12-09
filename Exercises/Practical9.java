// Write a Java program to calculate the average value of array elements.

public class Practical9 {

	public static void main(String[] args) {
		double avg;
		double sum=0;
		double[] num= {44.56,77.51,55.11,66.13,98.68};
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		System.out.println("Avearge value of array is: "+ (avg=sum/num.length));
	
	}
}
