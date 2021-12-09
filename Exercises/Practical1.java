/*Example 1:
 Input: S = "ABCddE"
Output: "abcdde"
Explanation: A, B, C and E are converted to
a, b, c and E thus all uppercase characters 
of the string converted to lowercase letter.*/

/*Example 2:
 
 Input: S = "LMNOppQQ"
Output: "lmnoppqq"
Explanation: L, M, N, O, and Q are 
converted to l, m, n, o and q thus 
all uppercase characters of the 
string converted to lowercase letter.*/

import java.util.Scanner;
public class Practical1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		// solution1

		String s=sc.next();
		s=s.toLowerCase();
		System.out.println(s);
		
		//solution2
		String v=sc.next();
		v=v.toLowerCase();
		System.out.println(v);
	}

}
