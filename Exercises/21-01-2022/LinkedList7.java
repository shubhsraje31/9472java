import java.util.*;
public class LinkedList7 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("shubham");
	element1.add("rajesh");
	element1.add("ajay");
	System.out.println("original linkedlist:\n"+element1);
	element1.add(1,"rahual");
	System.out.println("element add into specific position:\n"+element1);
	}
}
/*OUTPUT:
 original linkedlist:
[shubham, rajesh, ajay]
element add into specific position:
[shubham, rahual, rajesh, ajay]
*/
