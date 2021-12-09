import javax.swing.plaf.multi.MultiInternalFrameUI;

/* Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -*/

public class Practical8 {

	public static void main(String[] args) {
		int[][] num=new int[10][10];
		for (int i= 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.printf("-",num[i][j]);
			}
			System.out.println();
		}

	}

}
