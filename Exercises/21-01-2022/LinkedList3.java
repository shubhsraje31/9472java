import java.util.*;

public class LinkedList3 {
public static void main(String[] args) {
	LinkedList<String> element1=new LinkedList<String>();
	element1.add("shubham");
	element1.add("rajesh");
	element1.add("ajay");
	System.out.println("before insert element into linked list: \n"+element1);
	element1.addFirst("tejas");
	element1.addLast("rahul");
	System.out.println("after insert element into linked list:");
	System.out.println(element1);
}
}
/*
OUTPUT:
before insert element into linked list: 
[shubham, rajesh, ajay]
after insert element into linked list:
[tejas, shubham, rajesh, ajay, rahul]
*/