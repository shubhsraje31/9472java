//Write a Java program to sort a numeric array and a string array
import java.util.Arrays;
public class Practical6 {

	public static void main(String[] args) {
int[] num= {14,16,12,13,11};
String[] nameString= {"shubham","amol","rohit","rajesh"};
Arrays.sort(num);
Arrays.sort(nameString);
System.out.println(Arrays.toString(num));
System.out.println(Arrays.toString(nameString));

	}
}
