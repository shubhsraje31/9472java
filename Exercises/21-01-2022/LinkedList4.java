import java.util.*;

public class LinkedList4 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("shubham");
	element1.add("rajesh");
	element1.add("ajay");
	System.out.println("original linked list:"+element1);
	
	element1.offerFirst("rahul");
	System.out.println("element at the front of the linked list"+element1);
}
}
/*OUTPUT:
 original linked list:[shubham, rajesh, ajay]
element at the front of the linked list[rahul, shubham, rajesh, ajay]
*/
