//Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;
public class Practical14 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Input floating-point number:");
		double num1=scanner.nextDouble();
		System.out.print("Input floating-point another number:"
);
		double num2=scanner.nextDouble();
		if (num1==num2) {
			System.out.println("They are same");
		}
		else {
			System.out.println("They are different");
		}

	}

}
