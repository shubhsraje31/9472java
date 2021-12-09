/*
 Example 5:
Input:
1
2 4

Output:
6
8
20
 */
import java.util.Scanner;

class Cls1
{
	
    void add(int p,int q){
        System.out.println(p+q);
    }
}

class Cls2 extends Cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    
    void task(int p,int q)
	{
		System.out.println((p*p)+(q*q));
	}
    
}


public class Practical3 extends Cls2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
		Cls2 math=new Cls2();
		math.add(p,q);
		math.mul(p,q);
		math.task(p,q);
		

	}

}
