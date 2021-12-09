import java.util.Scanner;

public class Practical5 {
	int length;
	int width;
	int height;
	 public void set_length(int l)
	  {
	      this.length =l;
	  }
	  public void set_width(int w)
	  {
	      this.width= w;
	  }
	  public void set_height(int h)
	  {
	      this.height = h;
	  }
	  public void volume()
	  {
	      System.out.println(length*width*height);
	  
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int length=sc.nextInt();
    int width=sc.nextInt();
    int height=sc.nextInt();
    
    Practical5 cuboid=new Practical5();
    cuboid.set_length(length);
    cuboid.set_width(width);
    cuboid.set_height(height);
    cuboid.volume();
}
}
