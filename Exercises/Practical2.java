/*Example 3:

Input: S = "GeeksforGeeks"
Output: "skeeGrofskeeG" 
Explanation: Element at first is at last and
last is at first, second is at second last and 
second last is at second position and so on .*/

/*
 Example 4:

Input: S = "ReversE"
Output: "EsreveR"
Explanation: "E" at first and "R" at last and
"e" at second last and "s" at second and
so on . */

import java.util.Scanner;

public class Practical2{

	public static void main(String[] args) {
		// solution1
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		//solution2
		String v=sc.nextLine();
		StringBuffer sv=new StringBuffer(v);
		sv.reverse();
		System.out.println(sv);
	}

}
