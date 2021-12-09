import java.util.Iterator;

//Write a Java program to test if an array contains a specific value.

public class Practical10 {
	public static Boolean contains(int[] arr,int item) {
		for(int n:arr) {
			if(n==item) {
			return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] my_array1= {2012,2014,2016,2017,2018,2022,2026,2050};
		System.out.println(contains(my_array1, 2016));
	      System.out.println(contains(my_array1, 2015));
		}

}
