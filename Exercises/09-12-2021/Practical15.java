//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class Practical15 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
	switch (num) {
	case 1:
		System.out.println("Monday");
		break;

		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wensday");
			break ;
		
		case 4:
			System.out.println("Thursday");
		break ;
		
		case 5:
			System.out.println("Friday");
			break ;
			
		case 6:
			System.out.println("Saturday");
			break ;
			
		case 7:
			System.out.println("Sunday");
			break;
	default:
		break;
	}
}
}
