import java.util.*;

public class LinkedList6 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("shubham");
	element1.add("rajesh");
	element1.add("ajay");
	System.out.println("original linkedlist:\n"+element1);
	LinkedList<String> element2=new LinkedList<String>();
	element2.add("rahual");
	element2.add("tejas");
	System.out.println("after adding element in specific position:");
	element1.addAll(1,element2);
	System.out.println(element1);
}
}
/*OUTPUT:
original linkedlist:
[shubham, rajesh, ajay]
after adding element in specific position:
[shubham, rahual, tejas, rajesh, ajay]
*/