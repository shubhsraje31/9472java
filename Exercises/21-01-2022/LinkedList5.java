import java.util.LinkedList;

public class LinkedList5 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("shubham");
	element1.add("rajesh");
	element1.add("ajay");
	System.out.println("original linked list:"+element1);
	
	element1.offerLast("rahul");
	System.out.println("element at the last of the linked list"+element1);
}
}
/*OUTPUT:
original linked list:[shubham, rajesh, ajay]
element at the last of the linked list[shubham, rajesh, ajay, rahul]
*/