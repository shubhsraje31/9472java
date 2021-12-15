/* Write  the object Girl and the value of int c=9. Show the resulting outputs.*/
import java.io.*;
interface in1
{
final int c = 9;
void display();
}
class Interface1 implements in1
{
public void display()
{
System.out.println("Tokyo");
}
public static void main (String[] args)
{
Interface1 girl = new Interface1();
girl.display();
System.out.println(c);
}
}
